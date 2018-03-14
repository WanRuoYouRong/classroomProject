package com.classroom.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.classroom.model.Admin;


@Service @Transactional
public class AdminDao {
	@Resource SessionFactory factory;
	
	public ArrayList<Admin> QueryAllAdmin() {
        Session s = factory.getCurrentSession();
        String hql = "From Admin";
        Query q = s.createQuery(hql);
        List adminList = q.list();
        return (ArrayList<Admin>) adminList;
    }

   
    public Admin GetAdminById(Integer adminid) {
        Session s = factory.getCurrentSession();
        Admin admin = (Admin)s.get(Admin.class, adminid);
        return admin;
    }
    
    
    public ArrayList<Admin> QueryAdminInfo(String  adminname) {
    	Session s = factory.getCurrentSession();
    	String hql = "From Admin admin where 1=1";
    	if(!adminname.equals("")) hql = hql + " and admin.adminname like '%" + adminname + "%'";
    	Query q = s.createQuery(hql);
    	List adminList = q.list();
    	return (ArrayList<Admin>) adminList;
    }

}

