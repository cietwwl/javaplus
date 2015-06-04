package db.dao.impl;import java.util.List;import db.domain.InviteUsers;import com.lemon.commons.database.ConnectionFetcher;import java.sql.Connection;import db.domain.*;//带读缓存public class InviteUsersDao3 extends InviteUsersDao1 {	private static Cache2<String, String, InviteUsers> cache = new Cache2Impl<String, String, InviteUsers>();	public static Cache2<String, String, InviteUsers> getCache() { return cache; }	InviteUsersDao3(ConnectionFetcher fetcher) {		super(fetcher);	}	public void add(InviteUsers iuo) {		if(iuo == null) {			throw new NullPointerException();		}		super.add(iuo);		cache.put(iuo.getFriend(), iuo.getUname(), iuo);	}		public void addAll(List<InviteUsers> iuos) {		for(InviteUsers iuo : iuos) {			if(iuo == null) {				throw new NullPointerException("列表中包含空元素!");			}		}		super.addAll(iuos);		for(InviteUsers iuo : iuos) {			cache.put(iuo.getFriend(), iuo.getUname(), iuo);		}	}		public void delete(String friend, String uname) {		super.delete(friend, uname);		cache.delete(friend, uname);	}	public void delete(InviteUsers iuo) {		super.delete(iuo);		cache.delete(iuo.getFriend(),iuo.getUname());	}	public void delete(List<InviteUsers> iuos) {		for(InviteUsers iuo : iuos) {			delete(iuo);		}	}	public void update(InviteUsers iuo) {		if(iuo == null) {			throw new NullPointerException();		}		super.update(iuo);		cache.put(iuo.getFriend(), iuo.getUname(), iuo);	}	public void save(InviteUsers iuo) {		if(iuo == null) {			throw new NullPointerException();		}		super.save(iuo);		cache.put(iuo.getFriend(), iuo.getUname(), iuo);	}		public void save(List<InviteUsers> iuos) {		for(InviteUsers iuo : iuos) {			save(iuo);		}	}	public void update(List<InviteUsers> iuos) {		for(InviteUsers iuo : iuos) {			update(iuo);		}	}	public InviteUsers get(String friend, String uname) {		InviteUsers ooo = cache.get(friend, uname);		if(ooo == null) {			ooo = super.get(friend, uname);			if(ooo != null) {				cache.put(friend, uname, ooo);			}		}		return ooo;	}		public List<InviteUsers> getAll() {		if(cache.getAll().size() < getCount()) {			cache.clear();			List<InviteUsers> all = super.getAll();			for (InviteUsers iuo : all) {				cache.put(iuo.getFriend(), iuo.getUname(), iuo);			}		}		return cache.getAll();	}		public void clear() {		cache.clear();		super.clear();	}}