package mongo.dtodefine;import cn.javaplus.db.mongo.Dao;import cn.javaplus.db.mongo.Key;/** * 敌人 * * @author 林岑 * */@Daointerface Enemy {	@Key	String getUname();	@Key	String getEnemyId();}