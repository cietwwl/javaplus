//[道具]消耗品package cn.mxz;public class ConsumableTemplet implements PropTemplet,RandomReward,PrizeInExcel {	/** 	 * id 	 */	private int id;	/** 	 * 名稱 	 */	private String name;	/** 	 * 後端名稱 	 */	private String endName;	/** 	 * 品質 	 */	private int quality;	/** 	 * 前端品階（道具類的統一欄位，等價這裡的品質） 	 */	private int stepAgo;	/** 	 * 當寶箱出現在背包時 是否提示他打開 	 */	private int canOpen;	/** 	 * 圖示資源id 	 */	private int resid;	/** 	 * 是否是初始載入頭像資源（1為是；0為否） 	 */	private int prestrain;	/** 	 * 道具類型 	 */	private int toolUseType;	/** 	 * 是否可以主動使用（1可以主動使用 0不主動使用） 	 */	private int accordUse;	/** 	 * 是否放入背包（0不放 1放入 ） 	 */	private int backpack;	/** 	 * 是否保留（0不保留 1保留） 	 */	private int retain;	/** 	 * 識別id 	 */	private int spot;	/** 	 * 地圖上遇到後（獲得後）, 是否直接開啟 	 */	private int isOpen;	/** 	 * 消耗品類型（0-祝福禮包，1-隨機寶箱，2-特權禮包 3-商城道具 4-裝備禮包 ） 	 */	private int type;	/** 	 * 使用後日誌記錄 	 */	private String explain;	/** 	 * 開啟所需 	 */	private String needs;	/** 	 * 使用後的獎勵 	 */	private String awards;	/** 	 * 各個獎勵出現的概率 	 */	private String weight;	/** 	 * 使用後,獎勵獲得數隨機下限 	 */	private int countMin;	/** 	 * 使用後,獎勵獲得數隨機上限 	 */	private int countMax;	/** 	 * 獲得物品數量加成最小倍數 	 */	private int additionMin;	/** 	 * 獲得物品數量加成最大倍數 	 */	private int additionMax;	/** 	 * 開啟後必得物品 	 */	private String certainly;	/** 	 * 使用等級 	 */	private int rank;	/** 	 * 疊加數量 	 */	private int addUp;	/** 	 * 物品用途 	 */	private String purpose;	/** 	 * 物品來源 	 */	private String source;	/** 	 * URL 	 */	private String url;	/** 	 * 買入日誌說明 	 */	private String logExplain4Buy;	/** 	 * 描述 	 */	private String description;	/** 	 * 資源格式 	 */	private String format;	/**	 * id	 */	void setId(int id) {		this.id = id;	}	/**	 * id	 */	public int getId() {		return this.id;	}	/**	 * 名稱	 */	void setName(String name) {		this.name = name;	}	/**	 * 名稱	 */	public String getName() {		return this.name;	}	/**	 * 後端名稱	 */	void setEndName(String endName) {		this.endName = endName;	}	/**	 * 後端名稱	 */	public String getEndName() {		return this.endName;	}	/**	 * 品質	 */	void setQuality(int quality) {		this.quality = quality;	}	/**	 * 品質	 */	public int getQuality() {		return this.quality;	}	/**	 * 前端品階（道具類的統一欄位，等價這裡的品質）	 */	void setStepAgo(int stepAgo) {		this.stepAgo = stepAgo;	}	/**	 * 前端品階（道具類的統一欄位，等價這裡的品質）	 */	public int getStepAgo() {		return this.stepAgo;	}	/**	 * 當寶箱出現在背包時 是否提示他打開	 */	void setCanOpen(int canOpen) {		this.canOpen = canOpen;	}	/**	 * 當寶箱出現在背包時 是否提示他打開	 */	public int getCanOpen() {		return this.canOpen;	}	/**	 * 圖示資源id	 */	void setResid(int resid) {		this.resid = resid;	}	/**	 * 圖示資源id	 */	public int getResid() {		return this.resid;	}	/**	 * 是否是初始載入頭像資源（1為是；0為否）	 */	void setPrestrain(int prestrain) {		this.prestrain = prestrain;	}	/**	 * 是否是初始載入頭像資源（1為是；0為否）	 */	public int getPrestrain() {		return this.prestrain;	}	/**	 * 道具類型	 */	void setToolUseType(int toolUseType) {		this.toolUseType = toolUseType;	}	/**	 * 道具類型	 */	public int getToolUseType() {		return this.toolUseType;	}	/**	 * 是否可以主動使用（1可以主動使用 0不主動使用）	 */	void setAccordUse(int accordUse) {		this.accordUse = accordUse;	}	/**	 * 是否可以主動使用（1可以主動使用 0不主動使用）	 */	public int getAccordUse() {		return this.accordUse;	}	/**	 * 是否放入背包（0不放 1放入 ）	 */	void setBackpack(int backpack) {		this.backpack = backpack;	}	/**	 * 是否放入背包（0不放 1放入 ）	 */	public int getBackpack() {		return this.backpack;	}	/**	 * 是否保留（0不保留 1保留）	 */	void setRetain(int retain) {		this.retain = retain;	}	/**	 * 是否保留（0不保留 1保留）	 */	public int getRetain() {		return this.retain;	}	/**	 * 識別id	 */	void setSpot(int spot) {		this.spot = spot;	}	/**	 * 識別id	 */	public int getSpot() {		return this.spot;	}	/**	 * 地圖上遇到後（獲得後）, 是否直接開啟	 */	void setIsOpen(int isOpen) {		this.isOpen = isOpen;	}	/**	 * 地圖上遇到後（獲得後）, 是否直接開啟	 */	public int getIsOpen() {		return this.isOpen;	}	/**	 * 消耗品類型（0-祝福禮包，1-隨機寶箱，2-特權禮包 3-商城道具 4-裝備禮包 ）	 */	void setType(int type) {		this.type = type;	}	/**	 * 消耗品類型（0-祝福禮包，1-隨機寶箱，2-特權禮包 3-商城道具 4-裝備禮包 ）	 */	public int getType() {		return this.type;	}	/**	 * 使用後日誌記錄	 */	void setExplain(String explain) {		this.explain = explain;	}	/**	 * 使用後日誌記錄	 */	public String getExplain() {		return this.explain;	}	/**	 * 開啟所需	 */	void setNeeds(String needs) {		this.needs = needs;	}	/**	 * 開啟所需	 */	public String getNeeds() {		return this.needs;	}	/**	 * 使用後的獎勵	 */	void setAwards(String awards) {		this.awards = awards;	}	/**	 * 使用後的獎勵	 */	public String getAwards() {		return this.awards;	}	/**	 * 各個獎勵出現的概率	 */	void setWeight(String weight) {		this.weight = weight;	}	/**	 * 各個獎勵出現的概率	 */	public String getWeight() {		return this.weight;	}	/**	 * 使用後,獎勵獲得數隨機下限	 */	void setCountMin(int countMin) {		this.countMin = countMin;	}	/**	 * 使用後,獎勵獲得數隨機下限	 */	public int getCountMin() {		return this.countMin;	}	/**	 * 使用後,獎勵獲得數隨機上限	 */	void setCountMax(int countMax) {		this.countMax = countMax;	}	/**	 * 使用後,獎勵獲得數隨機上限	 */	public int getCountMax() {		return this.countMax;	}	/**	 * 獲得物品數量加成最小倍數	 */	void setAdditionMin(int additionMin) {		this.additionMin = additionMin;	}	/**	 * 獲得物品數量加成最小倍數	 */	public int getAdditionMin() {		return this.additionMin;	}	/**	 * 獲得物品數量加成最大倍數	 */	void setAdditionMax(int additionMax) {		this.additionMax = additionMax;	}	/**	 * 獲得物品數量加成最大倍數	 */	public int getAdditionMax() {		return this.additionMax;	}	/**	 * 開啟後必得物品	 */	void setCertainly(String certainly) {		this.certainly = certainly;	}	/**	 * 開啟後必得物品	 */	public String getCertainly() {		return this.certainly;	}	/**	 * 使用等級	 */	void setRank(int rank) {		this.rank = rank;	}	/**	 * 使用等級	 */	public int getRank() {		return this.rank;	}	/**	 * 疊加數量	 */	void setAddUp(int addUp) {		this.addUp = addUp;	}	/**	 * 疊加數量	 */	public int getAddUp() {		return this.addUp;	}	/**	 * 物品用途	 */	void setPurpose(String purpose) {		this.purpose = purpose;	}	/**	 * 物品用途	 */	public String getPurpose() {		return this.purpose;	}	/**	 * 物品來源	 */	void setSource(String source) {		this.source = source;	}	/**	 * 物品來源	 */	public String getSource() {		return this.source;	}	/**	 * URL	 */	void setUrl(String url) {		this.url = url;	}	/**	 * URL	 */	public String getUrl() {		return this.url;	}	/**	 * 買入日誌說明	 */	void setLogExplain4Buy(String logExplain4Buy) {		this.logExplain4Buy = logExplain4Buy;	}	/**	 * 買入日誌說明	 */	public String getLogExplain4Buy() {		return this.logExplain4Buy;	}	/**	 * 描述	 */	void setDescription(String description) {		this.description = description;	}	/**	 * 描述	 */	public String getDescription() {		return this.description;	}	/**	 * 資源格式	 */	void setFormat(String format) {		this.format = format;	}	/**	 * 資源格式	 */	public String getFormat() {		return this.format;	}}