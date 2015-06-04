package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import db.domain.LogBuy;import db.domain.LogBuy;import dbutils.IdUtil;import java.util.concurrent.atomic.AtomicLong;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;public interface LogBuyDao {	/**	 * 增加	 */	void add(LogBuy logBuyo);	/**	 * 增加一批	 */	void addAll(List<LogBuy> logBuyos);	/**	 * 删除	 */	void delete(Integer log_id);	/**	 * 更新	 */	void update(LogBuy logBuyo);		/**	 * 更新一批	 */		void update(List<LogBuy> logBuyos);	/**	 * 删除一批	 */	void delete(List<LogBuy> logBuyos);		/**	 * 删除	 */			void delete(LogBuy logBuyo);		/**	 * 存入 有则覆盖 无则增加	 */			void save(LogBuy logBuyo);		/**	 * 存入一批 有则覆盖 无则增加	 */		void save(List<LogBuy> logBuyos);		/**	 * 取得	 */			LogBuy get(Integer log_id);		/**	 * 取得所有	 */			List<LogBuy> getAll();		/**	 * 表记录数量	 */		int getCount();/*	@Deprecated	List<LogBuy> findBy(String field, String o);*/		public List<LogBuy> findByLogId(Integer o);
		public List<LogBuy> findByUname(String o);
		public List<LogBuy> findByNick(String o);
		public List<LogBuy> findByPropId(Integer o);
		public List<LogBuy> findByTime(Integer o);
		public List<LogBuy> findByCount(Integer o);
		public List<LogBuy> findByComment(String o);
		@Deprecated	List<LogBuy> findBy(String field, String o, int limit);		/**	 * 生成一个对应的数据传输对象	 */			LogBuy createDTO();		/**	 * 清空	 */			void clear();		@Deprecated	void update(String fieldName, Object value);		@Deprecated	List<LogBuy> findBy(String field, String symbol, String o, int limit);		@Deprecated	List<LogBuy> findWhere(String where);		@Deprecated	List<LogBuy> findByScope(String field, int min, int max, int limit);}