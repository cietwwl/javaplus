//[奇遇]24[保护妲己]三日五日奖励库package cn.mxz;public class CustodianGuardLibraryTemplet {	/** 	 * 獎勵id 	 */	private int id;	/** 	 * 道具名稱 	 */	private String propNeame;	/** 	 * 物品類型（1裝備 2主動技能 3被動技能 4陣法） 	 */	private int type;	/** 	 * 品階 	 */	private int step;	/** 	 * 權重 	 */	private int weight;	/** 	 * 開啟模組id 	 */	private int modulesId;	/** 	 * 開出概率（數值看的） 	 */	private float probability;	/**	 * 獎勵id	 */	void setId(int id) {		this.id = id;	}	/**	 * 獎勵id	 */	public int getId() {		return this.id;	}	/**	 * 道具名稱	 */	void setPropNeame(String propNeame) {		this.propNeame = propNeame;	}	/**	 * 道具名稱	 */	public String getPropNeame() {		return this.propNeame;	}	/**	 * 物品類型（1裝備 2主動技能 3被動技能 4陣法）	 */	void setType(int type) {		this.type = type;	}	/**	 * 物品類型（1裝備 2主動技能 3被動技能 4陣法）	 */	public int getType() {		return this.type;	}	/**	 * 品階	 */	void setStep(int step) {		this.step = step;	}	/**	 * 品階	 */	public int getStep() {		return this.step;	}	/**	 * 權重	 */	void setWeight(int weight) {		this.weight = weight;	}	/**	 * 權重	 */	public int getWeight() {		return this.weight;	}	/**	 * 開啟模組id	 */	void setModulesId(int modulesId) {		this.modulesId = modulesId;	}	/**	 * 開啟模組id	 */	public int getModulesId() {		return this.modulesId;	}	/**	 * 開出概率（數值看的）	 */	void setProbability(float probability) {		this.probability = probability;	}	/**	 * 開出概率（數值看的）	 */	public float getProbability() {		return this.probability;	}}