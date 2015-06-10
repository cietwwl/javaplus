package telnet.events;

import java.io.PrintWriter;

import define.GameData;
import define.SystemCfg;


import server.ServerManager;
import telnet.CommandBase;
import user.UserManager;
import util.SystemTimer;
import util.UtilBase;
import util.db.DatabaseUtil;

public class ServerInfoEvent extends CommandBase {

	@Override
	public void run( PrintWriter out, byte jurisdiction, String... args ) throws Exception {
		
		out.print( "-------------< 服务器信息 >-------------\r\n" );
		out.print( "地址        \t-- " + SystemCfg.SERVER_ADDRESS + ":" + SystemCfg.PORT + "\r\n" );
		out.print( "每日更新次数\t-- " + GameData.NUMERATIONTODAY + "\r\n" );
		out.print( "启动时间\t-- " + UtilBase.secondsToDateStr( (int) (SystemCfg.START_MILS/1000) ) + "\r\n" );
		out.print( "开服时间\t-- " + (SystemCfg.START_SERVER_T == 0 ? "还没设置开服时间" : UtilBase.secondsToDateStr( (int) (SystemCfg.START_SERVER_T/1000) )) + "\r\n" );
		out.print( "当前时间\t-- " + UtilBase.secondsToDateStr( SystemTimer.currentTimeSecond() ) + "\r\n" );
		out.print( "区ID     \t-- " + SystemCfg.GAME_DISTRICT + "\r\n" );
		out.print( "状态        \t-- " + ServerManager.getServerStatus() + "\r\n" );
		out.print( "运行模式\t-- " + (SystemCfg.IS_DEBUG ? "DEBUG" : "RELEASE") + "\r\n" );
		out.print( "今日活跃人数\t-- " + GameData.dailyActiveUsers.size() + "\r\n" );
		out.print( "当前在线人数\t-- " + UserManager.getInstance().getMaps().size() + "\r\n" );
		out.print( "当前内存人数\t-- " + UserManager.getInstance().memoryNum()  + "\r\n" );
		out.print( "注册总人数\t-- " + DatabaseUtil.getCount( "user_base" ) + "\r\n" );
		out.print( "--------------------------------------\r\n" );
		
		out.flush();
	}

	@Override
	public void clear( PrintWriter out ) {
		
	}

}
