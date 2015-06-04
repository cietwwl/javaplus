//[道具]材料package cn.mxz;public class StuffTemplet implements PropTemplet,PrizeInExcel {	/** 	 * id 	 */	private int id;	/** 	 * 名稱 	 */	private String name;	/** 	 * 奪寶介面顯示名稱 	 */	private String duobaoname;	/** 	 * 後端名稱 	 */	private String endName;	/** 	 * 顯示順序 	 */	private int order;	/** 	 * 使用後獲得獎勵 	 */	private String awards;	/** 	 * 道具類型(0無類別 1加血復活 2通用使用道具) 	 */	private int toolUseType;	/** 	 * 裝備殘卷分類（-1其他類 0氣血 1物攻 2法功 3物防 4法防 5速度） 	 */	private int equipmentType;	/** 	 * 類型（-1其他 1消耗品 2 神獸碎片 3-使用道具  5陣法碎片 6技能碎片 7裝備卷軸 8裝備材料 9 消耗品中隨機爆東西 10特殊類型） 	 */	private int type;	/** 	 * 是否可以主動使用（1可以主動使用 0不主動使用） 	 */	private int accordUse;	/** 	 * 是否放入背包（0不放 1放入 ） 	 */	private int backpack;	/** 	 * 是否保留（0不保留 1保留） 	 */	private int retain;	/** 	 * 合成後成品id 	 */	private int articleId;	/** 	 * 裝備合成卷軸對應的材料（對應裝備進階表的id）（-1表示沒有這列資料） 	 */	private int equipAdvId;	/** 	 * 品質 	 */	private int quality;	/** 	 * 前端品階（道具類的統一欄位，等價這裡的品質） 	 */	private int stepAgo;	/** 	 * 物品用途 	 */	private String purpose;	/** 	 * 物品來源 	 */	private String source;	/** 	 * 疊加數量 	 */	private int addUp;	/** 	 * 賣價(-1表示不賣) 	 */	private int sellPrice;	/** 	 * 資源格式 	 */	private String format;	/** 	 * 識別id 	 */	private int spot;	/** 	 * 資源id 	 */	private int resid;	/** 	 * 是否是初始載入頭像資源（1為是；0為否） 	 */	private int prestrain;	/** 	 * URL 	 */	private String url;	/** 	 * 描述 	 */	private String description;	/** 	 * 簡要描述 	 */	private String sketch;	/**	 * id	 */	void setId(int id) {		this.id = id;	}	/**	 * id	 */	public int getId() {		return this.id;	}	/**	 * 名稱	 */	void setName(String name) {		this.name = name;	}	/**	 * 名稱	 */	public String getName() {		return this.name;	}	/**	 * 奪寶介面顯示名稱	 */	void setDuobaoname(String duobaoname) {		this.duobaoname = duobaoname;	}	/**	 * 奪寶介面顯示名稱	 */	public String getDuobaoname() {		return this.duobaoname;	}	/**	 * 後端名稱	 */	void setEndName(String endName) {		this.endName = endName;	}	/**	 * 後端名稱	 */	public String getEndName() {		return this.endName;	}	/**	 * 顯示順序	 */	void setOrder(int order) {		this.order = order;	}	/**	 * 顯示順序	 */	public int getOrder() {		return this.order;	}	/**	 * 使用後獲得獎勵	 */	void setAwards(String awards) {		this.awards = awards;	}	/**	 * 使用後獲得獎勵	 */	public String getAwards() {		return this.awards;	}	/**	 * 道具類型(0無類別 1加血復活 2通用使用道具)	 */	void setToolUseType(int toolUseType) {		this.toolUseType = toolUseType;	}	/**	 * 道具類型(0無類別 1加血復活 2通用使用道具)	 */	public int getToolUseType() {		return this.toolUseType;	}	/**	 * 裝備殘卷分類（-1其他類 0氣血 1物攻 2法功 3物防 4法防 5速度）	 */	void setEquipmentType(int equipmentType) {		this.equipmentType = equipmentType;	}	/**	 * 裝備殘卷分類（-1其他類 0氣血 1物攻 2法功 3物防 4法防 5速度）	 */	public int getEquipmentType() {		return this.equipmentType;	}	/**	 * 類型（-1其他 1消耗品 2 神獸碎片 3-使用道具  5陣法碎片 6技能碎片 7裝備卷軸 8裝備材料 9 消耗品中隨機爆東西 10特殊類型）	 */	void setType(int type) {		this.type = type;	}	/**	 * 類型（-1其他 1消耗品 2 神獸碎片 3-使用道具  5陣法碎片 6技能碎片 7裝備卷軸 8裝備材料 9 消耗品中隨機爆東西 10特殊類型）	 */	public int getType() {		return this.type;	}	/**	 * 是否可以主動使用（1可以主動使用 0不主動使用）	 */	void setAccordUse(int accordUse) {		this.accordUse = accordUse;	}	/**	 * 是否可以主動使用（1可以主動使用 0不主動使用）	 */	public int getAccordUse() {		return this.accordUse;	}	/**	 * 是否放入背包（0不放 1放入 ）	 */	void setBackpack(int backpack) {		this.backpack = backpack;	}	/**	 * 是否放入背包（0不放 1放入 ）	 */	public int getBackpack() {		return this.backpack;	}	/**	 * 是否保留（0不保留 1保留）	 */	void setRetain(int retain) {		this.retain = retain;	}	/**	 * 是否保留（0不保留 1保留）	 */	public int getRetain() {		return this.retain;	}	/**	 * 合成後成品id	 */	void setArticleId(int articleId) {		this.articleId = articleId;	}	/**	 * 合成後成品id	 */	public int getArticleId() {		return this.articleId;	}	/**	 * 裝備合成卷軸對應的材料（對應裝備進階表的id）（-1表示沒有這列資料）	 */	void setEquipAdvId(int equipAdvId) {		this.equipAdvId = equipAdvId;	}	/**	 * 裝備合成卷軸對應的材料（對應裝備進階表的id）（-1表示沒有這列資料）	 */	public int getEquipAdvId() {		return this.equipAdvId;	}	/**	 * 品質	 */	void setQuality(int quality) {		this.quality = quality;	}	/**	 * 品質	 */	public int getQuality() {		return this.quality;	}	/**	 * 前端品階（道具類的統一欄位，等價這裡的品質）	 */	void setStepAgo(int stepAgo) {		this.stepAgo = stepAgo;	}	/**	 * 前端品階（道具類的統一欄位，等價這裡的品質）	 */	public int getStepAgo() {		return this.stepAgo;	}	/**	 * 物品用途	 */	void setPurpose(String purpose) {		this.purpose = purpose;	}	/**	 * 物品用途	 */	public String getPurpose() {		return this.purpose;	}	/**	 * 物品來源	 */	void setSource(String source) {		this.source = source;	}	/**	 * 物品來源	 */	public String getSource() {		return this.source;	}	/**	 * 疊加數量	 */	void setAddUp(int addUp) {		this.addUp = addUp;	}	/**	 * 疊加數量	 */	public int getAddUp() {		return this.addUp;	}	/**	 * 賣價(-1表示不賣)	 */	void setSellPrice(int sellPrice) {		this.sellPrice = sellPrice;	}	/**	 * 賣價(-1表示不賣)	 */	public int getSellPrice() {		return this.sellPrice;	}	/**	 * 資源格式	 */	void setFormat(String format) {		this.format = format;	}	/**	 * 資源格式	 */	public String getFormat() {		return this.format;	}	/**	 * 識別id	 */	void setSpot(int spot) {		this.spot = spot;	}	/**	 * 識別id	 */	public int getSpot() {		return this.spot;	}	/**	 * 資源id	 */	void setResid(int resid) {		this.resid = resid;	}	/**	 * 資源id	 */	public int getResid() {		return this.resid;	}	/**	 * 是否是初始載入頭像資源（1為是；0為否）	 */	void setPrestrain(int prestrain) {		this.prestrain = prestrain;	}	/**	 * 是否是初始載入頭像資源（1為是；0為否）	 */	public int getPrestrain() {		return this.prestrain;	}	/**	 * URL	 */	void setUrl(String url) {		this.url = url;	}	/**	 * URL	 */	public String getUrl() {		return this.url;	}	/**	 * 描述	 */	void setDescription(String description) {		this.description = description;	}	/**	 * 描述	 */	public String getDescription() {		return this.description;	}	/**	 * 簡要描述	 */	void setSketch(String sketch) {		this.sketch = sketch;	}	/**	 * 簡要描述	 */	public String getSketch() {		return this.sketch;	}}