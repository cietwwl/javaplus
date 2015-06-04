//[元神]元神库package cn.mxz;public class YuanShenTemplet implements Attribute {	/** 	 * 元神id 	 */	private int id;	/** 	 * 元神名稱 	 */	private String shadowName;	/** 	 * 品階 	 */	private int step;	/** 	 * 內部權重 	 */	private int weight;	/** 	 * 法力 	 */	private int magic;	/** 	 * 屬性類型（資料類型-1無 0氣血 1物攻 2法攻 3物防 4法防 5速度 6暴擊 7閃避 8格擋 9抗暴 10 命中 11破格 12會心） 	 */	private int baseAdditionType;	/** 	 * 氣血 	 */	private int hp;	/** 	 * 物攻 	 */	private int attack;	/** 	 * 法攻 	 */	private int mAttack;	/** 	 * 物防 	 */	private int defend;	/** 	 * 法防 	 */	private int mDefend;	/** 	 * 速度 	 */	private int speed;	/** 	 * 暴擊 	 */	private int crit;	/** 	 * 閃避 	 */	private int dodge;	/** 	 * 格擋 	 */	private int block;	/** 	 * 抗暴 	 */	private int rCrit;	/** 	 * 命中 	 */	private int hit;	/** 	 * 破格 	 */	private int rBlock;	/** 	 * 會心 	 */	private int critAddition;	/** 	 * 身價 	 */	private int social;	/** 	 * 身價成長 	 */	private float socialGrow;	/** 	 * URL 	 */	private String url;	/** 	 * 描述（最多33個中文字元） 	 */	private String description;	/** 	 * 資源ID 	 */	private int resid;	/** 	 * 是否是初始載入頭像資源（1為是；0為否） 	 */	private int prestrain;	/** 	 * 資源格式 	 */	private String format;	/**	 * 元神id	 */	void setId(int id) {		this.id = id;	}	/**	 * 元神id	 */	public int getId() {		return this.id;	}	/**	 * 元神名稱	 */	void setShadowName(String shadowName) {		this.shadowName = shadowName;	}	/**	 * 元神名稱	 */	public String getShadowName() {		return this.shadowName;	}	/**	 * 品階	 */	void setStep(int step) {		this.step = step;	}	/**	 * 品階	 */	public int getStep() {		return this.step;	}	/**	 * 內部權重	 */	void setWeight(int weight) {		this.weight = weight;	}	/**	 * 內部權重	 */	public int getWeight() {		return this.weight;	}	/**	 * 法力	 */	void setMagic(int magic) {		this.magic = magic;	}	/**	 * 法力	 */	public int getMagic() {		return this.magic;	}	/**	 * 屬性類型（資料類型-1無 0氣血 1物攻 2法攻 3物防 4法防 5速度 6暴擊 7閃避 8格擋 9抗暴 10 命中 11破格 12會心）	 */	void setBaseAdditionType(int baseAdditionType) {		this.baseAdditionType = baseAdditionType;	}	/**	 * 屬性類型（資料類型-1無 0氣血 1物攻 2法攻 3物防 4法防 5速度 6暴擊 7閃避 8格擋 9抗暴 10 命中 11破格 12會心）	 */	public int getBaseAdditionType() {		return this.baseAdditionType;	}	/**	 * 氣血	 */	void setHp(int hp) {		this.hp = hp;	}	/**	 * 氣血	 */	public int getHp() {		return this.hp;	}	/**	 * 物攻	 */	void setAttack(int attack) {		this.attack = attack;	}	/**	 * 物攻	 */	public int getAttack() {		return this.attack;	}	/**	 * 法攻	 */	void setMAttack(int mAttack) {		this.mAttack = mAttack;	}	/**	 * 法攻	 */	public int getMAttack() {		return this.mAttack;	}	/**	 * 物防	 */	void setDefend(int defend) {		this.defend = defend;	}	/**	 * 物防	 */	public int getDefend() {		return this.defend;	}	/**	 * 法防	 */	void setMDefend(int mDefend) {		this.mDefend = mDefend;	}	/**	 * 法防	 */	public int getMDefend() {		return this.mDefend;	}	/**	 * 速度	 */	void setSpeed(int speed) {		this.speed = speed;	}	/**	 * 速度	 */	public int getSpeed() {		return this.speed;	}	/**	 * 暴擊	 */	void setCrit(int crit) {		this.crit = crit;	}	/**	 * 暴擊	 */	public int getCrit() {		return this.crit;	}	/**	 * 閃避	 */	void setDodge(int dodge) {		this.dodge = dodge;	}	/**	 * 閃避	 */	public int getDodge() {		return this.dodge;	}	/**	 * 格擋	 */	void setBlock(int block) {		this.block = block;	}	/**	 * 格擋	 */	public int getBlock() {		return this.block;	}	/**	 * 抗暴	 */	void setRCrit(int rCrit) {		this.rCrit = rCrit;	}	/**	 * 抗暴	 */	public int getRCrit() {		return this.rCrit;	}	/**	 * 命中	 */	void setHit(int hit) {		this.hit = hit;	}	/**	 * 命中	 */	public int getHit() {		return this.hit;	}	/**	 * 破格	 */	void setRBlock(int rBlock) {		this.rBlock = rBlock;	}	/**	 * 破格	 */	public int getRBlock() {		return this.rBlock;	}	/**	 * 會心	 */	void setCritAddition(int critAddition) {		this.critAddition = critAddition;	}	/**	 * 會心	 */	public int getCritAddition() {		return this.critAddition;	}	/**	 * 身價	 */	void setSocial(int social) {		this.social = social;	}	/**	 * 身價	 */	public int getSocial() {		return this.social;	}	/**	 * 身價成長	 */	void setSocialGrow(float socialGrow) {		this.socialGrow = socialGrow;	}	/**	 * 身價成長	 */	public float getSocialGrow() {		return this.socialGrow;	}	/**	 * URL	 */	void setUrl(String url) {		this.url = url;	}	/**	 * URL	 */	public String getUrl() {		return this.url;	}	/**	 * 描述（最多33個中文字元）	 */	void setDescription(String description) {		this.description = description;	}	/**	 * 描述（最多33個中文字元）	 */	public String getDescription() {		return this.description;	}	/**	 * 資源ID	 */	void setResid(int resid) {		this.resid = resid;	}	/**	 * 資源ID	 */	public int getResid() {		return this.resid;	}	/**	 * 是否是初始載入頭像資源（1為是；0為否）	 */	void setPrestrain(int prestrain) {		this.prestrain = prestrain;	}	/**	 * 是否是初始載入頭像資源（1為是；0為否）	 */	public int getPrestrain() {		return this.prestrain;	}	/**	 * 資源格式	 */	void setFormat(String format) {		this.format = format;	}	/**	 * 資源格式	 */	public String getFormat() {		return this.format;	}}