package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import db.domain.LogFindFighter;import db.domain.LogFindFighter;import dbutils.IdUtil;import java.util.concurrent.atomic.AtomicLong;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;public interface LogFindFighterDao {	/**	 * 增加	 */	void add(LogFindFighter lffo);	/**	 * 增加一批	 */	void addAll(List<LogFindFighter> lffos);	/**	 * 删除	 */	void delete(Integer log_id);	/**	 * 更新	 */	void update(LogFindFighter lffo);		/**	 * 更新一批	 */		void update(List<LogFindFighter> lffos);	/**	 * 删除一批	 */	void delete(List<LogFindFighter> lffos);		/**	 * 删除	 */			void delete(LogFindFighter lffo);		/**	 * 存入 有则覆盖 无则增加	 */			void save(LogFindFighter lffo);		/**	 * 存入一批 有则覆盖 无则增加	 */		void save(List<LogFindFighter> lffos);		/**	 * 取得	 */			LogFindFighter get(Integer log_id);		/**	 * 取得所有	 */			List<LogFindFighter> getAll();		/**	 * 表记录数量	 */		int getCount();/*	@Deprecated	List<LogFindFighter> findBy(String field, String o);*/		public List<LogFindFighter> findByLogId(Integer o);
		public List<LogFindFighter> findByUname(String o);
		public List<LogFindFighter> findByNick(String o);
		public List<LogFindFighter> findByFighterId(Integer o);
		public List<LogFindFighter> findByTime(Integer o);
		public List<LogFindFighter> findByType(Integer o);
		@Deprecated	List<LogFindFighter> findBy(String field, String o, int limit);		/**	 * 生成一个对应的数据传输对象	 */			LogFindFighter createDTO();		/**	 * 清空	 */			void clear();		@Deprecated	void update(String fieldName, Object value);		@Deprecated	List<LogFindFighter> findBy(String field, String symbol, String o, int limit);		@Deprecated	List<LogFindFighter> findWhere(String where);		@Deprecated	List<LogFindFighter> findByScope(String field, int min, int max, int limit);}