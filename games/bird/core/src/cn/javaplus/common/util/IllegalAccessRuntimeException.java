package cn.javaplus.common.util;

public class IllegalAccessRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 6981571071554325461L;

	public IllegalAccessRuntimeException(IllegalAccessException e) {
		super(e);
	}

}
