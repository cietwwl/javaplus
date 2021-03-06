package cn.javaplus.stock.t;

import java.util.List;

import cn.javaplus.stock.quotes.StockRecord;
import cn.javaplus.util.Util;
import cn.javaplus.web.WebContentFethcer;

import com.google.common.collect.Lists;

public class StockFrame extends BufferedFrame {

	public class StockThread extends Thread {
		@Override
		public void run() {
			while (true) {
//				if (Market.inJiaoYiTime()) {
					update();
//				}
				Util.Thread.sleep(1000);
			}
		}

	}
	
	List<IPrice> prices = Lists.newArrayList();
	
	private void update() {
		String url = "http://hq.sinajs.cn/list=sh600959";
		String content = WebContentFethcer.get("gb2312", url);
		StockRecord r = new StockRecord(content);
		prices.add(new PriceAdaptor(r));
		
//		Log.d("update");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7674879173255116805L;

	private StockPanel panel;

	private WuDangPanel wudang;
	
	public StockFrame() {
		new StockThread().start();
		panel = new StockPanel(prices);
		add(panel);
		
		wudang = new WuDangPanel(prices);
		add(wudang);
	}

}
