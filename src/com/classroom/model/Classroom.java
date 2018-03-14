package com.classroom.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Classroom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_classroom", catalog = "classroom")

public class Classroom implements java.io.Serializable {

	// Fields

	private Integer classroomid;
	private String classroomname;
	private String emptytime;
	private Set<Reservation> reservations = new HashSet<Reservation>(0);
	private Set<Reservation> reservations_1 = new HashSet<Reservation>(0);

	// Constructors

	/** default constructor */
	public Classroom() {
	}

	/** full constructor */
	public Classroom(String classroomname, String emptytime, Set<Reservation> reservations,
			Set<Reservation> reservations_1) {
		this.classroomname = classroomname;
		this.emptytime = emptytime;
		this.reservations = reservations;
		this.reservations_1 = reservations_1;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "classroomid", unique = true, nullable = false)

	public Integer getClassroomid() {
		return this.classroomid;
	}

	public void setClassroomid(Integer classroomid) {
		this.classroomid = classroomid;
	}

	@Column(name = "classroomname", length = 40)

	public String getClassroomname() {
		return this.classroomname;
	}

	public void setClassroomname(String classroomname) {
		this.classroomname = classroomname;
	}

	@Column(name = "emptytime", length = 40)

	public String getEmptytime() {
		return this.emptytime;
	}

	public void setEmptytime(String emptytime) {
		this.emptytime = emptytime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classroom")

	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "classroom")

	public Set<Reservation> getReservations_1() {
		return this.reservations_1;
	}

	public void setReservations_1(Set<Reservation> reservations_1) {
		this.reservations_1 = reservations_1;
	}

}