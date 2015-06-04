package cn.mxz.handler;public interface EnemyService extends cn.mxz.util.Service{	/**	 * 获得敌人列表	 *	 * @param index 起始下标	 * @param count 获取数量, 可比实际数量大	 * @return 敌人列表	 */	cn.mxz.protocols.user.enemy.EnemyP.EnemysPro getEnemys(int index, int count);	/**	 * 添加敌人	 *	 * @param userId 敌人帐号	 * 	 */	void addToEnemy(String userId);	/**	 * 移除敌人	 *	 * @param userId 敌人帐号	 * 	 */	void removeEnemy(String userId);	/**	 * 复仇	 *	 * @param userId 玩家帐号	 * @return null	 */	cn.mxz.protocols.user.enemy.EnemyP.EnemyWarSituationPro revenge(String userId);	/**	 * 攻击某个敌人	 *	 * @param userId 玩家帐号	 * @return null	 */	cn.mxz.protocols.user.enemy.EnemyP.EnemyWarSituationPro attack(String userId);	/**	 * 获取系统消息	 *	 * @param indexStart 起始下标	 * @param count 获取数量	 * @return 系统消息列表	 */	cn.mxz.protocols.user.enemy.EnemyP.SystemItemsPro getSystemList(int indexStart, int count);}