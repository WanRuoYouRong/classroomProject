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
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user", catalog = "classroom")

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private Integer password;
	private Set<Reservation> reservations = new HashSet<Reservation>(0);
	private Set<Reservation> reservations_1 = new HashSet<Reservation>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, Integer password) {
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public User(String username, Integer password, Set<Reservation> reservations, Set<Reservation> reservations_1) {
		this.username = username;
		this.password = password;
		this.reservations = reservations;
		this.reservations_1 = reservations_1;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "userid", unique = true, nullable = false)

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Column(name = "username", nullable = false, length = 40)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)

	public Integer getPassword() {
		return this.password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")

	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")

	public Set<Reservation> getReservations_1() {
		return this.reservations_1;
	}

	public void setReservations_1(Set<Reservation> reservations_1) {
		this.reservations_1 = reservations_1;
	}

}