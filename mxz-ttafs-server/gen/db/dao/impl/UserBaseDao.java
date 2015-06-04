package db.dao.impl;import java.util.List;import java.util.ArrayList;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.sql.SQLException;import db.domain.UserBase;import db.domain.UserBase;import dbutils.IdUtil;import java.util.concurrent.atomic.AtomicLong;import cn.javaplus.util.Closer;import java.sql.Connection;import com.lemon.commons.database.ConnectionFetcher;import db.domain.*;import java.sql.Blob;import java.sql.Date;import java.sql.Time;public interface UserBaseDao {	/**	 * 增加	 */	void add(UserBase ubo);	/**	 * 增加一批	 */	void addAll(List<UserBase> ubos);	/**	 * 删除	 */	void delete(String uname);	/**	 * 更新	 */	void update(UserBase ubo);		/**	 * 更新一批	 */		void update(List<UserBase> ubos);	/**	 * 删除一批	 */	void delete(List<UserBase> ubos);		/**	 * 删除	 */			void delete(UserBase ubo);		/**	 * 存入 有则覆盖 无则增加	 */			void save(UserBase ubo);		/**	 * 存入一批 有则覆盖 无则增加	 */		void save(List<UserBase> ubos);		/**	 * 取得	 */			UserBase get(String uname);		/**	 * 取得所有	 */			List<UserBase> getAll();		/**	 * 表记录数量	 */		int getCount();/*	@Deprecated	List<UserBase> findBy(String field, String o);*/		public List<UserBase> findByUname(String o);
		public List<UserBase> findByNick(String o);
		public List<UserBase> findByLastLoginTime(Integer o);
		@Deprecated	List<UserBase> findBy(String field, String o, int limit);		/**	 * 生成一个对应的数据传输对象	 */			UserBase createDTO();		/**	 * 清空	 */			void clear();		@Deprecated	void update(String fieldName, Object value);		@Deprecated	List<UserBase> findBy(String field, String symbol, String o, int limit);		@Deprecated	List<UserBase> findWhere(String where);		@Deprecated	List<UserBase> findByScope(String field, int min, int max, int limit);}