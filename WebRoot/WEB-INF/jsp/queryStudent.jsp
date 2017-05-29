<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryStudent.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
  <script type="text/javascript">
  	function requestJson(){
  		$.ajax({
  			url:"jasonConvert.action",
  			type:"post",
  			data:'{"studentname":"zhangsan","age":10}',
  			contentType:"application/json;charset=utf-8",
  			success:function(data){
  				alert(data.studentname);
  			}
  		});
  	};
  </script>
  </head>
  
  <body>
  <!--从session中直接取出数据  -->
  ${student1}
  <!--从HttpServletRequest对象中直接取出数据  -->
  ${request}
    <c:forEach items="${studentInfo}"  var = "student">
    	${student.studentname}
    </c:forEach>
    
    <form action = "${pageContext.request.contextPath}/saveStudent.action" method = "post">
    	<table width="100%" border="1">
    		<tr>
    			<td>选择</td>
    			<td>学生姓名</td>
    			<td>学生年龄</td>
    			<td>mapTest</td>
    		</tr>
    		<tr>
    			<td><input type = "text" name = "list[0].studentname"/></td>
    			<td><input type = "text" name = "student.studentname"/></td>
    			<td><input type = "text" name = "student.age" /></td>
    			<td><input type = "text" name = "student.map['name']"/></td>
    		</tr>
    	</table>
    	<input type = "submit" value = "提交" />
    	<input type = "button" value = "提交json数据" onclick = "requestJson()"/>
    </form>
  </body>
</html>
