<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/logreg.css">
	<link rel="shortcut icon" href="<%=basePath%>images/SR1234.png">
  </head>
  
  <body>
  <header></header>

	<div class="container">
	    <h1>MUC自习室管理系统注册页面</h1>
	    <div class="description">
	        
	    </div>
	 </div>  	
	 
<div class="form-box"> 		  	    	    
	<div class="form-top">
	  <div class="form-top-left">
	     <h3>注册</h3>
	     <p>输入你的账号和密码:</p>
	  </div>
	  <div class="form-top-right">
	  	<i class="fa fa-lock"></i>
	  </div>
	</div>

	<div class="form-bottom">
		    <form action="user/user_reg" method="post">
		      <div class="form-group">
		      <input type="text" name="user.username" class="btn"  placeholder="用户名"  >
		      </div>
		      
		      <div class="form-group">
		      <input type="password" name="user.password" class="btn"  placeholder="密码"  >
		      </div>
		      
		       
		      <button type="submit" class="btn">注册!</button>
		    </form>
	    </div>
   	</div>
         
  </body>
</html>