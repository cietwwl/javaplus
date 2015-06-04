package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import db.domain.LogLogin;import db.domain.LogLogin;import dbutils.IdUtil;import java.util.concurrent.atomic.AtomicLong;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;public interface LogLoginDao {	/**	 * 增加	 */	void add(LogLogin llo);	/**	 * 增加一批	 */	void addAll(List<LogLogin> llos);	/**	 * 删除	 */	void delete(Integer log_id);	/**	 * 更新	 */	void update(LogLogin llo);		/**	 * 更新一批	 */		void update(List<LogLogin> llos);	/**	 * 删除一批	 */	void delete(List<LogLogin> llos);		/**	 * 删除	 */			void delete(LogLogin llo);		/**	 * 存入 有则覆盖 无则增加	 */			void save(LogLogin llo);		/**	 * 存入一批 有则覆盖 无则增加	 */		void save(List<LogLogin> llos);		/**	 * 取得	 */			LogLogin get(Integer log_id);		/**	 * 取得所有	 */			List<LogLogin> getAll();		/**	 * 表记录数量	 */		int getCount();/*	@Deprecated	List<LogLogin> findBy(String field, String o);*/		public List<LogLogin> findByLogId(Integer o);
		public List<LogLogin> findByUname(String o);
		public List<LogLogin> findByNick(String o);
		public List<LogLogin> findByLoginTime(Integer o);
		public List<LogLogin> findByType(Integer o);
		@Deprecated	List<LogLogin> findBy(String field, String o, int limit);		/**	 * 生成一个对应的数据传输对象	 */			LogLogin createDTO();		/**	 * 清空	 */			void clear();		@Deprecated	void update(String fieldName, Object value);		@Deprecated	List<LogLogin> findBy(String field, String symbol, String o, int limit);		@Deprecated	List<LogLogin> findWhere(String where);		@Deprecated	List<LogLogin> findByScope(String field, int min, int max, int limit);}