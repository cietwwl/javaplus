package cn.mxz.handler;public interface CornucopiaService extends cn.mxz.util.Service{	/**	 * 获取摇钱树界面信息	 *	 * @return 	 */	cn.mxz.protocols.cornucopia.CornucopiaP.CornucopiaPro getData();	/**	 * 摇	 *	 * 	 */	void run();}