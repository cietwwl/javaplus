//[奖励]在线奖励package cn.mxz;public class OnlineTemplet {	/** 	 * id 	 */	private int id;	/** 	 * 在线时长（秒） 	 */	private int duration;	/** 	 * 奖励物品 	 */	private String awards;	/**	 * id	 */	void setId(int id) {		this.id = id;	}	/**	 * id	 */	public int getId() {		return this.id;	}	/**	 * 在线时长（秒）	 */	void setDuration(int duration) {		this.duration = duration;	}	/**	 * 在线时长（秒）	 */	public int getDuration() {		return this.duration;	}	/**	 * 奖励物品	 */	void setAwards(String awards) {		this.awards = awards;	}	/**	 * 奖励物品	 */	public String getAwards() {		return this.awards;	}}