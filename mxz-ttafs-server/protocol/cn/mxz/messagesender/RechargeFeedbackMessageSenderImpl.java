package cn.mxz.messagesender;import com.lemon.commons.socket.ISocket;import cn.javaplus.comunication.PacketCompressedByZlib;public class RechargeFeedbackMessageSenderImpl implements RechargeFeedbackMessageSender{	/**	 *	 */	public void xxx(ISocket socket) {		PacketCompressedByZlib p = new PacketCompressedByZlib();		p.putInt(340003);				p.putString("");		p.send(socket);	}}