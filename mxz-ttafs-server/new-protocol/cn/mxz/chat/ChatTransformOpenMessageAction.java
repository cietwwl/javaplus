package cn.mxz.chat;import cn.mxz.communication.Action;import cn.javaplus.comunication.ProtocolUser;import cn.mxz.communication.Action;public class ChatTransformOpenMessageAction<U extends ProtocolUser> implements Action<U> {	/**	 * 执行前	 */	@Override	public void excuteBefore(U user, Object... args) {		Args as = new Args(args);	}	/**	 * 执行	 */	@Override	public void excute(U user, Object... args) {		Args as = new Args(args);	}	/**	 * 执行后	 */	@Override	public void excuteAfter(U user, Object... args) {		Args as = new Args(args);	}	/**	 * 执行发生异常后	 */	@Override	public void excuteException(U user, Object... args) {		Args as = new Args(args);	}	/**	 * 执行完毕(不管异常不异常)	 */	@Override	public void excuteFinally(U user, Object... args) {		Args as = new Args(args);	}		private class Args {		int type;
			Args(Object... args) {			this.type = (Integer) args[0];
		}	}}