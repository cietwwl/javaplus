//[道具][装备]套装属性package cn.mxz;public class SuitTemplet {	/** 	 * 有序列 	 */	private int id;	/** 	 * 所屬套裝id 	 */	private int suitId;	/** 	 * 啟動裝備條數 	 */	private int row;	/** 	 * 裝備類型（資料類型-1無 0氣血 1物攻 2法攻 3物防 4法防 5速度 6暴擊 7閃避 8格擋 9抗暴 10 命中 11破格 12會心） 	 */	private int baseAdditionType;	/** 	 * 屬性值 	 */	private int additionValue;	/**	 * 有序列	 */	void setId(int id) {		this.id = id;	}	/**	 * 有序列	 */	public int getId() {		return this.id;	}	/**	 * 所屬套裝id	 */	void setSuitId(int suitId) {		this.suitId = suitId;	}	/**	 * 所屬套裝id	 */	public int getSuitId() {		return this.suitId;	}	/**	 * 啟動裝備條數	 */	void setRow(int row) {		this.row = row;	}	/**	 * 啟動裝備條數	 */	public int getRow() {		return this.row;	}	/**	 * 裝備類型（資料類型-1無 0氣血 1物攻 2法攻 3物防 4法防 5速度 6暴擊 7閃避 8格擋 9抗暴 10 命中 11破格 12會心）	 */	void setBaseAdditionType(int baseAdditionType) {		this.baseAdditionType = baseAdditionType;	}	/**	 * 裝備類型（資料類型-1無 0氣血 1物攻 2法攻 3物防 4法防 5速度 6暴擊 7閃避 8格擋 9抗暴 10 命中 11破格 12會心）	 */	public int getBaseAdditionType() {		return this.baseAdditionType;	}	/**	 * 屬性值	 */	void setAdditionValue(int additionValue) {		this.additionValue = additionValue;	}	/**	 * 屬性值	 */	public int getAdditionValue() {		return this.additionValue;	}}