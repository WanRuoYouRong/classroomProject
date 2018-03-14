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
    
    <title>管理员登录页面</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/logreg.css">
	<link rel="shortcut icon" href="<%=basePath%>images/SR1234.png">
 
	
  </head>  
  
  <body>
   	
   	<header></header>
   	
  		<div class="container">
  		<br>
        	<h1>MUC自习室管理系统管理员登录页面</h1>
            <br>
            <p>尊敬的管理员请您登录该页面</p>
        </div>  	
  	
   <div class="form-box">
    	<div class="form-top">
        	<div class="form-top-left">
            	<h3>Login to our site</h3>
                <p>Enter your username and password to log on:</p>
            </div>
            <div class="form-top-right">
                <i class="fa fa-lock"></i>
            </div>
        </div>
        
        <div class="form-bottom">
		    <form action="admin/admin_login" method="post">
		    
		      <div class="form-group">
		      <input type="text" name="admin.adminname" class="btn" label="管理员用户名" placeholder="请输入管理员用户名"  >
		      </div>
		      
		      <div class="form-group">
		      <input type="password" name="admin.password" class="btn" label="密码" placeholder="请输入密码"  >
		      </div>
		      
		      <button type="submit" class="btn">登&nbsp;录</button>
		    </form>
	    </div>
   	</div>
         
  </body>
</html>
