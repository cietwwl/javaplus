package cn.mxz.battle.skill.attacktype;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.mxz.battle.BattleCamp;
import cn.mxz.battle.skill.AttackMode;
import cn.mxz.battle.skill.FighterBeAttack;
import cn.mxz.fighter.Fighter;

@Component("attackType8")

public class A8 implements AttackType {


	@Override
	public List<FighterBeAttack> getFighters(BattleCamp ans, int position) {

		List<Fighter> lives = ans.getLives();

		cn.javaplus.util.Util.Collection.upset(lives);

		List<Fighter> sub = cn.javaplus.util.Util.Collection.sub(lives, 2);

		return AttackTypeUtil.buildList(sub);
	}

	@Override
	public AttackMode getAttakMode() {
		return AttackMode.REDUCE;
	}

	@Override
	public boolean isReleaseToFriend() {
		return false;
	}

}
