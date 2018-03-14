<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<meta charset="utf-8" />
   <link rel="shortcut icon" href="images/SR1234.png">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="<%=basePath %>css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="<%=basePath %>css/new.css" rel="stylesheet">
    <link href="<%=basePath %>css/input.css" rel="stylesheet">
    <link rel="stylesheet" href="<%=basePath %>css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath %>css/font-awesome.css">

<!--javascript-->

    <script src="<%=basePath %>js/jquery.js"></script>
    <script src="<%=basePath %>js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=basePath %>js/beautymind.js"></script>
<!--------------------------font----------------------------->
  <head>
    <base href="<%=basePath%>">
    
    <title>main2</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
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
		         <a href="login.jsp">登录</a>&nbsp;
		         <a href="adminlogin.jsp">管理员登录</a>
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
    <div id="myCarousel" class="carousel slide">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
	</ol>   
	<!-- 轮播（Carousel）项目 -->
	<div class="carousel-inner">
		<div class="item active">
			<img src="images/slider/940x354/1.jpg" alt="First slide">
			<div class="carousel-caption">敏而好学,不耻下问</div>
		</div>
		<div class="item">
			<img src="images/slider/940x354/2.jpg" alt="Second slide">
			<div class="carousel-caption">不积跬步，无以至千里；不积小流，无以成江海</div>
		</div>
		<div class="item">
			<img src="images/slider/940x354/3.jpg" alt="Third slide">
			<div class="carousel-caption">业精于勤而荒于嬉，行成于思而毁于随</div>
		</div>
	</div>
	<!-- 轮播（Carousel）导航 -->
	<a class="carousel-control left" href="#myCarousel" 
	   data-slide="prev">&lsaquo;</a>
	<a class="carousel-control right" href="#myCarousel" 
	   data-slide="next">&rsaquo;</a>
</div> 
<br><br>
<main>
	    <s:form action="classroom/classroom_queryClassroomswithtime" method="post">
	      
	      <div>
	         <s:submit value="查 询" cssClass="search-go"></s:submit>
	         <input class="search" type="text" name="emptytime" placeholder="请选择自习室空闲时间">
	         <br>
	      </div>
	      
	<br>
	
	      <table align="center" class="altrowstable_main" id="alternatecolormain2">
	      
	        <tr>
	        	<br><br><br>  
	          <th >自习室序号</th>  
	          <th>自习室名称</th>
	          <th>空闲时间</th> 
	          <th>操作</th>  
	          <th>操作</th>
	          <th>操作</th>
	        </tr> 
	        <c:forEach var="classroom" items="${classroomList}" varStatus="status">
	          <tr>
	            <td><c:out value="${status.index+1}"></c:out></td>
	            <td><a href="classroom/classroom_showDetail?classroom.classroomid=${classroom.classroomid}">
	            <c:out value="${classroom.classroomname}"></c:out></a></td>
	            <td><c:out value="${classroom.emptytime}"></c:out></td>
	            
	            <td><a href="classroom/classroom_showEdit?classroom.classroomid=${classroom.classroomid}">编辑</a></td>
	            <td><a href="classroom/classroom_deleteClassroom?classroom.classroomid=${classroom.classroomid}">删除</a></td>
	            
	          </tr>
	        </c:forEach>
	   
	      </table>
	     
	    </s:form>
	    
	    
	</main>
     <br><br>
<div class="footer_div">
	<div class="footer_center">
		<table class"footer">
        	<tr>
            	<td style="width: 200px;">
                	<i class=" icon-search"></i> 快速查看
                </td>
            	<td style="width: 200px;">
                 	<i class=" icon-star"></i> 友情链接
                </td>
            	<td style="width: 200px;">
                	<i class=" icon-phone-sign"></i> 联系我们
                </td>
                
            </tr>
			<tr>
				<td style="width: 200px;">
                	<a href="dong.jsp" style="color: #006314;">文华楼东区课表</a>
                </td>
				<td style="width: 200px;">
                	<a href="http://i.muc.edu.cn" style="color: #0054C5">i民大信息服务平台</a>
                </td>
				<td style="width: 200px;">
                	<i class=" icon-folder-close"></i> 邮件:<u>823952435@qq.com</u>
                </td>
			</tr>
			<tr>
            	<td style="width: 200px;">
					<a href="xi.jsp" style="color: #006314;">文华楼西区课表</a>
				</td>
                <td style="width: 200px;">
                	<a href="https://v2.bootcss.com/" style="color: #0054C5">
                    	Bootstrap
                    </a>
                </td>
				<td style="width: 200px;">
                	<i class=" icon-phone"></i> 电话：&nbsp;188 &nbsp;1137 &nbsp;0863
                </td>
			</tr>
			<tr>
				<td style="width: 200px;">
					<a href="#" style="color: #006314;">南睿楼</a>
				</td>
				<td style="width: 200px;">
                	<a href="http://www.bootcss.com/p/font-awesome/ " style="color: #0054C5">
                    	Font Awesome
                    </a>
                </td>
				<td style="width: 200px;">
                	<i class=" icon-github-alt"></i> QQ：&nbsp;823&nbsp;952 &nbsp;435
                </td>
			</tr>
            <tr>
				<td style="width: 200px;">
					<a href="#" style="color: #006314;">中慧楼</a>
				</td>
            </tr>
            <tr>
				<td style="width: 200px;">
					<a href="#" style="color: #006314;">北智楼</a>
				</td>
            </tr>
            <tr>
				<td style="width: 200px;">
					<a href="#" style="color: #006314;">图书馆</a>
				</td>
            </tr>
		</table>
        <div style=" border-top:1px solid #FFFCFC;">
        	Copyright &nbsp; @ &nbsp; MUC &nbsp;Self-study&nbsp;Room&nbsp;Management&nbsp;System
        </div>
	</div>
</div>



	</div>
	</center>
   
       <div class="logo"></div>
		    
    </header>
    
    
  </body>
</html>
