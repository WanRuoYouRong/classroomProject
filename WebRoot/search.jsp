<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<meta charset="utf-8" />
   <link rel="shortcut icon" href="images/SR1234.png">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="css/new.css" rel="stylesheet">
    <link href="css/input.css" rel="stylesheet">
<!--javascript-->

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!--<script type="text/javascript" src="js/beautymind.js"></script>-->
<!--------------------------font----------------------------->
<html>
<head>
<title>
查找页面
	</title>
	</head>
<body>
<center><!--居中标签-->

<div class="wrapper">
<header id="header-wrapper">
	
		<div id="header-top">
			<div class="cotainer">
				<div class="half-right">
				 <c:choose>
		       <c:when test="${user.username ==null}">
		         <a href="reg.jsp">注册</a>&nbsp;
		         <a href="login.jsp">登录</a>
		       </c:when>
		       <c:otherwise>
		         <c:out value="${user.username}"></c:out>, 欢迎您!
		       </c:otherwise>
		    </c:choose>
		  		</div>
		  		<div class="clear"></div>
		  	</div>
		</div>
		<!-- middle part: logo / tagline / contact info / menu -->
	<!-- middle part: logo / tagline / contact info / menu -->

	
		<div >
			<div>
				<nav>
					<ul id="main-menu">
						<li><a class="active" href="main.jsp">首页</a></li>
						<li><a class="active">民大教室</a>
							<ul>
								<li><a href="xi.jsp">文化楼西区</a></li>
								<li><a href="dong.jsp">文化楼东区</a></li>
								<li><a href="#">北智楼</a></li>
                                <li><a href="#">南睿楼</a></li>
                                <li><a href="#">中慧楼</a></li>
								<li><a href="sb.jsp">理工楼</a></li>
							</ul>
						</li>
						<li><a href="#">自习向导</a>
							<ul>
							  <li><a href="search.jsp">我要自习</a></li>
							  <li><a href="subject.jsp">查看课表</a></li>
							</ul>
						</li>
						<li><a href="showclass.jsp">美景展示</a></li>
						     <ul>
						     </ul>
						<li><a href="aboutus.jsp">关于我们</a></li>
					</ul>
				</nav>
            </div>					
		</div>
 				
	</header>
	<div class="row">
	<br>	<br>	<br>
	<div class="row1">
  			<a href="main.jsp" class="btn btn-large btn-primary">根据自习室位置查询</a>
  		</div>	
  		
  		
  		<br>	<br>	<br>	<br>	<br>	
		<div class="row2">
		<a href="main2.jsp" class="btn btn-large btn-primary">根据自习时间段查询</a>

	</div>
	</div>


</div>

<div class="footer_div">
	<div class="footer_center">
		<table border="0"  style="margin:auto;t ext-align:center;">
        	<tr>
            	<td style="width:200px; 
                font-family:Cambria, 'Hoefler Text', 'Liberation Serif',
                 Times, 'Times New Roman', serif;">
                	<i class=" icon-search"></i> 快速查看
                </td>
            	<td style="width:200px; 
                font-family:Cambria, 'Hoefler Text', 'Liberation Serif',
                 Times, 'Times New Roman', serif;">
                 	<i class=" icon-star"></i> 友情链接
                </td>
            	<td style="width:200px; 
                font-family:Cambria, 'Hoefler Text', 'Liberation Serif',
                 Times, 'Times New Roman', serif;">
                	<i class=" icon-phone-sign"></i> 联系我们
                </td>
                
            </tr>
			<tr>
				<td style="width:200px;">
                	<a href="dong.jsp" style="color: #006314;">文华楼东区课表</a>
                </td>
				<td style="width:200px;">
                	<a href="http://i.muc.edu.cn" style="color: #0054C5">i民大信息服务平台</a>
                </td>
				<td style="width:200px;">
                	<i class=" icon-folder-close"></i> 邮件:<u>823952435@qq.com</u>
                </td>
			</tr>
			<tr>
            	<td>
					<a href="xi.jsp" style="color: #006314;">文华楼西区课表</a>
				</td>
                <td style="width:200px;">
                	<a href="https://v2.bootcss.com/" style="color: #0054C5">
                    	Bootstrap
                    </a>
                </td>
				<td style="width:200px;">
                	<i class=" icon-phone"></i> 电话：&nbsp;188 &nbsp;1137 &nbsp;0863
                </td>
			</tr>
			<tr>
				<td>
					<a href="#" style="color: #006314;">南睿楼</a>
				</td>
				<td style="width:200px;">
                	<a href="http://www.bootcss.com/p/font-awesome/ " style="color: #0054C5">
                    	Font Awesome
                    </a>
                </td>
				<td style="width:200px;">
                	<i class=" icon-github-alt"></i> QQ：&nbsp;823&nbsp;952 &nbsp;435
                </td>
			</tr>
            <tr>
				<td>
					<a href="#" style="color: #006314;">中慧楼</a>
				</td>
            </tr>
            <tr>
				<td>
					<a href="#" style="color: #006314;">北智楼</a>
				</td>
            </tr>
            <tr>
				<td>
					<a href="#" style="color: #006314;">图书馆</a>
				</td>
            </tr>
		</table>
        <div style=" border-top:1px solid #FFFCFC;">
        	Copyright &nbsp; @ &nbsp; MUC &nbsp;Self-study&nbsp;Room&nbsp;Management&nbsp;System
        </div>
	</div>
</div>
</center>
</body>
</html>