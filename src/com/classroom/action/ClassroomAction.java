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

	
	
	/*增加Classroom*/
	public String addClassroom() throws Exception{
		
		System.out.println(classroom.getClassroomname());
		classroomDao.AddClassroom(classroom);
		return "message";
		
	}
	//显示所有的自习室
public String showClassroom() {
        
        classroomList = classroomDao.QueryAllClassroom();
        return "show_view";
    }
	

//显示这个自习室的具体信息
public String showDetail() {
	classroom = classroomDao.GetClassroomById(classroom.getClassroomid());
    return "detail_view";
}

/*显示编辑*/
public String showEdit() throws Exception {
	classroom = classroomDao.GetClassroomById(classroom.getClassroomid());
    return "edit_view";
}

/*编辑classroom*/
public String editClassroom() throws Exception {
	classroomDao.UpdateClassroom(classroom);
    return "edit_message";
}

/*删除Classroom*/
public String deleteClassroom() throws Exception {
	classroomDao.DeleteClassroom(classroom.getClassroomid());
    return "delete_message";
}

/*查询Classroom*/
public String queryClassrooms() throws Exception {
	classroomList = classroomDao.QueryClassroomInfo(keyWords);
    return "show_view";
}

public String queryClassroomswithtime() throws Exception {
	classroomList = classroomDao.QueryClassroomTime(emptytime);
    return "show_view";
}


}
