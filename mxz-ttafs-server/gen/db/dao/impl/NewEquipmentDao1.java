package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.Timestamp;import java.sql.SQLException;import db.domain.NewEquipment;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import cn.javaplus.util.Util;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;//这一版本的Dao, 是第一版本的Dao, 不带任何缓存//该文件自动生成, 禁止手动修改!public class NewEquipmentDao1 implements NewEquipmentDao{class StatementSetter {		private PreparedStatement ps;		private int index = 1;		public StatementSetter(PreparedStatement ps) {			this.ps = ps;		}		void setNext(Integer value) throws SQLException {			ps.setInt(index++, value);		}		void setNext(Byte value) throws SQLException {			ps.setByte(index++, value);		}		void setNext(Blob value) throws SQLException {			ps.setBlob(index++, value);		}		void setNext(Short value) throws SQLException {			ps.setShort(index++, value);		}		void setNext(String value) throws SQLException {			ps.setString(index++, value);		}		void setNext(Float value) throws SQLException {			ps.setFloat(index++, value);		}		void setNext(byte[] value) throws SQLException {			ps.setBytes(index++, value);		}		void setNext(Boolean value) throws SQLException {			ps.setBoolean(index++, value);		}		void setNext(Date value) throws SQLException {			Timestamp tttt = new Timestamp(value.getTime());			ps.setTimestamp(index++, tttt);		}		void setNext(Timestamp value) throws SQLException {			ps.setTimestamp(index++, value);		}		void setNext(Long value) throws SQLException {			ps.setLong(index++, value);		}		void setNext(Double value) throws SQLException {			ps.setDouble(index++, value);		}		void setNext(Time value) throws SQLException {			ps.setTime(index++, value);		}		void setNext(Object value) throws SQLException {			if (value == null) {				throw new NullPointerException("不能为null");			}						if (value instanceof Integer) {				setNext((Integer) value);			} else if (value instanceof Byte) {				setNext((Byte) value);			} else if (value instanceof Blob) {				setNext((Blob) value);			} else if (value instanceof Short) {				setNext((Short) value);			} else if (value instanceof String) {				setNext((String) value);			} else if (value instanceof Float) {				setNext((Float) value);			} else if (value instanceof byte[]) {				setNext((byte[]) value);			} else if (value instanceof Boolean) {				setNext((Boolean) value);			} else if (value instanceof Date) {				Date date = (Date) value;				Timestamp tttt = new Timestamp(date.getTime());				setNext(tttt);			} else if (value instanceof Long) {				setNext((Long) value);			} else if (value instanceof Double) {				setNext((Double) value);			} else if (value instanceof Time) {				setNext((Time) value);			} else {				throw new RuntimeException("无法识别的类型:" + value.getClass());			}		}		public void addBatch() throws SQLException {			index = 1;			ps.addBatch();		}	}		private ConnectionFetcher	fetcher;	public NewEquipmentDao1(ConnectionFetcher fetcher) {		this.fetcher = fetcher;	}	private static boolean hasLog = db.dao.impl.DBConfig.hasLog;	public void add(NewEquipment neo) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "INSERT INTO new_equipment (uname, equipment_id, templet_id, level, fighter_type_id, price) "					+ "VALUES (?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);				ss.setNext(neo.getUname());
				ss.setNext(neo.getEquipmentId());
				ss.setNext(neo.getTempletId());
				ss.setNext(neo.getLevel());
				ss.setNext(neo.getFighterTypeId());
				ss.setNext(neo.getPrice());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public void addAll(List<NewEquipment> neos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "INSERT INTO new_equipment (uname, equipment_id, templet_id, level, fighter_type_id, price) "					+ "VALUES (?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (NewEquipment neo : neos) {				ss.setNext(neo.getUname());
				ss.setNext(neo.getEquipmentId());
				ss.setNext(neo.getTempletId());
				ss.setNext(neo.getLevel());
				ss.setNext(neo.getFighterTypeId());
				ss.setNext(neo.getPrice());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void delete(Integer equipment_id, String uname) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM new_equipment WHERE equipment_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(equipment_id);
			ss.setNext(uname);
			ps.executeUpdate();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void update(NewEquipment neo) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE new_equipment SET templet_id = ?, level = ?, fighter_type_id = ?, price = ? WHERE equipment_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(neo.getTempletId());
			ss.setNext(neo.getLevel());
			ss.setNext(neo.getFighterTypeId());
			ss.setNext(neo.getPrice());
			ss.setNext(neo.getEquipmentId());
			ss.setNext(neo.getUname());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void update(List<NewEquipment> neos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE new_equipment SET templet_id = ?, level = ?, fighter_type_id = ?, price = ? WHERE equipment_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for(NewEquipment neo: neos) {			ss.setNext(neo.getTempletId());
			ss.setNext(neo.getLevel());
			ss.setNext(neo.getFighterTypeId());
			ss.setNext(neo.getPrice());
			ss.setNext(neo.getEquipmentId());
			ss.setNext(neo.getUname());
				ss.addBatch();			}			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void delete(List<NewEquipment> neos) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM new_equipment WHERE equipment_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (NewEquipment neo : neos) {			ss.setNext(neo.getEquipmentId());
			ss.setNext(neo.getUname());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void delete(NewEquipment neo) {		ResultSet rs = null;		PreparedStatement ps = null;		Connection c = fetcher.getConnection();		try {			String sql = "DELETE FROM new_equipment WHERE equipment_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(neo.getEquipmentId());
			ss.setNext(neo.getUname());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql); 		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}			public void save(NewEquipment neo) {	PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "REPLACE INTO new_equipment (uname, equipment_id, templet_id, level, fighter_type_id, price) "					+ "VALUES (?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);				ss.setNext(neo.getUname());
				ss.setNext(neo.getEquipmentId());
				ss.setNext(neo.getTempletId());
				ss.setNext(neo.getLevel());
				ss.setNext(neo.getFighterTypeId());
				ss.setNext(neo.getPrice());
			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}	public void save(List<NewEquipment> neos) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "REPLACE INTO new_equipment (uname, equipment_id, templet_id, level, fighter_type_id, price) "					+ "VALUES (?, ?, ?, ?, ?, ?)";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			for (NewEquipment neo : neos) {				ss.setNext(neo.getUname());
				ss.setNext(neo.getEquipmentId());
				ss.setNext(neo.getTempletId());
				ss.setNext(neo.getLevel());
				ss.setNext(neo.getFighterTypeId());
				ss.setNext(neo.getPrice());
				ss.addBatch();			}			ps.executeBatch();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public NewEquipment get(Integer equipment_id, String uname) {		PreparedStatement ps = null;		ResultSet rs = null;		NewEquipment neo = null;		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE equipment_id = ? AND uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(equipment_id);
			ss.setNext(uname);
			rs = ps.executeQuery();			while (rs.next()) {			neo = mapping(rs);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return neo;	}		public List<NewEquipment> getAll() {		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> neos = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				NewEquipment neo = new NewEquipmentImpl();				neo = mapping(rs);				neos.add(neo);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return neos;	}	public int getCount() {		PreparedStatement ps = null; 		ResultSet rs = null;		int count = 0;		Connection c = fetcher.getConnection(); 		try {			String sql = "SELECT COUNT(*) FROM new_equipment";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				count =  rs.getInt(1);			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally { 			Closer.close(rs, ps, c);		} 		return count; 	}	private NewEquipment mapping(ResultSet rs) throws SQLException {		NewEquipment neo = new NewEquipmentImpl();		neo.setUname(rs.getString("uname"));		
		neo.setEquipmentId(rs.getInt("equipment_id"));		
		neo.setTempletId(rs.getInt("templet_id"));		
		neo.setLevel(rs.getInt("level"));		
		neo.setFighterTypeId(rs.getInt("fighter_type_id"));		
		neo.setPrice(rs.getInt("price"));		return neo;	}/*		public List<NewEquipment> findBy(String field, String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE " + field + " = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}*/		public List<NewEquipment> findByUname(String o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE uname = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<NewEquipment> findByEquipmentId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE equipment_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<NewEquipment> findByTempletId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE templet_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<NewEquipment> findByLevel(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE level = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<NewEquipment> findByFighterTypeId(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE fighter_type_id = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<NewEquipment> findByPrice(Integer o){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE price = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}
		public List<NewEquipment> findBy(String field, String o, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE " + field + " = ? limit ?";			ps = c.prepareStatement(sql);						StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public NewEquipment createDTO() {		return new NewEquipmentImpl();	}		public void clear() {		PreparedStatement ps = null;		Connection c = fetcher.getConnection(); 		try {			String sql = "DELETE FROM new_equipment";			ps = c.prepareStatement(sql);			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(ps, c);		}	}	public void update(String fieldName, Object value) {		PreparedStatement ps = null;		ResultSet rs = null;		Connection c = fetcher.getConnection();		try {			String sql = "UPDATE new_equipment SET " + fieldName + " = ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(value);			ps.executeUpdate();			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}	}		public List<NewEquipment> findBy(String field, String symbol, String o, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE " + field + " " + symbol + " ? LIMIT ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(o);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public List<NewEquipment> findWhere(String where){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE " + where + ";";			ps = c.prepareStatement(sql);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}		public List<NewEquipment> findByScope(String field, int min, int max, int limit){		PreparedStatement ps = null;		ResultSet rs = null;		List<NewEquipment> ls = new ArrayList<NewEquipment>();		Connection c = fetcher.getConnection();		try {			String sql = "SELECT * FROM new_equipment WHERE " + field + " >= ? AND " + field + " <= ? LIMIT ?";			ps = c.prepareStatement(sql);			StatementSetter ss = new StatementSetter(ps);			ss.setNext(min);			ss.setNext(max);			ss.setNext(limit);			rs = ps.executeQuery();			while (rs.next()) {				ls.add(mapping(rs));			}			if(hasLog)				System.out.println(sql);		} catch (SQLException e) {			throw Util.Exception.toRuntimeException(e);		} finally {			Closer.close(rs, ps, c);		}		return ls;	}}