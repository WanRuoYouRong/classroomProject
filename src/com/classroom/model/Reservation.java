package com.classroom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Reservation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_reservation", catalog = "classroom")

public class Reservation implements java.io.Serializable {

	// Fields

	private Integer reservationid;
	private User user;
	private Classroom classroom;

	// Constructors

	/** default constructor */
	public Reservation() {
	}

	/** minimal constructor */
	public Reservation(Classroom classroom) {
		this.classroom = classroom;
	}

	/** full constructor */
	public Reservation(User user, Classroom classroom) {
		this.user = user;
		this.classroom = classroom;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "reservationid", unique = true, nullable = false)

	public Integer getReservationid() {
		return this.reservationid;
	}

	public void setReservationid(Integer reservationid) {
		this.reservationid = reservationid;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user")

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "classroom", nullable = false)

	public Classroom getClassroom() {
		return this.classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

}