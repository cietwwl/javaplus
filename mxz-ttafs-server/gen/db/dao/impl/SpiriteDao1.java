package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.Timestamp;import java.sql.SQLException;import db.domain.Spirite;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import cn.javaplus.util.Util;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;//这一版本的Dao, 是第一版本的Dao, 不带任何缓存//该文件自动生成, 禁止手动修改!public class SpiriteDao1 implements SpiriteDao{class StatementSetter {		private PreparedStatement ps;		private int index = 1;		public StatementSetter(PreparedStatement ps) {			this.ps = ps;		}		void setNext(Integer value) throws SQLException {			ps.setInt(index++, value);		}		void setNext(Byte value) throws SQLException {			ps.setByte(index++, value);		}		void setNext(Blob value) throws SQLException {			ps.setBlob(index++, value);		}		void setNext(Short value) throws SQLException {			ps.setShort(index++, value);		}		void setNext(String value) throws SQLException {			ps.setString(index++, value);		}		void setNext(Float value) throws SQLException {			ps.setFloat(index++, value);		}		void setNext(byte[] value) throws SQLException {			ps.setBytes(index++, value);		}		void setNext(Boolean value) throws SQLException {			ps.setBoolean(index++, value);		}		void setNext(Date value) throws SQLException {			Timestamp tttt = new Timestamp(value.getTime());			ps.setTimestamp(index++, tttt);		}		void setNext(Timestamp value) throws SQLException {			ps.setTimestamp(index++, value);		}		void setNext(Long value) throws SQLException {			ps.setLong(index++, value);		}		void setNext(Double value) throws SQLException {			ps.setDouble(index++, value);		}		void setNext(Time value) throws SQLException {			ps.setTime(index++, value);		}		void setNext(Object value) throws SQLException {			if (value == null) {				throw new NullPointerException("不能为null");			}						if (value instanceof Integer) {				setNext((Integer) value);			} else if (value instanceof Byte) {				setNext((Byte) value);			} else if (value instanceof Blob) {				setNext((Blob) value);			} else if (value instanceof Short) {				setNext((Short) value);			} else if (value instanceof String) {				setNext((String) value);			} else if (value instanceof Float) {				setNext((Float) value);			} else if (value instanceof byte[]) {				setNext((byte[]) value);			} else if (value instanceof Boolean) {				setNext((Boolean) value);			} else if (value instanceof Date) {				Date date = (Date) value;				Timestamp tttt = new Timestamp(date.getTime());				setNext(tttt);			} else if (value instanceof Long) {				setNext((Long) value);			} else if (value instanceof Double) {				setNext((Double) value);			} else if (value instanceof Time) {				setNext((Time) value);			} else {				throw new RuntimeException("无法识别的类型:" + value.getClass());			}		}		public void addBatch() throws SQLException {			index = 1;			ps.addBatch();		}	}		private ConnectionFetcher	fetcher;	public SpiriteDao1(ConnectionFetcher fetcher) {		this.fetcher = fetcher;	}	private static boolean hasLog = db.dao.impl.DBConfig.hasLog;	public void add(Spirite spiriteo) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "INSERT INTO spirite (uname, type_id, step, count) "					+ "VALUES (?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);				ss.setNext(spiriteo.getUname());
				ss.setNext(spiriteo.getTypeId());
				ss.setNext(spiriteo.getStep());
				ss.setNext(spiriteo.getCount());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public void addAll(List<Spirite> spiriteos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "INSERT INTO spirite (uname, type_id, step, count) "					+ "VALUES (?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (Spirite spiriteo : spiriteos) {				ss.setNext(spiriteo.getUname());
				ss.setNext(spiriteo.getTypeId());
				ss.setNext(spiriteo.getStep());
				ss.setNext(spiriteo.getCount());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void delete(Integer type_id, String uname) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM spirite WHERE type_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(type_id);
			ss.setNext(uname);
			ps.executeUpdate();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void update(Spirite spiriteo) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE spirite SET step = ?, count = ? WHERE type_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(spiriteo.getStep());
			ss.setNext(spiriteo.getCount());
			ss.setNext(spiriteo.getTypeId());
			ss.setNext(spiriteo.getUname());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void update(List<Spirite> spiriteos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE spirite SET step = ?, count = ? WHERE type_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for(Spirite spiriteo: spiriteos) {			ss.setNext(spiriteo.getStep());
			ss.setNext(spiriteo.getCount());
			ss.setNext(spiriteo.getTypeId());
			ss.setNext(spiriteo.getUname());
				ss.addBatch();			}			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void delete(List<Spirite> spiriteos) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM spirite WHERE type_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (Spirite spiriteo : spiriteos) {			ss.setNext(spiriteo.getTypeId());
			ss.setNext(spiriteo.getUname());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void delete(Spirite spiriteo) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM spirite WHERE type_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(spiriteo.getTypeId());
			ss.setNext(spiriteo.getUname());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void save(Spirite spiriteo) {	PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "REPLACE INTO spirite (uname, type_id, step, count) "					+ "VALUES (?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);				ss.setNext(spiriteo.getUname());
				ss.setNext(spiriteo.getTypeId());
				ss.setNext(spiriteo.getStep());
				ss.setNext(spiriteo.getCount());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void save(List<Spirite> spiriteos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "REPLACE INTO spirite (uname, type_id, step, count) "					+ "VALUES (?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (Spirite spiriteo : spiriteos) {				ss.setNext(spiriteo.getUname());
				ss.setNext(spiriteo.getTypeId());
				ss.setNext(spiriteo.getStep());
				ss.setNext(spiriteo.getCount());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public Spirite get(Integer type_id, String uname) {		PreparedStatement ps = null;		ResultSet rs = null;		Spirite spiriteo = null;		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE type_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(type_id);
			ss.setNext(uname);
			rs = ps.executeQuery();			while (rs.next()) {			spiriteo = mapping(rs);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return spiriteo;	}		public List<Spirite> getAll() {		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> spiriteos = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				Spirite spiriteo = new SpiriteImpl();				spiriteo = mapping(rs);				spiriteos.add(spiriteo);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return spiriteos;	}	public int getCount() {		PreparedStatement ps = null; 		ResultSet rs = null;		int count = 0;		Connection c = fetcher.getConnection(); 		try {			String sql = "SELECT COUNT(*) FROM spirite";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				count =  rs.getInt(1);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally { 			Closer.close(rs, ps, c);		} 		return count; 	}	private Spirite mapping(ResultSet rs) throws SQLException {		Spirite spiriteo = new SpiriteImpl();		spiriteo.setUname(rs.getString("uname"));		
		spiriteo.setTypeId(rs.getInt("type_id"));		
		spiriteo.setStep(rs.getInt("step"));		
		spiriteo.setCount(rs.getInt("count"));		return spiriteo;	}/*		public List<Spirite> findBy(String field, String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE " + field + " = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}*/		public List<Spirite> findByUname(String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<Spirite> findByTypeId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE type_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<Spirite> findByStep(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE step = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<Spirite> findByCount(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE count = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<Spirite> findBy(String field, String o, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE " + field + " = ? limit ?";			ps = c.prepareStatement(sql);						StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public Spirite createDTO() {		return new SpiriteImpl();	}		public void clear() {		PreparedStatement ps = null;		Connection c = fetcher.getConnection(); 		try {			String sql = "DELETE FROM spirite";			ps = c.prepareStatement(sql);			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(ps, c);		}	}	public void update(String fieldName, Object value) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE spirite SET " + fieldName + " = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(value);			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public List<Spirite> findBy(String field, String symbol, String o, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE " + field + " " + symbol + " ? LIMIT ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public List<Spirite> findWhere(String where){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE " + where + ";";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public List<Spirite> findByScope(String field, int min, int max, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<Spirite> ls = new ArrayList<Spirite>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM spirite WHERE " + field + " >= ? AND " + field + " <= ? LIMIT ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(min);			ss.setNext(max);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}}