<%@page import="com.mongodb.DBCursor"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="cn.vgame.a.gen.dto.MongoGen.CollectionFetcher"%>
<%@page import="cn.vgame.a.result.ErrorResult"%>
<%@page import="cn.javaplus.log.Log"%>
<%@page import="com.hp.hpl.sparta.Document"%>
<%@page import="cn.vgame.share.GameException"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@ taglib
	uri="/struts-tags" prefix="s"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" import="cn.vgame.a.gen.dto.MongoGen.Daos"%>
<%@ page language="java" import="cn.vgame.a.gen.dto.MongoGen.RoleDao"%>
<%@ page language="java"
	import="cn.vgame.a.gen.dto.MongoGen.RoleDao.RoleDtoCursor"%>
<%@ page language="java" import="cn.vgame.a.gen.dto.MongoGen.RoleDto"%>
<%@ page language="java" import="cn.javaplus.util.Util"%>

<html>
<head>
<%@include file="head.html"%>
</head>
<center>
<body>
	<div style="width: 95%; ">
	<%
	
	int cev = 1000;
				StringBuffer ssb = new StringBuffer();

				

				RoleDao dao = Daos.getRoleDao();

				String pg = request.getParameter("page");
				String cv = request.getParameter("countEvery");
				String guanJianZi = request.getParameter("guanJianZi");
				String query_users_sort = request.getParameter("query_users_sort");
				
				
				RoleDtoCursor find;
				
				if(guanJianZi != null ) {
					session.setAttribute("guanJianZi", guanJianZi);
				}
				
				if(query_users_sort != null ) {
					session.setAttribute("query_users_sort", query_users_sort);
				}
				
				guanJianZi= (String)session.getAttribute("guanJianZi");
				query_users_sort= (String)session.getAttribute("query_users_sort");
				
				
				if(pg != null) {
					session.setAttribute("page", pg);
				}
				
				pg = (String)session.getAttribute("page");
				
				if(guanJianZi == null) {
					guanJianZi = "";
				}
				
				if(guanJianZi.trim().isEmpty()) {
					
					
					DBCollection c = Daos.getCollection("Role");
					DBCursor sort;
					
					if(query_users_sort != null) {
						sort = c.find().sort(new BasicDBObject(query_users_sort, -1));
					} else {
						sort = c.find();
					}
					
					find = new RoleDtoCursor(sort);
					
				} else {
					guanJianZi = "*" + guanJianZi + "*";
					guanJianZi = guanJianZi.replaceAll("\\*+", "*");
					Log.d(guanJianZi);
					find = dao.findByNickFuzzy(guanJianZi);
				}
				
				int p = pg == null ? 0 : new Integer(pg);
				int countEvery = cv == null ? cev : new Integer(cv);

				if (p < 1)
					p = 1;

				if (countEvery > 2000 || countEvery <= 0)
					throw new ErrorResult("countEvery must < 2000 and > 0 ").toException();

				int pageAll;
				int count = find.getCount();
				if (count % countEvery == 0) {
					pageAll = count / countEvery;
				} else {
					pageAll = count / countEvery + 1;
				}

				if (p > pageAll)
					p = pageAll;

				int skip = (p - 1) * countEvery;
				if(skip > 0) {
					find.skip(skip);
				}
				find.limit(countEvery);
				
	 %>
		<form id="nextPage" action="queryUsers.jsp" method="post">
			<input type="hidden" name="countEvery" value="<%=cev%>"> <input
				type="hidden" name="page" value="<%=p + 1%>">
		</form>

		<form id="prePage" action="queryUsers.jsp" method="post">
			<input type="hidden" name="countEvery" value="<%=cev%>"> <input
				type="hidden" name="page" value="<%=p - 1%>">
		</form>
		<form name="jump" action="queryUsers.jsp" method="post">
			<a href="queryUsers.jsp?page=<%=1%>&countEvery=<%=cev%>&guanJianZi=<%=guanJianZi%>">首页</a>&nbsp;
			<a href="queryUsers.jsp?page=<%=p - 1%>&countEvery=<%=cev%>&guanJianZi=<%=guanJianZi%>">上一页</a>
			<%=p + "/" + pageAll%>
			<a href="queryUsers.jsp?page=<%=p + 1%>&countEvery=<%=cev%>&guanJianZi=<%=guanJianZi%>">下一页</a>&nbsp;

			<a href="queryUsers.jsp?page=<%=pageAll%>&countEvery=<%=cev%>&guanJianZi=<%=guanJianZi%>">末页</a>
			&nbsp;&nbsp;<input type="hidden" name="countEvery" value="<%=cev%>">
			<input type="text" name="page" value="<%=p%>"> <a
				href="javascript:jump.submit();">go</a> &nbsp;&nbsp;&nbsp;<input
				type="text" name="guanJianZi" value="<%=guanJianZi%>"><a
				href="javascript:jump.submit();">查找</a>
		</form>


			<%!void print(StringBuffer sb, RoleDto dto) {

		String fengHao = dto.getHasFengHao() ? "&nbsp;&nbsp;&nbsp;<font color=\"#FF5555\">封号中</font>" : "";
		String jinYan = dto.getHasJinYan() ? "&nbsp;&nbsp;&nbsp;<font color=\"#FF5555\">禁言中</font>" : "";
		String robot = dto.getIsRobot() ? "&nbsp;&nbsp;&nbsp;<font color=\"#FF5555\">机器人</font>" : "";

		sb.append("<tr>");

		sb.append("<td>");
		sb.append("<a href=\"setUser.jsp?roleId=" + dto.getId() + "\">"
				+ dto.getId() + "</a>" + fengHao + jinYan + robot);
		sb.append("</td>");

		sb.append("<td>");
		sb.append(dto.getOwnerId());
		sb.append("</td>");

		sb.append("<td>");
		sb.append(dto.getNick());
		sb.append("</td>");

		sb.append("<td>");
		sb.append(dto.getCoin());
		sb.append("</td>");
		sb.append("<td>");
		sb.append(dto.getBankCoin());
		sb.append("</td>");
		sb.append("<td>");
		sb.append(dto.getJiangQuan());
		sb.append("</td>");

		sb.append("<td>");
		sb.append(Util.Time.format(dto.getCreateTime()));
		sb.append("</td>");
		
		sb.append("<td>");
		sb.append(dto.getCreateIp());
		sb.append("</td>");
		
		sb.append("<td>");
		if(dto.getIsRobot()) {
			sb.append("<a href=\"setRobot?robot=false&roleId=" + dto.getId() + "\">取消</a>");
		} else {
			sb.append("<a href=\"setRobot?robot=true&roleId=" + dto.getId() + "\">设置为机器人</a>");
		}
		sb.append("</td>");

		sb.append("</tr>");

	}%>

		<table  border="1">
			<thead>
				<tr>
					<th>角色ID</th>
					<th>所属帐号</th>
					<th>昵称</th>
					<th><a href="queryUsers.jsp?query_users_sort=coin">金币</a></th>
					<th><a href="queryUsers.jsp?query_users_sort=bankCoin">仓库</a></th>
					<th><a href="queryUsers.jsp?query_users_sort=jiangQuan">奖券</a></th>
					<th><a href="queryUsers.jsp?query_users_sort=createTime">创建时间</a></th>
					<th><a href="queryUsers.jsp?query_users_sort=createIp">创建IP</a></th>
					<th>机器人</th>
				</tr>
			</thead>
			<%
				
				
				for (RoleDto dto : find) {
					print(ssb, dto);
				}

				out.println(ssb.toString());
			%>
			
		</table>





			<%
				if(guanJianZi != null && !guanJianZi.trim().isEmpty()) {
			 %>
			 		总记录:<%=count %>&nbsp;&nbsp;&nbsp;&nbsp;以上是查找&nbsp;&nbsp;&nbsp;[  <%=guanJianZi %>  ]&nbsp;&nbsp;&nbsp;的结果
			<%
				} else {
			 %>
			 		总记录:<%=count %>&nbsp;&nbsp;&nbsp;&nbsp;以上是所有结果
			<%
				}
			 %>
		<br>
<br><br>

	</div>
	</center>
</body>
</html>
