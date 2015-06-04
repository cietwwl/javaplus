package cn.mxz.handler;public interface RechargeFeedbackService extends cn.mxz.util.Service{	/**	 * 获得主界面信息	 *	 * @return 主界面信息	 */	cn.mxz.protocols.rechargeFeedback.RechargeFeedbackP.RechargeFeedbackPro getData();	/**	 * 领取充值回馈	 *	 * @param type type 1 青铜大奖 2 精铁大奖 3 白银大奖 4 黄金大奖 5 钻石大奖 6 至尊大奖	 * 	 */	void getPrize(int type);	/**	 * 充值排行榜前十名	 *	 * @return null	 */	cn.mxz.protocols.user.UsersBaseP.UserBaseSPro getTop10();}