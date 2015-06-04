//package cn.mxz.findfighter;////import java.util.ArrayList;//import java.util.Date;//import java.util.List;////import message.S;//import cn.javaplus.common.util.Util;//import cn.javaplus.common.util.time.Time;//import cn.mxz.GodTypeTemplet;//import cn.mxz.GodTypeTempletConfig;//import cn.mxz.base.config.ServerConfig;//import cn.mxz.base.exception.IllegalOperationException;//import cn.mxz.base.exception.OperationFaildException;//import cn.mxz.city.PlayerProperty;//import cn.mxz.user.City;//import cn.mxz.user.team.god.Hero;//import cn.mxz.util.counter.CounterKey;//import cn.mxz.util.counter.UserCounter;//import cn.mxz.util.needs.NeedsChecker;//import cn.mxz.util.needs.NeedsFactory;////import com.google.common.collect.Lists;////public class FighterFinderImpl implements FighterFinder {////	private GodTypeTemplet	temp;////	private City	city;////	public FighterFinderImpl(City city, GodTypeTemplet temp) {////		this.city = city;////		this.temp = temp;//	}////	@Override//	public List<Hero> find(int times) {////		List<FinderBean> ps = build();////		List<Hero> find = Lists.newArrayList();////		for (int i = 0; i < times; i++) {////			FinderBean bean = random(ps);////			find.addAll( bean.find(1));//		}////		return find;//	}////	@Override//	public void check(int times) {////		//		int size = city.getTeam().getFighterInDepot().size();//		//		if(size + times > 100) {//		//..//		//			throw new OperationFaildException(S.S10270);     -------throw new OperationFaildException(S.S10271);     -------throw new (S.S10287);     -------该寻仙方式已过期//		//		}////		if(isSingle()) {////			times = 1;//		}////		checkTimes(temp, times);////		checkLimit(temp);			//历史抽取次数限制//////		new TimeChecker().checkTime(temp); 	// 时间段检查////		if(isDeprecated()) {////			throw new (S.S10288);     -------该寻仙方式已过期//		}//	}////	@Override//	public void reduce(int times) {////		int freeToday = getFreeTimesToday();////		NeedsChecker c = buildNeedsChecker(temp, freeToday, times);////		discount(c, times, temp);////		c.deduct(city.getPlayer());//////		int t = times;////		if(isSingle()) {////			t = 1;//		}////		addCounter(CounterKey.FIND_FIGHTER_TIMES_BY_WAY, t, temp.getWayId());////		addCounter(CounterKey.FIND_FIGHTER_TIMES_BY_ID, t, temp.getId());//	}////	private List<FinderBean> build() {////		List<FinderBean> list = new ArrayList<FinderBean>();////		String pty = temp.getProbability();////		String[] split = pty.split("\\|");////		for (String string : split) {////			if(string.startsWith("q")) {////				list.add(new QFinder(city, string, temp));////			} else if(string.startsWith("t")) {////				list.add(new TFinder(city, string));////			} else if(string.startsWith("s")) {////				list.add(new SFinder(city, string));//			}//		}////		return list;//	}////	private FinderBean random(List<FinderBean> ps) {////		int index = Util.getRandomIndex(buildPs(ps));////		return ps.get(index);//	}////	private int[] buildPs(List<FinderBean> ps) {////		int [] a = new int[ps.size()];////		for (int i = 0; i < a.length; i++) {////			a[i] = ps.get(i).getProbability();//		}////		return a;//	}////	@Override//	public int getId() {////		return temp.getId();//	}////	@Override//	public int getRemainSec() {////		if(isDeprecated() || !hasTime()) {////			return 0;//		}////		TimeChecker timeChecker = new TimeChecker();////		Date end = timeChecker.getEndTime(temp);////		long endTime = end.getTime();////		long time = endTime - System.currentTimeMillis();////		return (int) (time < 0 ? 0 : time / 1000);//	}////	@Override//	public boolean isDeprecated() {////		if(!inServerOpenTime()) {////			return true;//		}////		if(!isOpen()) {////			return true;//		}////		int remainLimit = getRemainLimit();////		if(remainLimit <= 0) {////			return true;//		}////		if(!hasTime()) {////			return false;//		}////		TimeChecker timeChecker = new TimeChecker();////		try {////			timeChecker.checkTime(temp);////			return false;////		} catch (Exception e) {////			return true;//		}////	}////	/**//	 * 必须要指定的另外一个寻仙功能关闭后, 这个寻仙方式才开启//	 * @return//	 *///	private boolean isOpen() {////		String temps = temp.getOpenCondition1();////		String[] split = temps.split(",");////		for (String id : split) {////			if(id.isEmpty()) {////				continue;//			}////////			if(!isDeprecated(id)) {////				return false;//			}//		}////		return true;//	}////	private boolean isDeprecated(String id) {////		int c = new Integer(id);////		GodTypeTemplet temp = GodTypeTempletConfig.get(c);////		if(temp == null) {////			return true;//		}////		FighterFinder f = FindFighterFactory.getFinder(city, c);////		return f.isDeprecated();////	}////	/**//	 * 是否在开服时间范围内//	 * @return//	 *///	private boolean inServerOpenTime() {////		int openTime = temp.getOpenTime();////		int endTime = temp.getEndTime();////		if(openTime == 0 && endTime == 0) {////			return true;//		}////		long time = ServerConfig.getServerOpenTime();////		long now = System.currentTimeMillis();////		long alive = now - time;////		alive /= Time.MILES_ONE_HOUR;////		return alive >= openTime && alive < endTime;//	}////	/**//	 * 是否有时间限制//	 * @return//	 *///	private boolean hasTime() {////		return !temp.getTimeOpen().trim().isEmpty() && !temp.getTimeClose().trim().isEmpty();//	}////	@Override//	public int getFindTimesMax() {////		NeedsChecker n = NeedsFactory.getNeedsCheckerImpl2(temp);////		int deductTimesMax = n.getDeductTimesMax(city);////		return deductTimesMax;//	}////	@Override//	public List<Integer> getTimesSelectedAble() {////		String times = temp.getTimes();////		String[] split = times.trim().split(",");////		List<Integer> ls = new ArrayList<Integer>();////		for (String v : split) {////			int n = new Integer(v.trim());////			if(enouph(n)) {////				ls.add(n);//			}//		}////		if(ls.isEmpty()) {////			return ls;//		}////		return subMaxAndMin(ls);//	}////	/**//	 * 是否可以寻N次//	 * @param n//	 * @return//	 *///	private boolean enouph(int n) {////		NeedsChecker nn = NeedsFactory.getNeedsCheckerImpl2(temp);////		int timesNow = nn.getDeductTimesMax(city) + getFreeTimesToday();////		return timesNow >= n;//	}////	private List<Integer> subMaxAndMin(List<Integer> set) {////		List<Integer> list = new ArrayList<Integer>();////		int max = Util.getMax(set);////		int min = Util.getMin(set);////		if(max == min) {////			list.add(min);////		} else {////			list.add(min);////			list.add(max);//		}////		return list;////	}////	@Override//	public boolean isSingle() {////		return !temp.getTimes().contains(",");//	}////	/**//	 * 次数正确性检查//	 * @param temp//	 * @param times//	 *///	private void checkTimes(GodTypeTemplet temp, int times) {////		if(isSingle() && times == 1) {////			return;//		}////		String [] scope = temp.getTimes().trim().split(",");////		for (String t : scope) {////			Integer v = new Integer(t);////			if(v.equals(times)) {////				return;//			}//		}////		throw new IllegalOperationException("次数错误!"  + times);//	}////	/**//	 *//	 * @param temp//	 * @param times//	 *///	private void checkLimit(GodTypeTemplet temp) {////		int remainLimit = getRemainLimit();////		if(remainLimit <= 0) {////			throw new OperationFaildException(S.S10109, temp.getLimit());//		}//	}////	private int getRemainLimit() {////		int limit = temp.getLimit();////		if(limit == -1) {////			return Integer.MAX_VALUE;//		}//////		UserCounter userCounterHistory = city.getUserCounterHistory();////		int his = userCounterHistory.get(CounterKey.FIND_FIGHTER_TIMES_BY_WAY, temp.getWayId());////		return limit - his;//	}////	private void discount(NeedsChecker c, int times, GodTypeTemplet temp) {////		String discount = temp.getDiscount();////		if(discount.trim().isEmpty()) {////			return;//		}////		String[] split = discount.split("\\|");////		for (String string : split) {////			String[] data = string.split(":");////			int t = new Integer(data[0]);////			if(t == times) {////				c.discount(new Float(data[1]));////				break;//			}//		}////		//		9:0.96|10:0.9//		//		9:0.96|10:0.9//		//		9:0.96|10:0.9//		//		9:0.96|10:0.9//	}////	private NeedsChecker buildNeedsChecker(GodTypeTemplet temp, int freeToday, int times) {////		int need = times - freeToday;////		return NeedsFactory.getNeedsCheckerImpl2(temp, need);//	}//////	@Override//	public int getFreeTimesToday() {////		UserCounter userCounter = city.getUserCounter();////		int count = userCounter.get(CounterKey.FIND_FIGHTER_TIMES_BY_ID, temp.getId());////		int freeNumber = temp.getFreeNumber();////		int a = freeNumber - count;////		return a < 0 ? 0 : a;//	}////	private void addCounter(CounterKey id, int add, Object... args) {////		UserCounter userCounter = city.getUserCounter();////		userCounter.add(id, add, args);////		UserCounter userCounterHistory = city.getUserCounterHistory();////		userCounterHistory.add(id, add, args);//	}////	@Override//	public int getCount() {////		//		1	1	地仙令----可寻多少个//		//		2	2	天仙令----可寻多少个//		//		3	3	金仙令-----可寻多少个//		//		4	4	神之召唤----------------可寻多少个//		//		5	5	1元必得雷震子//		//		6	7	累进寻仙1//		//		7	8	累进寻仙2//		//		8	9	累进寻仙3//		//		9	10	累进寻仙4//		//		10	11	累进寻仙4//		//		11	12	活动寻仙-------------------当前拥有好多个//		//		12	12	精英神将//		//		13	12	精英神将//		//		14	12	精英神将//		//		15	13	天降神兵：4连抽//		//		16	13	天降神兵：6连抽//		//		17	13	天降神兵：9连抽//		//		18	13	天降神兵：12连抽//		//		19	14	神秘仙令//		//		20	14	神秘仙令//		//		21	15	天神下凡：3连抽//		//		22	15	天神下凡：10连抽//		//		23	15	天神下凡：12连抽////		switch (getId()) {//		case 1://		case 2://		case 3://		case 4://			return getFindTimesMax();//		case 11://			return city.getPlayer().get(PlayerProperty.ACTIVITY1);//		case 5://		case 6://		case 7://		case 8://		case 9://		case 10://		case 12://		case 13://		case 14://		case 15://		case 16://		case 17://		case 18://		case 19://		case 20://		case 21://		case 22://		case 23://			return city.getPlayer().get(PlayerProperty.GOLD);////		default://			return getFindTimesMax();//		}//	}////	@Override//	public int getItemUnderCount() {////		int count = getFreeTimesToday();////		switch(temp.getId()) {////		case 1://			count += city.getPlayer().get(PlayerProperty.DI_XIAN_LING);//			break;////		case 2://			count += city.getPlayer().get(PlayerProperty.TIAN_XIAN_LING);//			break;////		case 3://			count += city.getPlayer().get(PlayerProperty.JIN_XIAN_LING);//			break;////		case 4://			count +=  0;//			break;////		case 11://			count += city.getPlayer().get(PlayerProperty.ACTIVITY1);//			break;////		default ://			count += getNow();//			break;//		}////		return count;//	}////	private int getNow() {////		if(temp.getId() == 11) {////			return city.getPlayer().get(PlayerProperty.ACTIVITY1);//		}////		int count = new Integer(temp.getTimes().replaceAll(",.*", ""));////		return new Integer(temp.getNeeds().split(",")[1]) * count;//	}//}