package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import db.domain.UmsOnlineno;import db.domain.UmsOnlineno;import dbutils.IdUtil;import java.util.concurrent.atomic.AtomicLong;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;public interface UmsOnlinenoDao {	/**	 * 增加	 */	void add(UmsOnlineno uoo);	/**	 * 增加一批	 */	void addAll(List<UmsOnlineno> uoos);	/**	 * 删除	 */	void delete(Integer server_id);	/**	 * 更新	 */	void update(UmsOnlineno uoo);		/**	 * 更新一批	 */		void update(List<UmsOnlineno> uoos);	/**	 * 删除一批	 */	void delete(List<UmsOnlineno> uoos);		/**	 * 删除	 */			void delete(UmsOnlineno uoo);		/**	 * 存入 有则覆盖 无则增加	 */			void save(UmsOnlineno uoo);		/**	 * 存入一批 有则覆盖 无则增加	 */		void save(List<UmsOnlineno> uoos);		/**	 * 取得	 */			UmsOnlineno get(Integer server_id);		/**	 * 取得所有	 */			List<UmsOnlineno> getAll();		/**	 * 表记录数量	 */		int getCount();/*	@Deprecated	List<UmsOnlineno> findBy(String field, String o);*/		public List<UmsOnlineno> findByServerId(Integer o);
		public List<UmsOnlineno> findByOnlineNumber(Integer o);
		public List<UmsOnlineno> findByUpdateTime(Date o);
		@Deprecated	List<UmsOnlineno> findBy(String field, String o, int limit);		/**	 * 生成一个对应的数据传输对象	 */			UmsOnlineno createDTO();		/**	 * 清空	 */			void clear();		@Deprecated	void update(String fieldName, Object value);		@Deprecated	List<UmsOnlineno> findBy(String field, String symbol, String o, int limit);		@Deprecated	List<UmsOnlineno> findWhere(String where);		@Deprecated	List<UmsOnlineno> findByScope(String field, int min, int max, int limit);}