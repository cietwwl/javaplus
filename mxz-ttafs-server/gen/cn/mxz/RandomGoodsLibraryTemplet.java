//[道具]通用随机物品库package cn.mxz;public class RandomGoodsLibraryTemplet {	/** 	 * 唯一ID 	 */	private int idfen;	/** 	 * 物品id 	 */	private String reward;	/** 	 * 物品名称 	 */	private String name;	/** 	 * 物品类型(0基本奖励 1通用道具 2阵法残片 3技能残片 4装备卷轴 5装备材料 6技能成品 7阵法成品 8神将魂魄 9成品装备 10神將） 	 */	private int type;	/** 	 * 物品品阶 	 */	private int quality;	/** 	 * 掉落权重 	 */	private int weight;	/** 	 * 随机库id 	 */	private String range;	/** 	 * 开启模块id 	 */	private int modulesId;	/** 	 * 道具数量最小值 	 */	private int propMin;	/** 	 * 道具数量最大值 	 */	private int propMax;	/**	 * 唯一ID	 */	void setIdfen(int idfen) {		this.idfen = idfen;	}	/**	 * 唯一ID	 */	public int getIdfen() {		return this.idfen;	}	/**	 * 物品id	 */	void setReward(String reward) {		this.reward = reward;	}	/**	 * 物品id	 */	public String getReward() {		return this.reward;	}	/**	 * 物品名称	 */	void setName(String name) {		this.name = name;	}	/**	 * 物品名称	 */	public String getName() {		return this.name;	}	/**	 * 物品类型(0基本奖励 1通用道具 2阵法残片 3技能残片 4装备卷轴 5装备材料 6技能成品 7阵法成品 8神将魂魄 9成品装备 10神將）	 */	void setType(int type) {		this.type = type;	}	/**	 * 物品类型(0基本奖励 1通用道具 2阵法残片 3技能残片 4装备卷轴 5装备材料 6技能成品 7阵法成品 8神将魂魄 9成品装备 10神將）	 */	public int getType() {		return this.type;	}	/**	 * 物品品阶	 */	void setQuality(int quality) {		this.quality = quality;	}	/**	 * 物品品阶	 */	public int getQuality() {		return this.quality;	}	/**	 * 掉落权重	 */	void setWeight(int weight) {		this.weight = weight;	}	/**	 * 掉落权重	 */	public int getWeight() {		return this.weight;	}	/**	 * 随机库id	 */	void setRange(String range) {		this.range = range;	}	/**	 * 随机库id	 */	public String getRange() {		return this.range;	}	/**	 * 开启模块id	 */	void setModulesId(int modulesId) {		this.modulesId = modulesId;	}	/**	 * 开启模块id	 */	public int getModulesId() {		return this.modulesId;	}	/**	 * 道具数量最小值	 */	void setPropMin(int propMin) {		this.propMin = propMin;	}	/**	 * 道具数量最小值	 */	public int getPropMin() {		return this.propMin;	}	/**	 * 道具数量最大值	 */	void setPropMax(int propMax) {		this.propMax = propMax;	}	/**	 * 道具数量最大值	 */	public int getPropMax() {		return this.propMax;	}}