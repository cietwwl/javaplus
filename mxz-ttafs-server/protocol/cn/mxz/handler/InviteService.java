package cn.mxz.handler;public interface InviteService extends cn.mxz.util.Service{	/**	 * 邀请有礼界面数据	 *	 * @return 邀请有礼界面数据	 */	cn.mxz.protocols.user.InviteP.InvitesPro getData();	/**	 * 领奖	 *	 * @param count 邀请数量	 * 	 */	void receive(int count);}