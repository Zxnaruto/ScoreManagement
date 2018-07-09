<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'edit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  ${message}
  <body style="background: url(images/6.jpg)">
  <br> <br> <br> <br> <br>
   <center>
   <form action="score!doUpdate" method="post">
    <!-- 将不用修改的score.stuNo放入隐藏作用域 -->
      <input type="hidden" name="score.stuNo" value="${score.stuNo}">
      <p>编辑学生考试信息</p>
      <p>姓名：<input type="text" name="score.stuName" value="${score.stuName}" ></p>
      <p>平时：<input type="text" name="score.dailyScore" value="${score.dailyScore}"></p>
      <p>考试：<input type="text" name="score.examScore" value="${score.examScore}"></p>
      <p>班级：
      <select name="score.clsNo">
      <option value="no1">计科01班</option>
       <option value="no2">计科02班</option>
        <option value="no3">计科03班</option>
      </select>
      </p>
      <p><input type="submit" value="提交"></p>
        </form>
  </center>
  </body>
</html>
