package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import db.domain.Presents;import db.domain.Presents;import dbutils.IdUtil;import java.util.concurrent.atomic.AtomicLong;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;public interface PresentsDao {	/**	 * 增加	 */	void add(Presents po);	/**	 * 增加一批	 */	void addAll(List<Presents> pos);	/**	 * 删除	 */	void delete(String uname);	/**	 * 更新	 */	void update(Presents po);		/**	 * 更新一批	 */		void update(List<Presents> pos);	/**	 * 删除一批	 */	void delete(List<Presents> pos);		/**	 * 删除	 */			void delete(Presents po);		/**	 * 存入 有则覆盖 无则增加	 */			void save(Presents po);		/**	 * 存入一批 有则覆盖 无则增加	 */		void save(List<Presents> pos);		/**	 * 取得	 */			Presents get(String uname);		/**	 * 取得所有	 */			List<Presents> getAll();		/**	 * 表记录数量	 */		int getCount();/*	@Deprecated	List<Presents> findBy(String field, String o);*/		public List<Presents> findByUname(String o);
		@Deprecated	List<Presents> findBy(String field, String o, int limit);		/**	 * 生成一个对应的数据传输对象	 */			Presents createDTO();		/**	 * 清空	 */			void clear();		@Deprecated	void update(String fieldName, Object value);		@Deprecated	List<Presents> findBy(String field, String symbol, String o, int limit);		@Deprecated	List<Presents> findWhere(String where);		@Deprecated	List<Presents> findByScope(String field, int min, int max, int limit);}