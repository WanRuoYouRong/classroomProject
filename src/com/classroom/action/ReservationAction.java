package com.classroom.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.classroom.dao.ClassroomDao;
import com.classroom.dao.UserDao;
import com.classroom.dao.ReservationDao;
import com.classroom.model.*;
import com.opensymphony.xwork2.ActionSupport;
@Controller @Scope("prototype")
public class ReservationAction extends ActionSupport{
	
	    @Resource ReservationDao reservationDao;
	    @Resource UserDao userDao;
	    @Resource ClassroomDao classroomDao;
	private Reservation reservation;
    private List<Reservation> reservationList;
    private User user;
    private Classroom classroom;
    
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public List<Reservation> getReservationList() {
		return reservationList;
	}
	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	/*���Order*/
	public String addReservation() throws Exception{
		

		user = userDao.QueryUserInfo(user.getUsername()).get(0);
		Reservation res =new Reservation();
		res.setUser(user);
		res.setClassroom(classroom);
		reservationDao.AddReservation(res);
		return "reservation_message";
		
	}
	
	
    public String showReservation() {
    	
        //��ϵͳ�趨Ϊ�û������ظ��������ϵͳ�в�ѯ����һ���������û�����
    	System.out.println(user.getUsername());
        User use= userDao.QueryUserInfo(user.getUsername()).get(0);
        //ע�ⲻ��Ҫfood�Ĳ�ѯ����ʱ����������д����ֱ�ӽ�food��������Ϊnull
        reservationList = reservationDao.QueryReservationInfo(use,null);

        return "show_view";
    }

    
    public String showDetail() {
    	System.out.print(reservation.getReservationid());
    	reservation = reservationDao.GetReservationById(reservation.getReservationid());
        return "detail_view";
    }
    
    
    public String showEdit() throws Exception {
    	reservation = reservationDao.GetReservationById(reservation.getReservationid());
        return "edit_view";
    }

    /*�༭Order*/
    public String editReservation() throws Exception {
    	reservationDao.UpdateReservation(reservation);
        return "edit_message";
    }
    
    /*ɾ��Order*/
    public String deleteReservation() throws Exception {
    	reservationDao.DeleteReservation(classroom.getClassroomid());
        return "delete_message";
    }
    
    /*��ѯOrder*/
    public String queryReservations() throws Exception {
    	reservationList = reservationDao.QueryReservationInfo(user,classroom);
        return "show_view";
    }

}
