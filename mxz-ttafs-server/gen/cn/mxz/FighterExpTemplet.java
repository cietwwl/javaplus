//[神将]经验配置package cn.mxz;public class FighterExpTemplet {	/** 	 * 等级 	 */	private int level;	/** 	 * (主角神将)从当前等级升到下级所需经验(作为分母显示) 	 */	private int player;	/** 	 * (猪脚神将)升到当前等级所需总经验 	 */	private int playerSum;	/**	 * 等级	 */	void setLevel(int level) {		this.level = level;	}	/**	 * 等级	 */	public int getLevel() {		return this.level;	}	/**	 * (主角神将)从当前等级升到下级所需经验(作为分母显示)	 */	void setPlayer(int player) {		this.player = player;	}	/**	 * (主角神将)从当前等级升到下级所需经验(作为分母显示)	 */	public int getPlayer() {		return this.player;	}	/**	 * (猪脚神将)升到当前等级所需总经验	 */	void setPlayerSum(int playerSum) {		this.playerSum = playerSum;	}	/**	 * (猪脚神将)升到当前等级所需总经验	 */	public int getPlayerSum() {		return this.playerSum;	}}