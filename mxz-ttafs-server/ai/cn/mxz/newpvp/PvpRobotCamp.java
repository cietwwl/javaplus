package cn.mxz.newpvp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cn.javaplus.util.Util;
import cn.mxz.FighterTemplet;
import cn.mxz.FighterTempletConfig;
import cn.mxz.SnatchDifficultyTemplet;
import cn.mxz.SnatchDifficultyTempletConfig;
import cn.mxz.base.exception.SureIllegalOperationException;
import cn.mxz.base.world.NickManager;
import cn.mxz.base.world.WorldFactory;
import cn.mxz.city.City;
import cn.mxz.dogz.Dogz;
import cn.mxz.equipment.JiaPlayer;
import cn.mxz.equipment.RobotHero;
import cn.mxz.fighter.Fighter;
import cn.mxz.formation.PlayerCamp;
import cn.mxz.pvp.SuperCamp;
import cn.mxz.user.Player;
import cn.mxz.user.team.god.Hero;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/**
 * 机器人阵容
 *
 * @author 林岑
 *
 */
public class PvpRobotCamp implements PlayerCamp {

	private PlayerCamp			selected;

	private Map<Integer, Hero>	fighters	= Maps.newHashMap();


	private String	nick;

	private JiaPlayer jiaPlayer;

	private double x;

	@Override
	public String getUserId() {
		return jiaPlayer.getId();
	}
	
	/**
	 * @param selected
	 * @param minCapacityX
	 *            新属性 : 旧属性 最小比值
	 * @param maxCapacityX
	 *            新属性 : 旧属性 最大比值
	 */
	public PvpRobotCamp(PlayerCamp selected, double minCapacityX, double maxCapacityX) {
		this.selected = new SuperCamp(selected, 1);
		List<Hero> fs = selected.getFighters();
		List<Integer> pos = Lists.newArrayList(1, 3, 4, 5, 7);
		Util.Collection.upset(pos);
		Iterator<Integer> it = pos.iterator();

		NickManager nm = WorldFactory.getWorld().getNickManager();
		nick = nm.getRandomNick();
		
		x = Util.Random.get(minCapacityX, maxCapacityX);
		for (Hero hero : fs) {
			Hero h = buildNewHero(hero, x);
			fighters.put(it.next(), h);
		}
		
		int mainFighterTypeId = getMainFighterTypeId();
		Player player = selected.getCity().getPlayer();
		jiaPlayer = new JiaPlayer(player, mainFighterTypeId, nick, player.getId());
		jiaPlayer.setId(Util.Random.getRandomString(32));

	}
	
	public JiaPlayer getJiaPlayer() {
		return jiaPlayer;
	}
	
	private int getMainFighterTypeId() {
		for (Hero h : fighters.values()) {
			FighterTemplet t = FighterTempletConfig.get(h.getTypeId());
			int c = t.getCategory();
			if(c == 3) {
				return t.getId();
			}
		}
		return 300001;
	}


	private List<FighterTemplet> randomPlayer() {
		return FighterTempletConfig.findByCategory(3);
	}

	/**
	 * 
	 * @param hero
	 * @param x 战斗力比例
	 * @return
	 */
	private Hero buildNewHero(Hero hero, double x) {

		SnatchDifficultyTemplet st = findDif(x);
		
		int tid = hero.getTypeId();

		List<FighterTemplet> all;

		if (hero.isPlayer()) {
			all = randomPlayer();
		} else {
			all = random(st);
		}
		
		Set<Integer> keySet = getFighterIds(fighters);
		remove(keySet, all);
		
		Iterator<FighterTemplet> it = all.iterator();
		while (it.hasNext()) {
			FighterTemplet t = it.next();
			String godType = t.getGodType();
			if(!godType.equals("1") && t.getCategory() != 3) {

				it.remove();
			}
		}

//		Debuger.debug("PvpRobotCamp.buildNewHero()" +nick + " --- " + tid);
//		if(fighters.containsKey(tid)) {
//			throw new RuntimeException();
//		}
		
		if (all.isEmpty()) {
			return new RobotHero(hero, x, nick, tid);
		} else {
			int randomId = Util.Random.getRandomOne(all).getId();
//			Debuger.debug("PvpRobotCamp.buildNewHero()" + nick + " --- " + randomId);
			return new RobotHero(hero, x, nick, randomId);
		}
	}
	private Set<Integer> getFighterIds(Map<Integer, Hero> fighters2) {
		Collection<Hero> all = fighters.values();
		Set<Integer> ls = Sets.newHashSet();;
		
		for (Hero hero : all) {
			ls.add(hero.getTypeId());
		}
		return ls;
	}

	private List<FighterTemplet> random(SnatchDifficultyTemplet st) {
		List<FighterTemplet> all = findAll(st);
		
		Set<Integer> keySet = getFighterIds(fighters);
		
		remove(keySet, all);

		Iterator<FighterTemplet> it = all.iterator();
		while (it.hasNext()) {
			FighterTemplet t = it.next();
			String godType = t.getGodType();
			if (t.getCategory() == 3 || !godType.equals("1")) {
				it.remove();
			}
		}
		return all;
	}
	
	private List<FighterTemplet> findAll(SnatchDifficultyTemplet st) {
		List<Integer> steps = Util.Collection.getIntegers(st.getStepScope());
		List<FighterTemplet> ls = Lists.newArrayList();
		for (Integer step : steps) {
			ls.addAll(FighterTempletConfig.findByStep(step));
		}
		return ls;
	}

	private SnatchDifficultyTemplet findDif(double x) {
		List<SnatchDifficultyTemplet> all = SnatchDifficultyTempletConfig
				.getAll();
		for (SnatchDifficultyTemplet s : all) {
			if (s.getMin() <= x && x <= s.getMax()) {
				return s;
			}
		}
		throw new NullPointerException("" + x);
	}
	private void remove(Set<Integer> keySet, List<FighterTemplet> all) {
		Iterator<FighterTemplet> it = all.iterator();
		while (it.hasNext()) {
			FighterTemplet ft = it.next();
			if (keySet.contains(ft.getId())) {
				it.remove();
			}
		}
	}


	@Override
	public List<Hero> getFighters() {
		return Lists.newArrayList(fighters.values());
	}

	@Override
	public int getPosition(Fighter f) {
		Set<Entry<Integer, Hero>> s = fighters.entrySet();
		for (Entry<Integer, Hero> e : s) {
			Hero h = e.getValue();
			if (h.equals(f)) {
				return e.getKey();
			}
		}
		throw new SureIllegalOperationException("阵容中不包含这个战士:" + f);
	}

	@Override
	public Fighter get(int position) {
		return fighters.get(position);
	}

	@Override
	public int getShenJia() {
//		int all = 0;
//		for (Hero h : fighters.values()) {
//			int base = h.getShenJiaBase();
//			all += base;
//		}
//		return all;
		
		return (int) (selected.getShenJia() * x);
	}

	@Override
	public City getCity() {
		return selected.getCity();
	}

	@Override
	public Fighter getMainFighter() {
		for (Hero h : fighters.values()) {
			if(h.isPlayer()) {
				return h;
			}
		}
		return null;
	}

	@Override
	public Dogz getDogz() {
		return null;
	}


}
