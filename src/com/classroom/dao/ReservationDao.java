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
import com.classroom.model.Classroom;
import com.classroom.model.Reservation;
@Service @Transactional
public class ReservationDao {
	@Resource SessionFactory factory;
	/*添加Reservation信息*/
    public void AddReservation(Reservation reservation) throws Exception {
    	Session s = factory.getCurrentSession();
    	s.save(reservation);
    }
    /*删除Reservation信息*/
    public void DeleteReservation (Integer reservationid) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object reservation = s.load(Reservation.class, reservationid);
        s.delete(reservation);
    }
    /*更新Reservation信息*/
    public void UpdateReservation(Reservation reservation) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(reservation);
    }
    /*查询所有Reservation信息*/
    public ArrayList<Reservation> QueryAllReservation() {
        Session s = factory.getCurrentSession();
        String hql = "From Reservation";
        Query q = s.createQuery(hql);
        List reservationList = q.list();
        return (ArrayList<Reservation>) reservationList;
    }
    /*根据主键获取对象*/
    public Reservation GetReservationById(Integer reservationid) {
        Session s = factory.getCurrentSession();
        Reservation reservation = (Reservation)s.get(Reservation.class, reservationid);
        return reservation;
    }
    
    /*根据查询条件查询，一般来说，订单查询时，会根据用户ID查对应的订单，或根据美食的名称查对应的订单*/
    public ArrayList<Reservation> QueryReservationInfo(User user, Classroom classroom) {
    	Session s = factory.getCurrentSession();
    	String hql = "From Reservation reservation where 1=1";
    	if(null != user && user.getUserid()!=0) 
    		hql = hql + " and reservation.user.userid like '%" + user.getUserid() + "%'";
    	if(null != classroom && null!=classroom.getClassroomname()) 
    		hql = hql + " and reservation.classroom.classroomname like '%" + classroom.getClassroomname() + "%'";
    	Query q = s.createQuery(hql);
    	List reservationList = q.list();
    	return (ArrayList<Reservation>) reservationList;
    }

}
