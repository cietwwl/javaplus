package cn.javaplus.common.util;


public class Time {

	/** �?��钟的毫秒�?*/
	public static final long MILES_ONE_MIN = 60 * 1000;

	/** �?��时的毫秒�?*/
	public static final long MILES_ONE_HOUR = 60 * MILES_ONE_MIN;

	/** �?��的毫秒数 */
	public static final long MILES_ONE_DAY = 24 * MILES_ONE_HOUR;

	private int h;
	private int m;
	private int s;

	/**
	 * �?
	 */
	public int getH() {
		return h;
	}

	/**
	 * �?
	 */
	public int getM() {
		return m;
	}

	/**
	 * �?
	 */
	public int getS() {
		return s;
	}

	public Time(long time) {
		h = (int) (time / 3600 % 60);
		m = (int) (time / 60 % 60);
		s = (int) (time % 60);
	}
}
