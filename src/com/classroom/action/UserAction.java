package com.classroom.action;

import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;  
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.classroom.dao.UserDao;
import com.classroom.model.User;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class UserAction extends ActionSupport implements SessionAware{
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*业务层对象*/
    @Resource UserDao userDao;
    
    private User user;
    
    //这两个成员变量是用来做登录拦截的，记得添加setter和getter
    
	private Map<String,Object> session;
	private String prePage;

    

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
	
	/*
	public String reg() throws Exception{
		customerDao.AddCustomer(customer);
		session.put("Customer", customer);
		return "show_view";
		
	}*/
	
    //注册，并在session中加入用户名
	public String reg() throws Exception{
		userDao.AddUser(user);
		session.put("user", user);
		return "show_view";

	}
    
	/* 验证用户登录 */
	/*public String login() {
		User db_user = (User)userDao.QueryUserInfo(user.getUsername()).get(0);
		if(db_user == null) { 
			
			this.errMessage = " 账号不存在 ";
			System.out.print(this.errMessage);
			return INPUT;
			
		} else if( !db_user.getPassword().equals(user.getPassword())) {
			
			this.errMessage = " 密码不正确! ";
			System.out.print(this.errMessage);
			return INPUT;
			
		}else{
			return "show_view";
			
		}
	}*/
	
		/* 验证用户登录 */
		public String login() {
			
			ArrayList<User> listUser = userDao.QueryUserInfo(user.getUsername());
			if(listUser.size()==0) { 
				
				this.errMessage = " 账号不存在 ";
				System.out.print(this.errMessage);
				return "input";
				
			} 
			else{
				
				User db_user = listUser.get(0);
				if(!db_user.getPassword().equals(user.getPassword())) {
				
				this.errMessage = " 密码不正确! ";
				System.out.print(this.errMessage);
				return "input";
				
			    }else{
				
				session.put("user", db_user);
				prePage = (String) session.get("prePage");
				System.out.println("将要跳到："+ prePage );
				session.remove("prePage");  
				return "success";
				
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
