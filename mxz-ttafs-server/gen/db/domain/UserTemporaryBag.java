package db.domain;public class UserTemporaryBag implements 
						db.domain.UserItem
					{	private String uname;	private int capacity;	public UserTemporaryBag() {	}	public UserTemporaryBag(UserTemporaryBag c) {		this.uname = c.uname;		this.capacity = c.capacity;	}	@Override	public void setUname(String uname) {		this.uname = uname;	}	@Override	public String getUname() {		return this.uname;	}public void addUname(String uname) {		this.uname += uname;}	public void setCapacity(int capacity) {		this.capacity = capacity;	}	public int getCapacity() {		return this.capacity;	}public void addCapacity(int capacity) {		this.capacity += capacity;}}