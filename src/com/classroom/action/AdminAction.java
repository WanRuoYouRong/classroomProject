package com.classroom.action;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;  
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.classroom.dao.AdminDao;
import com.classroom.model.Admin;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class AdminAction extends ActionSupport implements SessionAware{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*业务层对象*/
    @Resource AdminDao adminDao;
    
    private Admin admin;
    
    //这两个成员变量是用来做登录拦截的，记得添加setter和getter
    
	private Map<String,Object> session;
	private String prePage;

    

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
	
	private String errMessage;
	
	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
    
	
		/* 验证管理员登录 */
		public String login() {
			
			ArrayList<Admin> listAdmin = adminDao.QueryAdminInfo(admin.getAdminname());
			if(listAdmin.size()==0) { 
				
				this.errMessage = " 账号不存在 ";
				System.out.print(this.errMessage);
				return "input";
				
			} 
			else{
				
				Admin db_admin = listAdmin.get(0);
				if(!db_admin.getPassword().equals(admin.getPassword())) {
				
				this.errMessage = " 密码不正确! ";
				System.out.print(this.errMessage);
				return "input";
				
			    }else{
				
				session.put("admin", db_admin);
				prePage = (String) session.get("prePage");
				System.out.println("将要跳到："+ prePage );
				session.remove("prePage");  
				return "adminsuccess";
				
			    }
			}
			
		}

		public String getPrePage() {
			return prePage;
		}

		public void setPrePage(String prePage) {
			this.prePage = prePage;
		}

}
