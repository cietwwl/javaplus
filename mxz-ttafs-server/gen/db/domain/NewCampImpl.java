package db.domain;import java.util.Arrays;public class NewCampImpl implements NewCamp {	@Key	private String uname;	private int currentformationid;	private String positionstr;	public NewCampImpl() {	}	public NewCampImpl(NewCamp c) {		this.uname = c.getUname();		this.currentformationid = c.getCurrentformationid();		this.positionstr = c.getPositionstr();	}	@Override	public String tableName() {		return "new_camp";	}	public void setUname(String uname) {		this.uname = uname;	}	public String getUname() {		return this.uname;	}public void addUname(String uname) {		this.uname += uname;}	public void setCurrentformationid(int currentformationid) {		this.currentformationid = currentformationid;	}	public int getCurrentformationid() {		return this.currentformationid;	}public void addCurrentformationid(int currentformationid) {		this.currentformationid += currentformationid;}	public void setPositionstr(String positionstr) {		this.positionstr = positionstr;	}	public String getPositionstr() {		return this.positionstr;	}public void addPositionstr(String positionstr) {		this.positionstr += positionstr;}}