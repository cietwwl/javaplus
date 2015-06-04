package db.domain;import java.util.Arrays;public class RechargeRecordImpl implements RechargeRecord {	@Key	private long ids;	private String uname;	private int amount;	private int createtime;	public RechargeRecordImpl() {	}	public RechargeRecordImpl(RechargeRecord c) {		this.ids = c.getIds();		this.uname = c.getUname();		this.amount = c.getAmount();		this.createtime = c.getCreatetime();	}	@Override	public String tableName() {		return "recharge_record";	}	public void setIds(long ids) {		this.ids = ids;	}	public long getIds() {		return this.ids;	}public void addIds(long ids) {		this.ids += ids;}	public void setUname(String uname) {		this.uname = uname;	}	public String getUname() {		return this.uname;	}public void addUname(String uname) {		this.uname += uname;}	public void setAmount(int amount) {		this.amount = amount;	}	public int getAmount() {		return this.amount;	}public void addAmount(int amount) {		this.amount += amount;}	public void setCreatetime(int createtime) {		this.createtime = createtime;	}	public int getCreatetime() {		return this.createtime;	}public void addCreatetime(int createtime) {		this.createtime += createtime;}}