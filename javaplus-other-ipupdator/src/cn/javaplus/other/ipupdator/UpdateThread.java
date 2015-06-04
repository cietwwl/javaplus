package cn.javaplus.other.ipupdator;

import cn.javaplus.mail.MailSenderInfo;
import cn.javaplus.mail.SimpleMailSender;
import cn.javaplus.net.IPFetcher;
import cn.javaplus.time.Time;
import cn.javaplus.util.Util;

public class UpdateThread implements Runnable {

	private static final String	NEW_LINE	= "<br>";

	private long updateLastTime;
	private String lastIp = "";
	
	@Override
	public void run() {
		while (true) {
			
			String ip = IPFetcher.getIP();
			
			if(!ip.equals(lastIp) || longTime()) {
				update(ip);
			}
			
			Util.Thread.sleep(2 * Time.MILES_ONE_MIN);
		}
	}

	private void update(String ip) {
		sendIpToMail(ip);
		lastIp = ip;
		updateLastTime = System.currentTimeMillis();
	}

	private boolean longTime() {
		return System.currentTimeMillis() - updateLastTime > 20 * Time.MILES_ONE_MIN;
	}

	private void sendIpToMail(String ip) {
		
		
		
		//�������Ҫ�������ʼ�
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("ipupdator@163.com");
		mailInfo.setPassword("258819045");//������������
		mailInfo.setFromAddress("ipupdator@163.com");
		mailInfo.setToAddress("ipupdator@163.com");
		mailInfo.setSubject("IP��ַ����");

		mailInfo.setContent(getValue("user.name", "os.name", "os.version", "user.country") + NEW_LINE + "IP:" + ip);

		SimpleMailSender.sendHtmlMail(mailInfo);//����html��ʽ

		System.out.println("IP ��ַ���ͳɹ�:" + ip);
		
	}

	private String getValue(String... s) {
		StringBuilder sb = new StringBuilder();
		for (String string : s) {
			String ss = System.getProperty(string);
			sb.append(string + " : " + ss + NEW_LINE);
		}
		return sb.toString();
	}

}
