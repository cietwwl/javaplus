package org.hhhhhh.guess.account4web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hhhhhh.guess.Server;
import org.hhhhhh.guess.action.JsonAction;
import org.hhhhhh.guess.config.GameProperties;
import org.hhhhhh.guess.hibernate.dao.Daos;
import org.hhhhhh.guess.hibernate.dao.DbUtil;
import org.hhhhhh.guess.hibernate.dao.KeyValueDao;
import org.hhhhhh.guess.hibernate.dto.KeyValueDto;
import org.hhhhhh.guess.user.User;

import cn.javaplus.mail.MailSenderInfo;
import cn.javaplus.mail.SimpleMailSender;
import cn.javaplus.util.Util;


public class ResetPwdAction extends JsonAction {

	public class Result {
		private int code;

		public Result(int errorCode) {
			code = errorCode;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
	}

	private static final long serialVersionUID = -7706071822124421174L;
	private HttpSession session;

	private String email;

	private String generateResetEmailCode() {
		KeyValueDao dao = Daos.getKeyValueDao();
		KeyValueDto dto = new KeyValueDto();

		String random = Util.Random.getRandomString(32)
				+ Util.Secure.md5(Util.ID.createId());
		random = random.toLowerCase();

		String key = "RESET_PASSWORD:" + random;
		String value = getEmail() + ":" + System.currentTimeMillis();

		dto.setK(key);
		dto.setV(value);

		DbUtil.save(dto);
		return random;
	}

	private void sendEmail(String code) {
		String cc = GameProperties.getStringNoTrim("emailContent");
		String content = cc.replace("EMAIL_CODE", code);
		String title = GameProperties.getString("emailTitle").trim();
		String from = GameProperties.getString("email").trim();
		String host = GameProperties.getString("emailServerHost").trim();
		String port = GameProperties.getString("emailServerPort").trim();
		String pwd = GameProperties.getString("emailPassword").trim();

		String emailTo = getEmail();

		SimpleMailSender s = new SimpleMailSender();
		MailSenderInfo m = new MailSenderInfo();
		m.setValidate(true);
		m.setMailServerHost(host);
		m.setMailServerPort(port);
		m.setUserName(from);
		m.setPassword(pwd);
		m.setFromAddress(from);
		m.setToAddress(emailTo);
		m.setSubject(title);
		m.setContent(content);
		s.sendTextMailInThread(m);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * 给客户端:
	 *   0成功
	 *   1失败
	 *   2操作太频繁
	 */
	@Override
	protected Object exec() {

		HttpServletRequest request = ServletActionContext.getRequest();
		session = request.getSession();

		int errorCode;

		User user = Server.getUser(getEmail());

		if (user != null) {
			String code = generateResetEmailCode();
			sendEmail(code);
			errorCode = 0;
		} else {
			errorCode = 1;
		}

		session.setAttribute("reset_password_error_code", errorCode);

		return new Result(errorCode);
	}

}