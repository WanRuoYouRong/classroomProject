package com.classroom.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.classroom.dao.ClassroomDao;
import com.classroom.model.*;
import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class ClassroomAction extends ActionSupport{
	
	
    @Resource ClassroomDao classroomDao;
    
    
    private Classroom classroom;

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	private List<Classroom> classroomList;
	
	public List<Classroom> getClassroomList() {
		return classroomList;
	}

	public void setClassroomList(List<Classroom> classroomList) {
		this.classroomList = classroomList;
	}
	
	private String keyWords;
	
	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	
private String emptytime;

	public String getEmptytime() {
	return emptytime;
}

public void setEmptytime(String emptytime) {
	this.emptytime = emptytime;
}

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	/*����Classroom*/
	public String addClassroom() throws Exception{
		
		System.out.println(classroom.getClassroomname());
		classroomDao.AddClassroom(classroom);
		return "message";
		
	}
	//��ʾ���е���ϰ��
public String showClassroom() {
        
        classroomList = classroomDao.QueryAllClassroom();
        return "show_view";
    }
	

//��ʾ�����ϰ�ҵľ�����Ϣ
public String showDetail() {
	classroom = classroomDao.GetClassroomById(classroom.getClassroomid());
    return "detail_view";
}

/*��ʾ�༭*/
public String showEdit() throws Exception {
	classroom = classroomDao.GetClassroomById(classroom.getClassroomid());
    return "edit_view";
}

/*�༭classroom*/
public String editClassroom() throws Exception {
	classroomDao.UpdateClassroom(classroom);
    return "edit_message";
}

/*ɾ��Classroom*/
public String deleteClassroom() throws Exception {
	classroomDao.DeleteClassroom(classroom.getClassroomid());
    return "delete_message";
}

/*��ѯClassroom*/
public String queryClassrooms() throws Exception {
	classroomList = classroomDao.QueryClassroomInfo(keyWords);
    return "show_view";
}

public String queryClassroomswithtime() throws Exception {
	classroomList = classroomDao.QueryClassroomTime(emptytime);
    return "show_view";
}


}
