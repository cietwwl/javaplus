package cn.javaplus.stock.gen.dtodefine;

import cn.javaplus.db.mongo.Dao;
import cn.javaplus.db.mongo.Key;

@Dao
interface StockName {

	@Key
	String getId();

	String getName();
}
