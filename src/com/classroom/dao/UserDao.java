package com.classroom.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.classroom.model.User;


@Service @Transactional
public class UserDao {
	@Resource SessionFactory factory;
	
	 
    public void AddUser(User user) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(user);
    }
    
 
    public void DeleteUser (Integer userId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object user = s.load(User.class, userId);
        s.delete(user);
    }
    
    
    public void UpdateUser(User user) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(user);
    }
    
    
    public ArrayList<User> QueryAllUser() {
        Session s = factory.getCurrentSession();
        String hql = "From User";
        Query q = s.createQuery(hql);
        List userList = q.list();
        return (ArrayList<User>) userList;
    }

   
    public User GetUserById(Integer userid) {
        Session s = factory.getCurrentSession();
        User user = (User)s.get(User.class, userid);
        return user;
    }
    
    
    public ArrayList<User> QueryUserInfo(String  username) {
    	Session s = factory.getCurrentSession();
    	String hql = "From User user where 1=1";
    	if(!username.equals("")) hql = hql + " and user.username like '%" + username + "%'";
    	Query q = s.createQuery(hql);
    	List userList = q.list();
    	return (ArrayList<User>) userList;
    }

}

