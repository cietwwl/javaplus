package cn.mxz.handler;public interface CoronaService extends cn.mxz.util.Service{	/**	 * 获得主界面信息	 *	 * @return 主界面信息	 */	cn.mxz.protocols.corona.CoronaP.CoronaPro getData();	/**	 * 点击运行按钮开始转转盘	 *	 * @param type type 1:免费 2:单倍 3:双倍	 * @param ts 时间戳	 * @return 玩家中的奖品	 */	cn.mxz.protocols.user.PropP.PropPro run(int type, int ts);	/**	 * 刷新转盘内容	 *	 * 	 */	void refreshCorona();	/**	 * 刷新广播消息	 *	 * @return 	 */	cn.mxz.protocols.corona.CoronaP.CoronaMessageSPro getMessages();}