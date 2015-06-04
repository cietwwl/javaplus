package cn.javaplus.stock.apps;

import java.util.List;

import cn.javaplus.log.Log;
import cn.javaplus.math.Avg;
import cn.javaplus.stock.stock.OneDayData;
import cn.javaplus.stock.stock.Stock1;
import cn.javaplus.stock.stock.StockReader;
import cn.javaplus.stock.stock.TwoDaysData;
import cn.javaplus.stock.util.Market;
import cn.javaplus.time.Time;

/**
 * 复牌股 以及停牌日期
 */
public class AppPrintAllZhangTing3TianFuPai {

	static Avg avgLow = new Avg();
	static Avg avgHigh = new Avg();
	static Avg avgOpen = new Avg();
	static Avg avgClose = new Avg();

	public static void main(String[] args) {

		StockReader r = new StockReader();

		List<Stock1> all = r.readShenHuA();

		for (Stock1 stock : all) {

			print(stock);
		}
		Log.d("平均最低价卖出:" + Market.toPriceString(avgLow.getValue() * 100) + "%");
		Log.d("平均最高价卖出:" + Market.toPriceString(avgHigh.getValue() * 100) + "%");
		Log.d("平均开盘价卖出:" + Market.toPriceString(avgOpen.getValue() * 100) + "%");
		Log.d("平均收盘价卖出:" + Market.toPriceString(avgClose.getValue() * 100)
				+ "%");
	}

	private static void print(Stock1 stock) {
		List<TwoDaysData> ls = stock.getTwoDaysData();

		for (TwoDaysData price : ls) {
			OneDayData before = price.getTheDayBefore();
			OneDayData after = price.getTheDayAfter();

			long b = before.getDateMillis();
			long a = after.getDateMillis();

			boolean zhangTing3Tian = isZhangTingSanTian(before);

			if (/*after.getDate() > 20150101 &&*/ a - b >= Time.MILES_ONE_DAY * 40
					&& zhangTing3Tian) {
				OneDayData canBuyDay = getCanBuyDay(before);

				Object buyDate = "X";
				String zdLow = "X";
				String zdHigh = "X";
				String zdOpen = "X";
				String zdClose = "X";

				if (canBuyDay != null) {
					
					double buyPrice = canBuyDay.getHigh();
					buyDate = canBuyDay.getDate();
					OneDayData sellDay = getSellDay(canBuyDay);
					
					if (sellDay != null) {
						double sellPriceLow = sellDay.getLow();
						double sellPriceHigh = sellDay.getHigh();
						double sellPriceOpen = sellDay.getOpen();
						double sellPriceClose = sellDay.getClose();

						double percentLow = (sellPriceLow - buyPrice)
								/ buyPrice;
						double percentHigh = (sellPriceHigh - buyPrice)
								/ buyPrice;
						double percentOpen = (sellPriceOpen - buyPrice)
								/ buyPrice;
						double percentClose = (sellPriceClose - buyPrice)
								/ buyPrice;

						avgLow.add(percentLow);
						avgHigh.add(percentHigh);
						avgOpen.add(percentOpen);
						avgClose.add(percentClose);

						zdLow = Market.toPriceString(percentLow * 100) + "%";
						zdHigh = Market.toPriceString(percentHigh * 100) + "%";
						zdOpen = Market.toPriceString(percentOpen * 100) + "%";
						zdClose = Market.toPriceString(percentClose * 100)
								+ "%";
					}
				}

				String cc = "买入后涨跌 L H O C ";
				String aa = "日期";
				String bb = "哪日能买入";
				Log.d(stock.getId(), aa, before.getDate(), bb, buyDate, cc,
						zdLow, zdHigh, zdOpen, zdClose);
			}
		}

	}

	private static OneDayData getSellDay(OneDayData canBuyDay) {
		OneDayData tomorrow = canBuyDay.getTomorrow();
		if (tomorrow == null)
			return null;
		return tomorrow.getTomorrow();
	}

	private static boolean isZhangTingSanTian(OneDayData before) {

		OneDayData p1 = before.getTomorrow();
		if (p1 == null)
			return false;
		OneDayData p2 = p1.getTomorrow();
		if (p2 == null)
			return false;
		OneDayData p3 = p2.getTomorrow();
		if (p3 == null)
			return false;

		if (!isZhangTing(before, p1))
			return false;
		if (!isZhangTing(p1, p2))
			return false;
		if (!isZhangTing(p2, p3))
			return false;

		return true;
	}

	private static boolean isZhangTing(OneDayData p2, OneDayData p3) {
		double c = p2.getClose();
		double o = p3.getOpen();
		return o / c > 1.094;
	}

	/**
	 * 可以买入的那一天
	 */
	private static OneDayData getCanBuyDay(OneDayData before) {
		while (true) {
			double close = before.getClose();
			String zhangTingPrice = Market.toPriceString(close * 1.1);
			OneDayData tomorrow = before.getTomorrow();
			if (tomorrow == null)
				return null;
			double low = tomorrow.getLow();
			String tomorrowLow = Market.toPriceString(low);
			if (!zhangTingPrice.equals(tomorrowLow)) {
				return tomorrow;
			}
			before = tomorrow;
		}
	}
}
