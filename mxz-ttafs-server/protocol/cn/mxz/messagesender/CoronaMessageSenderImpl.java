package cn.mxz.messagesender;import com.lemon.commons.socket.ISocket;import cn.javaplus.comunication.PacketCompressedByZlib;public class CoronaMessageSenderImpl implements CoronaMessageSender{	/**	 *	 */	public void xxx(ISocket socket) {		PacketCompressedByZlib p = new PacketCompressedByZlib();		p.putInt(90004);				p.putString("");		p.send(socket);	}}