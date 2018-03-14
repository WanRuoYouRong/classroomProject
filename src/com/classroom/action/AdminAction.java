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

	/*ҵ������*/
    @Resource AdminDao adminDao;
    
    private Admin admin;
    
    //��������Ա��������������¼���صģ��ǵ����setter��getter
    
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
    
	
		/* ��֤����Ա��¼ */
		public String login() {
			
			ArrayList<Admin> listAdmin = adminDao.QueryAdminInfo(admin.getAdminname());
			if(listAdmin.size()==0) { 
				
				this.errMessage = " �˺Ų����� ";
				System.out.print(this.errMessage);
				return "input";
				
			} 
			else{
				
				Admin db_admin = listAdmin.get(0);
				if(!db_admin.getPassword().equals(admin.getPassword())) {
				
				this.errMessage = " ���벻��ȷ! ";
				System.out.print(this.errMessage);
				return "input";
				
			    }else{
				
				session.put("admin", db_admin);
				prePage = (String) session.get("prePage");
				System.out.println("��Ҫ������"+ prePage );
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
