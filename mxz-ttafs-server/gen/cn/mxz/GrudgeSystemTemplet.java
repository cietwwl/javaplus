//[恩怨系统消息]package cn.mxz;public class GrudgeSystemTemplet {	/** 	 * id 	 */	private int id;	/** 	 * 消息類型 	 */	private int type;	/** 	 * 類型名稱 	 */	private String typeName;	/** 	 * 消息內容 	 */	private String content;	/** 	 * 前往的模組名稱 	 */	private String moduleName;	/** 	 * 資源ID 	 */	private int resid;	/** 	 * 圖片類型 	 */	private String format;	/** 	 * 圖示路徑 	 */	private String url;	/**	 * id	 */	void setId(int id) {		this.id = id;	}	/**	 * id	 */	public int getId() {		return this.id;	}	/**	 * 消息類型	 */	void setType(int type) {		this.type = type;	}	/**	 * 消息類型	 */	public int getType() {		return this.type;	}	/**	 * 類型名稱	 */	void setTypeName(String typeName) {		this.typeName = typeName;	}	/**	 * 類型名稱	 */	public String getTypeName() {		return this.typeName;	}	/**	 * 消息內容	 */	void setContent(String content) {		this.content = content;	}	/**	 * 消息內容	 */	public String getContent() {		return this.content;	}	/**	 * 前往的模組名稱	 */	void setModuleName(String moduleName) {		this.moduleName = moduleName;	}	/**	 * 前往的模組名稱	 */	public String getModuleName() {		return this.moduleName;	}	/**	 * 資源ID	 */	void setResid(int resid) {		this.resid = resid;	}	/**	 * 資源ID	 */	public int getResid() {		return this.resid;	}	/**	 * 圖片類型	 */	void setFormat(String format) {		this.format = format;	}	/**	 * 圖片類型	 */	public String getFormat() {		return this.format;	}	/**	 * 圖示路徑	 */	void setUrl(String url) {		this.url = url;	}	/**	 * 圖示路徑	 */	public String getUrl() {		return this.url;	}}