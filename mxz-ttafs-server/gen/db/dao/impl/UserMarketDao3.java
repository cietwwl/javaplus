package db.dao.impl;import java.util.List;import db.domain.UserMarket;import com.lemon.commons.database.ConnectionFetcher;import java.sql.Connection;import db.domain.*;//带读缓存public class UserMarketDao3 extends UserMarketDao1 {	private static Cache1<Integer, UserMarket> cache = new Cache1Impl<Integer, UserMarket>();	public static Cache1<Integer, UserMarket> getCache() { return cache; }	UserMarketDao3(ConnectionFetcher fetcher) {		super(fetcher);	}	public void add(UserMarket umo) {		if(umo == null) {			throw new NullPointerException();		}		super.add(umo);		cache.put(umo.getTradId(), umo);	}		public void addAll(List<UserMarket> umos) {		for(UserMarket umo : umos) {			if(umo == null) {				throw new NullPointerException("列表中包含空元素!");			}		}		super.addAll(umos);		for(UserMarket umo : umos) {			cache.put(umo.getTradId(), umo);		}	}		public void delete(Integer trad_id) {		super.delete(trad_id);		cache.delete(trad_id);	}	public void delete(UserMarket umo) {		super.delete(umo);		cache.delete(umo.getTradId());	}	public void delete(List<UserMarket> umos) {		for(UserMarket umo : umos) {			delete(umo);		}	}	public void update(UserMarket umo) {		if(umo == null) {			throw new NullPointerException();		}		super.update(umo);		cache.put(umo.getTradId(), umo);	}	public void save(UserMarket umo) {		if(umo == null) {			throw new NullPointerException();		}		super.save(umo);		cache.put(umo.getTradId(), umo);	}		public void save(List<UserMarket> umos) {		for(UserMarket umo : umos) {			save(umo);		}	}	public void update(List<UserMarket> umos) {		for(UserMarket umo : umos) {			update(umo);		}	}	public UserMarket get(Integer trad_id) {		UserMarket ooo = cache.get(trad_id);		if(ooo == null) {			ooo = super.get(trad_id);			if(ooo != null) {				cache.put(trad_id, ooo);			}		}		return ooo;	}		public List<UserMarket> getAll() {		if(cache.getAll().size() < getCount()) {			cache.clear();			List<UserMarket> all = super.getAll();			for (UserMarket umo : all) {				cache.put(umo.getTradId(), umo);			}		}		return cache.getAll();	}		public void clear() {		cache.clear();		super.clear();	}}