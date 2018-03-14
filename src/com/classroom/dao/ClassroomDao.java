package com.classroom.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.classroom.model.Classroom;

@Service @Transactional
public class ClassroomDao {
	@Resource SessionFactory factory;
	/*����Ա�˹������ϰ����Ϣ,��������*/
	
	public void AddClassroom(Classroom classroom) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(classroom);
    }
	
	public void DeleteClassroom (Integer classroomId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object classroom = s.load(Classroom.class, classroomId);
        s.delete(classroom);
    }
	
	public void UpdateClassroom(Classroom classroom) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(classroom);
    }
	
	/*��ѯ������ϰ��Classroom��Ϣ*/
    public ArrayList<Classroom> QueryAllClassroom() {
        Session s = factory.getCurrentSession();
        String hql = "From Classroom";
        Query q = s.createQuery(hql);
        List classroomList = q.list();
        return (ArrayList<Classroom>) classroomList;
    }

    /*����������ȡ����*/
    public Classroom GetClassroomById(Integer foodid) {
        Session s = factory.getCurrentSession();
        Classroom classroom = (Classroom)s.get(Classroom.class, foodid);
        return classroom;
    }
    
    /*�ص㣬���ݲ�ѯ������ѯ*/
    public ArrayList<Classroom> QueryClassroomInfo(String classroomname) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Classroom classroom where 1=1";
    	if(!classroomname.equals("")) hql = hql + " and classroom.classroomname like '%" + classroomname + "%'";
    	Query q = s.createQuery(hql);
    	List classroomList = q.list();
    	return (ArrayList<Classroom>) classroomList;
    }
    /*�ص㣬������ϰ�ҿ���ʱ���ѯ*/
    public ArrayList<Classroom> QueryClassroomTime(String emptytime) { 
    	Session s = factory.getCurrentSession();
    	String hql = "From Classroom classroom where 1=1";
    	if(!emptytime.equals("")) hql = hql + " and classroom.emptytime like '%" + emptytime + "%'";
    	Query q = s.createQuery(hql);
    	List classroomList = q.list();
    	return (ArrayList<Classroom>) classroomList;
    }

}
