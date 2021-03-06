package mongo.dtodefine;

import cn.javaplus.db.mongo.Dao;
import cn.javaplus.db.mongo.DaoInterface;
import cn.javaplus.db.mongo.DtoInterface;
import cn.javaplus.db.mongo.Key;

@Dao
@DaoInterface("cn.mxz.util.counter.CounterDao<UserCountersAllDto>")
@DtoInterface("db.domain.DBCounter")
interface UserCountersAll {

	@Key
	String getUname();

	@Key
	String getCounterId();

	int getCount();
}
