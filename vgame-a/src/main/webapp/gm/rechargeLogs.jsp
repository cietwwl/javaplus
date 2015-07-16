<%@page import="cn.vgame.a.Server"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.CoinLogDto"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.CoinLogDao.CoinLogDtoCursor"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.CoinLogDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.YiJieRechargeLogDto"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.YiJieRechargeLogDao.YiJieRechargeLogDtoCursor"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.YiJieRechargeLogDao"%>
<%@page import="cn.javaplus.log.Log"%>
<%@page import="cn.vgame.share.ParameterUtil"%>
<%@page import="cn.vgame.a.log.GmLogTranslate"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.GmLogDto"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.GmLogDao.GmLogDtoCursor"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.GmLogDao"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.Daos"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@ taglib
	uri="/struts-tags" prefix="s"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
</head>
<body>

	<%
		String pg = ParameterUtil.getParameter(request, session, "rechargePage");
		String countEve = ParameterUtil.getParameter(request, session, "rechargePageCountEvery");

		if(pg == null) {
			pg = "100000000";
		}
		
		if(countEve == null) {
			countEve = "22";
		}


		
		CoinLogDao dao = Daos.getCoinLogDao();
		CoinLogDtoCursor c = dao.findByDsc("recharge");


		int cev = new Integer(countEve);
		int pageInt = new Integer(pg);
		

		int pageAll;
		int count = c.getCount();
		if (count % cev == 0) {
			pageAll = count / cev;
		} else {
			pageAll = count / cev + 1;
		}

		if (pageInt > pageAll)
			pageInt = pageAll;

		int skip = (pageInt - 1) * cev;
		if(skip > 0) {
			c.skip(skip);
		}
		c.limit(cev);
	%>


	<table border="1">

		<thead>
			<tr>
				<th>付费时间</th>
				<th>角色ID</th>
				<th>昵称</th>
				<th>充值金豆</th>
			</tr>
		</thead>

		<tbody>

		
		
			<%!
				public String getDate(long t) {
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					return sf.format(new Date(t));
				}
			%>
			<%
				for (CoinLogDto dto : c) {
			%>
			
			
			<tr>
				<td><%=dto.getTime()%></td>
				<td><%=dto.getTo()%></td>
				<td><%=Server.getRole(dto.getTo()).getNick()%></td>
				<td><%=dto.getCoin()%></td>
			</tr>
			<%
				}
			%>

		</tbody>

	</table>
	
	
	
	
	
		<form id="nextPage" action="rechargeLogs.jsp" method="post">
			<input type="hidden" name="rechargePageCountEvery" value="<%=cev%>"> <input
				type="hidden" name="rechargePage" value="<%=pageInt + 1%>">
		</form>

		<form id="prePage" action="rechargeLogs.jsp" method="post">
			<input type="hidden" name="rechargePageCountEvery" value="<%=cev%>"> <input
				type="hidden" name="rechargePage" value="<%=pageInt - 1%>">
		</form>
		<form name="jump" action="rechargeLogs.jsp" method="post">
			<a href="rechargeLogs.jsp?rechargePage=<%=1%>&rechargePageCountEvery=<%=cev%>">首页</a>&nbsp;
			<a href="rechargeLogs.jsp?rechargePage=<%=pageInt - 1%>&rechargePageCountEvery=<%=cev%>">上一页</a>
			<%=pageInt + "/" + pageAll%>
			<a href="rechargeLogs.jsp?rechargePage=<%=pageInt + 1%>&rechargePageCountEvery=<%=cev%>">下一页</a>&nbsp;

			<a href="rechargeLogs.jsp?rechargePage=<%=pageAll%>&rechargePageCountEvery=<%=cev%>">末页</a>
			&nbsp;&nbsp;<input type="hidden" name="rechargePageCountEvery" value="<%=cev%>">
			<input type="text" name="rechargePage" value="<%=pageInt%>"> <a
				href="javascript:jump.submit();">go</a> &nbsp;&nbsp;&nbsp;
		</form>
	
	
	
	

	<br>
	<br>
	<a href="menu.jsp">返回</a>
</body>
</html>