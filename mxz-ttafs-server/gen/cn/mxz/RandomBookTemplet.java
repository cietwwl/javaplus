//[关卡]随机事件剧本package cn.mxz;public class RandomBookTemplet {	/** 	 * id 	 */	private int id;	/** 	 * 劇情ID 	 */	private int storyId;	/** 	 * 劇情類型(1文字,2動畫) 	 */	private int type;	/** 	 * 對話人 	 */	private int userId;	/** 	 * 對話人名稱 	 */	private String name;	/** 	 * 是否結束(1結束,默認0) 	 */	private int isEnd;	/** 	 * 角色站位(1左邊，2右邊) 	 */	private int posi;	/** 	 * URL 	 */	private String url;	/** 	 * 內容（user為角色萬用字元） 	 */	private String content;	/**	 * id	 */	void setId(int id) {		this.id = id;	}	/**	 * id	 */	public int getId() {		return this.id;	}	/**	 * 劇情ID	 */	void setStoryId(int storyId) {		this.storyId = storyId;	}	/**	 * 劇情ID	 */	public int getStoryId() {		return this.storyId;	}	/**	 * 劇情類型(1文字,2動畫)	 */	void setType(int type) {		this.type = type;	}	/**	 * 劇情類型(1文字,2動畫)	 */	public int getType() {		return this.type;	}	/**	 * 對話人	 */	void setUserId(int userId) {		this.userId = userId;	}	/**	 * 對話人	 */	public int getUserId() {		return this.userId;	}	/**	 * 對話人名稱	 */	void setName(String name) {		this.name = name;	}	/**	 * 對話人名稱	 */	public String getName() {		return this.name;	}	/**	 * 是否結束(1結束,默認0)	 */	void setIsEnd(int isEnd) {		this.isEnd = isEnd;	}	/**	 * 是否結束(1結束,默認0)	 */	public int getIsEnd() {		return this.isEnd;	}	/**	 * 角色站位(1左邊，2右邊)	 */	void setPosi(int posi) {		this.posi = posi;	}	/**	 * 角色站位(1左邊，2右邊)	 */	public int getPosi() {		return this.posi;	}	/**	 * URL	 */	void setUrl(String url) {		this.url = url;	}	/**	 * URL	 */	public String getUrl() {		return this.url;	}	/**	 * 內容（user為角色萬用字元）	 */	void setContent(String content) {		this.content = content;	}	/**	 * 內容（user為角色萬用字元）	 */	public String getContent() {		return this.content;	}}