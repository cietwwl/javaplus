package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.Timestamp;import java.sql.SQLException;import db.domain.BossData;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import cn.javaplus.util.Util;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;//这一版本的Dao, 是第一版本的Dao, 不带任何缓存//该文件自动生成, 禁止手动修改!public class BossDataDao1 implements BossDataDao{class StatementSetter {		private PreparedStatement ps;		private int index = 1;		public StatementSetter(PreparedStatement ps) {			this.ps = ps;		}		void setNext(Integer value) throws SQLException {			ps.setInt(index++, value);		}		void setNext(Byte value) throws SQLException {			ps.setByte(index++, value);		}		void setNext(Blob value) throws SQLException {			ps.setBlob(index++, value);		}		void setNext(Short value) throws SQLException {			ps.setShort(index++, value);		}		void setNext(String value) throws SQLException {			ps.setString(index++, value);		}		void setNext(Float value) throws SQLException {			ps.setFloat(index++, value);		}		void setNext(byte[] value) throws SQLException {			ps.setBytes(index++, value);		}		void setNext(Boolean value) throws SQLException {			ps.setBoolean(index++, value);		}		void setNext(Date value) throws SQLException {			Timestamp tttt = new Timestamp(value.getTime());			ps.setTimestamp(index++, tttt);		}		void setNext(Timestamp value) throws SQLException {			ps.setTimestamp(index++, value);		}		void setNext(Long value) throws SQLException {			ps.setLong(index++, value);		}		void setNext(Double value) throws SQLException {			ps.setDouble(index++, value);		}		void setNext(Time value) throws SQLException {			ps.setTime(index++, value);		}		void setNext(Object value) throws SQLException {			if (value == null) {				throw new NullPointerException("不能为null");			}						if (value instanceof Integer) {				setNext((Integer) value);			} else if (value instanceof Byte) {				setNext((Byte) value);			} else if (value instanceof Blob) {				setNext((Blob) value);			} else if (value instanceof Short) {				setNext((Short) value);			} else if (value instanceof String) {				setNext((String) value);			} else if (value instanceof Float) {				setNext((Float) value);			} else if (value instanceof byte[]) {				setNext((byte[]) value);			} else if (value instanceof Boolean) {				setNext((Boolean) value);			} else if (value instanceof Date) {				Date date = (Date) value;				Timestamp tttt = new Timestamp(date.getTime());				setNext(tttt);			} else if (value instanceof Long) {				setNext((Long) value);			} else if (value instanceof Double) {				setNext((Double) value);			} else if (value instanceof Time) {				setNext((Time) value);			} else {				throw new RuntimeException("无法识别的类型:" + value.getClass());			}		}		public void addBatch() throws SQLException {			index = 1;			ps.addBatch();		}	}		private ConnectionFetcher	fetcher;	public BossDataDao1(ConnectionFetcher fetcher) {		this.fetcher = fetcher;	}	private static boolean hasLog = db.dao.impl.DBConfig.hasLog;	public void add(BossData bdo) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "INSERT INTO boss_data (boss_id, uname, boss_templet_id, hp, level, map_id, killer, found_time, is_shared) "					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);				ss.setNext(bdo.getBossId());
				ss.setNext(bdo.getUname());
				ss.setNext(bdo.getBossTempletId());
				ss.setNext(bdo.getHp());
				ss.setNext(bdo.getLevel());
				ss.setNext(bdo.getMapId());
				ss.setNext(bdo.getKiller());
				ss.setNext(bdo.getFoundTime());
				ss.setNext(bdo.getIsShared());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public void addAll(List<BossData> bdos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "INSERT INTO boss_data (boss_id, uname, boss_templet_id, hp, level, map_id, killer, found_time, is_shared) "					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (BossData bdo : bdos) {				ss.setNext(bdo.getBossId());
				ss.setNext(bdo.getUname());
				ss.setNext(bdo.getBossTempletId());
				ss.setNext(bdo.getHp());
				ss.setNext(bdo.getLevel());
				ss.setNext(bdo.getMapId());
				ss.setNext(bdo.getKiller());
				ss.setNext(bdo.getFoundTime());
				ss.setNext(bdo.getIsShared());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void delete(Integer boss_id) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM boss_data WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(boss_id);
			ps.executeUpdate();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void update(BossData bdo) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE boss_data SET uname = ?, boss_templet_id = ?, hp = ?, level = ?, map_id = ?, killer = ?, found_time = ?, is_shared = ? WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(bdo.getUname());
			ss.setNext(bdo.getBossTempletId());
			ss.setNext(bdo.getHp());
			ss.setNext(bdo.getLevel());
			ss.setNext(bdo.getMapId());
			ss.setNext(bdo.getKiller());
			ss.setNext(bdo.getFoundTime());
			ss.setNext(bdo.getIsShared());
			ss.setNext(bdo.getBossId());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void update(List<BossData> bdos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE boss_data SET uname = ?, boss_templet_id = ?, hp = ?, level = ?, map_id = ?, killer = ?, found_time = ?, is_shared = ? WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for(BossData bdo: bdos) {			ss.setNext(bdo.getUname());
			ss.setNext(bdo.getBossTempletId());
			ss.setNext(bdo.getHp());
			ss.setNext(bdo.getLevel());
			ss.setNext(bdo.getMapId());
			ss.setNext(bdo.getKiller());
			ss.setNext(bdo.getFoundTime());
			ss.setNext(bdo.getIsShared());
			ss.setNext(bdo.getBossId());
				ss.addBatch();			}			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void delete(List<BossData> bdos) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM boss_data WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (BossData bdo : bdos) {			ss.setNext(bdo.getBossId());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void delete(BossData bdo) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM boss_data WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(bdo.getBossId());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void save(BossData bdo) {	PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "REPLACE INTO boss_data (boss_id, uname, boss_templet_id, hp, level, map_id, killer, found_time, is_shared) "					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);				ss.setNext(bdo.getBossId());
				ss.setNext(bdo.getUname());
				ss.setNext(bdo.getBossTempletId());
				ss.setNext(bdo.getHp());
				ss.setNext(bdo.getLevel());
				ss.setNext(bdo.getMapId());
				ss.setNext(bdo.getKiller());
				ss.setNext(bdo.getFoundTime());
				ss.setNext(bdo.getIsShared());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void save(List<BossData> bdos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "REPLACE INTO boss_data (boss_id, uname, boss_templet_id, hp, level, map_id, killer, found_time, is_shared) "					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (BossData bdo : bdos) {				ss.setNext(bdo.getBossId());
				ss.setNext(bdo.getUname());
				ss.setNext(bdo.getBossTempletId());
				ss.setNext(bdo.getHp());
				ss.setNext(bdo.getLevel());
				ss.setNext(bdo.getMapId());
				ss.setNext(bdo.getKiller());
				ss.setNext(bdo.getFoundTime());
				ss.setNext(bdo.getIsShared());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public BossData get(Integer boss_id) {		PreparedStatement ps = null;		ResultSet rs = null;		BossData bdo = null;		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(boss_id);
			rs = ps.executeQuery();			while (rs.next()) {			bdo = mapping(rs);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return bdo;	}		public List<BossData> getAll() {		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> bdos = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				BossData bdo = new BossDataImpl();				bdo = mapping(rs);				bdos.add(bdo);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return bdos;	}	public int getCount() {		PreparedStatement ps = null; 		ResultSet rs = null;		int count = 0;		Connection c = fetcher.getConnection(); 		try {			String sql = "SELECT COUNT(*) FROM boss_data";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				count =  rs.getInt(1);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally { 			Closer.close(rs, ps, c);		} 		return count; 	}	private BossData mapping(ResultSet rs) throws SQLException {		BossData bdo = new BossDataImpl();		bdo.setBossId(rs.getInt("boss_id"));		
		bdo.setUname(rs.getString("uname"));		
		bdo.setBossTempletId(rs.getInt("boss_templet_id"));		
		bdo.setHp(rs.getInt("hp"));		
		bdo.setLevel(rs.getInt("level"));		
		bdo.setMapId(rs.getInt("map_id"));		
		bdo.setKiller(rs.getString("killer"));		
		bdo.setFoundTime(rs.getInt("found_time"));		
		bdo.setIsShared(rs.getBoolean("is_shared"));		return bdo;	}/*		public List<BossData> findBy(String field, String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE " + field + " = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}*/		public List<BossData> findByBossId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE boss_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByUname(String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByBossTempletId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE boss_templet_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByHp(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE hp = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByLevel(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE level = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByMapId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE map_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByKiller(String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE killer = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByFoundTime(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE found_time = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findByIsShared(Boolean o){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE is_shared = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<BossData> findBy(String field, String o, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE " + field + " = ? limit ?";			ps = c.prepareStatement(sql);						StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public BossData createDTO() {		return new BossDataImpl();	}		public void clear() {		PreparedStatement ps = null;		Connection c = fetcher.getConnection(); 		try {			String sql = "DELETE FROM boss_data";			ps = c.prepareStatement(sql);			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(ps, c);		}	}	public void update(String fieldName, Object value) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE boss_data SET " + fieldName + " = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(value);			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public List<BossData> findBy(String field, String symbol, String o, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE " + field + " " + symbol + " ? LIMIT ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public List<BossData> findWhere(String where){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE " + where + ";";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public List<BossData> findByScope(String field, int min, int max, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<BossData> ls = new ArrayList<BossData>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM boss_data WHERE " + field + " >= ? AND " + field + " <= ? LIMIT ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(min);			ss.setNext(max);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}}