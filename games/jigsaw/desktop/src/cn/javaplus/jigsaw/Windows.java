package cn.javaplus.jigsaw;

import org.javaplus.game.common.Ads;
import org.javaplus.game.common.Configs;
import org.javaplus.game.common.Gps;
import org.javaplus.game.common.IPreferences;
import org.javaplus.game.common.Logger;
import org.javaplus.game.common.OS;
import org.javaplus.game.common.PreferencesImpl;
import org.javaplus.game.common.Share;
import org.javaplus.game.common.cache.RemoteResources;
import org.javaplus.game.common.channel.Channel;
import org.javaplus.game.common.http.TwoLegsHttpClient;
import org.javaplus.game.common.http.HttpComponents.HttpClient;
import org.javaplus.game.common.log.Log;

import cn.javaplus.jigsaw.share.ShareWindows;

public class Windows implements OS {

	private IPreferences preferences;
	private Ads ads;
	private Logger logger;
	private Configs configs;
	private Share share;

	public Windows() {
		configs = new WindowsConfigs();
		ads = new AdsWindows();
		logger = new LoggerWindows();
		share = new ShareWindows();
		preferences = new PreferencesImpl();
	}

	@Override
	public int getPlayTimes() {
		return 0;
	}

	@Override
	public void sendMessage(String text) {
		Log.d(text);
	}

	@Override
	public void exit() {
		System.exit(0);
	}

	@Override
	public Ads getAds() {
		return ads;
	}

	@Override
	public Logger getLogger() {
		return logger;
	}

	@Override
	public Configs getConfigs() {
		return configs;
	}

	@Override
	public Share getShare() {
		return share;
	}

	@Override
	public IPreferences getPreferences() {
		return preferences;
	}

	@Override
	public Gps getGps() {
		return null;
	}

	@Override
	public TwoLegsHttpClient getHttp() {
		return null;
	}

	@Override
	public String getValue(Object key) {
		return null;
	}

	@Override
	public Channel getChannel() {
		return null;
	}

	@Override
	public void create() {

	}

	@Override
	public RemoteResources getCache() {
		return null;
	}

	@Override
	public HttpClient getHttpBase() {
		return null;
	}
}
