//[奇遇]24[每日首冲]每日首冲物品库package cn.mxz;public class EverydayChargeTemplet {	/** 	 * 獎勵id 	 */	private int id;	/** 	 * 道具名稱 	 */	private String propNeame;	/** 	 * 獎勵內容(道具id：最小數量，最大數量） 	 */	private String awards;	/** 	 * 權重 	 */	private int weight;	/** 	 * 開啟模組id 	 */	private int modulesId;	/**	 * 獎勵id	 */	void setId(int id) {		this.id = id;	}	/**	 * 獎勵id	 */	public int getId() {		return this.id;	}	/**	 * 道具名稱	 */	void setPropNeame(String propNeame) {		this.propNeame = propNeame;	}	/**	 * 道具名稱	 */	public String getPropNeame() {		return this.propNeame;	}	/**	 * 獎勵內容(道具id：最小數量，最大數量）	 */	void setAwards(String awards) {		this.awards = awards;	}	/**	 * 獎勵內容(道具id：最小數量，最大數量）	 */	public String getAwards() {		return this.awards;	}	/**	 * 權重	 */	void setWeight(int weight) {		this.weight = weight;	}	/**	 * 權重	 */	public int getWeight() {		return this.weight;	}	/**	 * 開啟模組id	 */	void setModulesId(int modulesId) {		this.modulesId = modulesId;	}	/**	 * 開啟模組id	 */	public int getModulesId() {		return this.modulesId;	}}