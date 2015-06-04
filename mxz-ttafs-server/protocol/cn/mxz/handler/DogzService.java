package cn.mxz.handler;public interface DogzService extends cn.mxz.util.Service{	/**	 * 获得所有神兽	 *	 * @return null	 */	cn.mxz.protocols.user.DogzP.DogzListPro getDogzAll();	/**	 * 获得当前出战神兽	 *	 * @return null	 */	cn.mxz.protocols.user.DogzP.DogzFighting getFighting();	/**	 * 顿悟(神兽品质随机增加|减少) 顿悟之后, 如果神兽处于被保护状态, 那么将会被取消保护	 *	 * @param type 顿悟类型 (0 元宝顿悟, 1 用回魂丹顿悟)	 * @param isProtected 是否保护	 * @param dogzTypeId 神兽类型ID(Excel表唯一标识)	 * @return 顿悟后的神兽信息	 */	cn.mxz.protocols.user.DogzP.DogzPro dunWu(int type, Boolean isProtected, int dogzTypeId);	/**	 * 保护某个神兽, 保护这个神兽之后, 在顿悟时, 就不会出现品质下降	 *	 * @param dogzTypeId 神兽类型ID(Excel表唯一标识)	 * 	 */	void protectedDogz(int dogzTypeId);	/**	 * 用某种鱼喂养某个神兽, 喂养之后成长值增加	 *	 * @param dogzTypeId 神兽类型ID(Excel表唯一标识)	 * @param gridIds 鱼篓格子ID列表 用|分隔, 例如 1|3|7|9	 * @return 喂养后的神兽信息	 */	cn.mxz.protocols.user.DogzP.DogzPro feed(int dogzTypeId, String gridIds);	/**	 * 出战某个神兽, 出战后, 该神兽的加成作用就会作用到队伍	 *	 * @param dogzTypeId 神兽类型ID(Excel表唯一标识)	 * @return 出战神兽信息	 */	cn.mxz.protocols.user.DogzP.DogzPro setFighting(int dogzTypeId);	/**	 * 召回某个神兽, 召回后, 该神兽的加成作用就不会作用到队伍	 *	 * @param dogzTypeId 神兽类型ID(Excel表唯一标识)	 * 	 */	void takeBack(int dogzTypeId);	/**	 * 碎片合成	 *	 * @param dogzTypeId 神兽类型ID(Excel表唯一标识)	 * @return 被合成的神兽信息	 */	cn.mxz.protocols.user.DogzP.DogzPro generate(int dogzTypeId);	/**	 * 兑换某个材料	 *	 * @param stuffId 兑换的材料ID	 * @return 兑换之后, 这个碎片的数量	 */	cn.mxz.protocols.user.PropP.PropPro exchange(int stuffId);	/**	 * 注魂	 *	 * @param dogzId 神兽ID	 * @return 注魂后的神兽	 */	cn.mxz.protocols.user.DogzP.DogzPro zhuHun(int dogzId);}