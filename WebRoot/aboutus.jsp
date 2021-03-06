<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
展示页面
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
        <div class="aboutus0">
        <br><br>
        
        <h3 class="aboutus">
       MUC自习室管理系统涉及中央民族大学的自习室周一至周五的上课、开会及自习使用情况，通过简单的输入查询步骤使学生了解当前这些教室的被占用的情况，从而方便学生自习。建设这个网站，能为本学校的学生带来切实的利益，方便学生自习。并可通过网站与一些学习平台进行商业合作，扩大网页功能与内容。
        </h3>
        
        
        <br><br>
        
        <h4 class="aboutus1">
       &nbsp;
       MUC自习室管理系统网站。具备动态、实时、交互、协作等特点，网站运行模式要求前台和后台，前台使呈现给网络用户的外部网站系统，后台是网站内容的管理系统。
       <br>
       &nbsp;
      明确学习信息网站建设的目标，需要首先了解学校自习室系统分配的主要职能：根据不同院系、不同年级、不同课程系统地对全校的自习室进行有条不紊地分配；协调各学生组织及社团组织活动的占用教室情况，防止活动发生冲突的情况；安排教师补课教室，避免与上课教室冲突。
      <br>
      &nbsp;
      因此，结合以上工作需要，MUC自习室管理系统网站应该满足以下设计目标和要求。
      <br>
      &nbsp;
（1）系统要有广泛的通用性，可以满足上课学生、自习学生、学生组织活动负责人、教师对自习室的需求。
<br>
      &nbsp;
（2）良好的安全性。要保证学生、教师、管理员使用自己的学号注册后的唯一性，防止他人冒用。安全性是通过为信息的机密性、保密性、完整性和可靠性提供充分的保护来预防风险。保障系统安全，是任何成果的基本要素。
<br>
      &nbsp;
（3）具有完整的在线查找功能。例如，学生能够轻松找到某个时刻的空闲教室，并进行自习，或登记展开学生组织活动；教师也可以找到空闲教室进行补课。
<br>
      &nbsp;
（4）良好的可扩展性。系统需要有良好的可扩展性，满足不同人员对教室的不同需求。可扩展性是指系统能保证可持续增长以满足用户需求何业务复杂性要求。Web系统为动态变化的模型：他们通常一开始很小，但随着需求的增长而增长。这种增长非常迅速，不仅表现在使用用户的数量上，而且表现在提供的用户服务的复杂性和集成性方面。对于MUC自习室管理系统来说，这种可扩展性尤为重要，因为自习室每学期的课表都是不一致的，而且随着学生人数的不断增长，网站的需求也是不断增长的，这种可扩展性还是非常重要的。
<br>
      &nbsp;
（5）可管理性和可维护性。可管理性是指可以很方便地对系统进行管理和维护确保系统的正常运作。MUC自习室管理系统中包括不同用户，每个拥护根据自己的角色，需要拥有不同的系统功能权限。MUC自习室管理系统需要提供统一的交流平台，以供各级管理人员、教师、学生交互信息。内容。
        </h4>
        


        <table>
        	<tr align="center">
            	<th>开发团队</th>
            </tr>
        	<tr>
            	<td><img src="images/xxr.jpg" class="img-circle" height="204" width="182" ></td>
                <td width="200"><h4>我是徐馨润，一个很神秘的人物，暂无相关介绍。</h4></td>
                <td><img src="images/pyr.jpg" class="img-circle" height="204" width="182"></td>
                <td width="200"><h4>我是彭毅溶，爱逛B站，是ACG文化的忠实FANS。现实生活中喜欢搞“机”，鼓捣和电脑有关的技术，因此室友的电脑基本上都被其拆过，曾发生过组装回去后多了一个零件的搞笑事件。座右铭是“我们的征途是星辰大海！”。</h4></td>
            </tr>
            <tr>
            	<td><img src="images/tzy.jpg" class="img-circle" height="204" width="182"></td>
                <td width="200"><h4>我是汤志毅，集逗逼正经于一身，夺智慧强壮为一体。曾经练过八块腹肌，最终练至大成九九归一，却仍不能掩盖我身上散发的男性魅力，我……（不好意思雷劈下来了先不说了）</h4></td>
                <td><img src="images/gq.jpg" class="img-circle" height="204" width="182"></td>
                <td width="200"><h4>我的中文名字叫郭钦，日本名字是HaKuKing，喜欢打LOL，看电影，表面上看我是一个岁月静好的美男子，但实际上我是一个很有内涵BOY。</h4></td>
            </tr>
        </table>

        

 
 		</div>		
	</header>
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

</div>
</center>
</body>
</html>
