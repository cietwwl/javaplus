//[竞技场]物品兑换package cn.mxz;public class ArenaConvertTemplet {	/** 	 * 物品id 	 */	private int typeId;	/** 	 * 物品名稱 	 */	private String name;	/** 	 * 顯示順序 	 */	private int order;	/** 	 * 品質（判斷顏色） 	 */	private int quality;	/** 	 * 物品說明 	 */	private String description;	/** 	 * 榮譽需求 	 */	private int honor;	/** 	 * 單次兌換可得物品數量 	 */	private int convertnumber;	/** 	 * 兌換次數 	 */	private int convertMax;	/** 	 * 兌換後冷卻時間（秒） 	 */	private int coolTime;	/** 	 * 主角等級 	 */	private int lv;	/**	 * 物品id	 */	void setTypeId(int typeId) {		this.typeId = typeId;	}	/**	 * 物品id	 */	public int getTypeId() {		return this.typeId;	}	/**	 * 物品名稱	 */	void setName(String name) {		this.name = name;	}	/**	 * 物品名稱	 */	public String getName() {		return this.name;	}	/**	 * 顯示順序	 */	void setOrder(int order) {		this.order = order;	}	/**	 * 顯示順序	 */	public int getOrder() {		return this.order;	}	/**	 * 品質（判斷顏色）	 */	void setQuality(int quality) {		this.quality = quality;	}	/**	 * 品質（判斷顏色）	 */	public int getQuality() {		return this.quality;	}	/**	 * 物品說明	 */	void setDescription(String description) {		this.description = description;	}	/**	 * 物品說明	 */	public String getDescription() {		return this.description;	}	/**	 * 榮譽需求	 */	void setHonor(int honor) {		this.honor = honor;	}	/**	 * 榮譽需求	 */	public int getHonor() {		return this.honor;	}	/**	 * 單次兌換可得物品數量	 */	void setConvertnumber(int convertnumber) {		this.convertnumber = convertnumber;	}	/**	 * 單次兌換可得物品數量	 */	public int getConvertnumber() {		return this.convertnumber;	}	/**	 * 兌換次數	 */	void setConvertMax(int convertMax) {		this.convertMax = convertMax;	}	/**	 * 兌換次數	 */	public int getConvertMax() {		return this.convertMax;	}	/**	 * 兌換後冷卻時間（秒）	 */	void setCoolTime(int coolTime) {		this.coolTime = coolTime;	}	/**	 * 兌換後冷卻時間（秒）	 */	public int getCoolTime() {		return this.coolTime;	}	/**	 * 主角等級	 */	void setLv(int lv) {		this.lv = lv;	}	/**	 * 主角等級	 */	public int getLv() {		return this.lv;	}}