package cn.mxz.events.pvp;

import cn.mxz.newpvp.PvpPlayer;

/**
 * PVP 晋级赛结束
 * @author 林岑
 *
 */
public class PvpUpWatchEndEvent {

	private PvpPlayer player;

	public PvpUpWatchEndEvent(PvpPlayer player) {
		this.player = player;
	}

	public PvpPlayer getPlayer() {
		return player;
	}
}
