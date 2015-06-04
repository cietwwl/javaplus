package cn.javaplus.comunication;import java.lang.reflect.Method;import java.util.Iterator;import java.util.Set;import cn.javaplus.compressor.ZLib;import cn.javaplus.util.Util;import com.alibaba.fastjson.JSON;import com.alibaba.fastjson.JSONObject;import com.google.common.collect.Sets;public class Responser {	private ProtocolUser user;	public Responser(ProtocolUser user) {		this.user = user;	}	/**	 * 反馈这个对象到指定的方法里面	 * 	 * @param method	 *            反馈到指定的某个方法 方法的引用请选用 自动生成的Methods类里面的所有方法	 * @param result	 *            结果	 */	public void response(Method method, Object result) {		Class<?> t = method.getReturnType();		if (!t.isInstance(result)) {			throw new MethodReturnTypeError("方法的返回值和实际返回值类型不一致!");		}		JSONObject json = (JSONObject) JSON.toJSON(result);//		System.out.println("Responser.response()" + json);		// filter(method.getReturnType().getName(), json); // 过滤不必要的字段		send(method, json);	}	/**	 * 反馈一个空响应给客户端	 * 	 * @param method	 */	public void response(Method method) {		JSONObject json = new JSONObject();		send(method, json);	}	/**	 * 返回错误消息给客户端	 * 	 * @param method	 * @param e	 */	public void responseError(Method method, Throwable e) {		JSONObject json = getErrorJson(e);		send(method, json);	}	private void send(Method method, JSONObject json) {		putHead(method, json);		responseToClient(json);	}	private void putHead(Method method, JSONObject json) {		json.put("className", method.getDeclaringClass().getName());		json.put("methodName", method.getName());	}	@SuppressWarnings("unused")	private void filter(String className, JSONObject json) {		// FIXME 过滤时, 注意is has 方法		Class<?> c = ProtocolsLoader.getClass(className);		Set<String> filedsName = getFiledsName(c);		Set<String> keySet = json.keySet();		Iterator<String> it = keySet.iterator();		while (it.hasNext()) {			String k = (String) it.next();			if (!filedsName.contains(k)) {				it.remove();			}		}	}	private static Set<String> getFiledsName(Class<?> c) {		Method[] methods = c.getMethods();		Set<String> ss = Sets.newHashSet();		for (Method method : methods) {			String name = method.getName();			if (name.startsWith("get")) {				name = name.replaceFirst("get", "");				name = Util.Str.firstToLowerCase(name);			}			ss.add(name);		}		return ss;	}	private JSONObject getErrorJson(Throwable e) {		JSONObject json;		json = new JSONObject();		String message = e.getMessage();		if (message == null || message.isEmpty()) {			message = e.getClass().getName();		}		json.put("error", message);		return json;	}	public void responseToClient(JSONObject json) {		PacketS2C p = new PacketS2C();		p.putInt(1800000000);		p.putString(json.toString());		p.compress(new ZLib());		if(user == null) {			return;		}		p.send(user.getSocket());	}	public void response(String className, String methodName, Object o) {		JSONObject json = (JSONObject) JSON.toJSON(o);		send(className, methodName, json);	}	public void response(String className, String methodName) {		JSONObject json = new JSONObject();		send(className, methodName, json);	}	private void send(String className, String methodName, JSONObject json) {		json.put("className", className);		json.put("methodName", methodName);		responseToClient(json);	}}