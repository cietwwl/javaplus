//[钓鱼]钓鱼类型概率package cn.mxz;public class FishTypesTemplet {	/** 	 * 鱼类类型id 	 */	private int fishType;	/** 	 * 日志 	 */	private String log;	/** 	 * 内圈权重（0） 	 */	private int weight;	/** 	 * 中圈权重（1） 	 */	private int weight1;	/** 	 * 外圈权重（2） 	 */	private int weight2;	/**	 * 鱼类类型id	 */	void setFishType(int fishType) {		this.fishType = fishType;	}	/**	 * 鱼类类型id	 */	public int getFishType() {		return this.fishType;	}	/**	 * 日志	 */	void setLog(String log) {		this.log = log;	}	/**	 * 日志	 */	public String getLog() {		return this.log;	}	/**	 * 内圈权重（0）	 */	void setWeight(int weight) {		this.weight = weight;	}	/**	 * 内圈权重（0）	 */	public int getWeight() {		return this.weight;	}	/**	 * 中圈权重（1）	 */	void setWeight1(int weight1) {		this.weight1 = weight1;	}	/**	 * 中圈权重（1）	 */	public int getWeight1() {		return this.weight1;	}	/**	 * 外圈权重（2）	 */	void setWeight2(int weight2) {		this.weight2 = weight2;	}	/**	 * 外圈权重（2）	 */	public int getWeight2() {		return this.weight2;	}}