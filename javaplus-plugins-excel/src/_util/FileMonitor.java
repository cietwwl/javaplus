package _util;


/**
 * 文件监听器
 * @author 林岑
 *
 */
public interface FileMonitor {

	void addListener(FileListener fileChangeListener);

	void start();

	/**
	 * 停止监听
	 */
	void stopNormal();

	/**
	 * 重定位
	 * @param dir
	 */
	void relink(String dir);
}
