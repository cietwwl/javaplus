package db.domain;public class PracticeAskCareDataImpl implements PracticeAskCareData {	@Key	private String uname;	@Key	private String friendId;	public PracticeAskCareDataImpl() {	}	public PracticeAskCareDataImpl(PracticeAskCareData c) {		this.uname = c.getUname();		this.friendId = c.getFriendId();	}	@Override	public String tableName() {		return "practice_ask_care_data";	}	public void setUname(String uname) {		this.uname = uname;	}	public String getUname() {		return this.uname;	}public void addUname(String uname) {		this.uname += uname;}	public void setFriendId(String friendId) {		this.friendId = friendId;	}	public String getFriendId() {		return this.friendId;	}public void addFriendId(String friendId) {		this.friendId += friendId;}}