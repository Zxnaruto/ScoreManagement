<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body style="background: url(images/6.jpg)">
 ${message} 
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<table align="center" border="1">
		<tr>
			<td align="center" colspan="6">欢迎查看学生列表信息</td>
		</tr>
		<tr>
			<td>序号</td>
			<td>姓名</td>
			<td>平时成绩</td>
			<td>考试成绩</td>
			<td>最终成绩</td>
			<td>操作</td>
		</tr>
		<tr>
			<c:forEach items="${list}" var="score">
				<tr>
					<td>${score.stuNo}</td>
					<td>${score.stuName}</td>
					<td>${score.dailyScore}</td>
					<td>${score.examScore}</td>
					<!--使用fmt:formatNumber来格式化小数点后的位数  -->
					<td><fmt:formatNumber
							value="${score.dailyScore*0.4 + score.examScore*0.6}"
							pattern="##.#" minIntegerDigits="1"></fmt:formatNumber>
					</td>
					<!-- 使用c:set标签，声明一个sum变量用来累计总分 -->
					<c:set value="${sum+(score.dailyScore*0.4 + score.examScore*0.6)}"
						var="sum"></c:set>
						<td><a href="javascript:void(0)" onclick="if(confirm('你确定要删除吗？')){location.href ='score!del?score.stuNo=${score.stuNo}'}">删除</a>/
						<a href="score!toUpdate?score.stuNo=${score.stuNo}">修改</a></td>
						
				</tr>
				
			</c:forEach>
		</tr>
		<tr>
			<td colspan="4" align="center">平均分</td>
			<td><fmt:formatNumber
							value="${sum/fn:length(list)}"
							pattern="##.##" minIntegerDigits="1"></fmt:formatNumber>
					</td>
			<!-- <td>${sum/fn:length(list)}</td> -->
		</tr>

	</table>
	<br>
	<center>
		<input align="middle" onclick="location.href='add.jsp'" type="button"
			value="新增学员考试信息">
	</center>
	<!-- <center><a href="add.jsp">新增学员考试信息</a></center> -->


</body>
</html>
