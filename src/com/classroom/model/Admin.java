package com.classroom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_admin", catalog = "classroom")

public class Admin implements java.io.Serializable {

	// Fields

	private Integer adminid;
	private String adminname;
	private Integer password;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String adminname, Integer password) {
		this.adminname = adminname;
		this.password = password;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "adminid", unique = true, nullable = false)

	public Integer getAdminid() {
		return this.adminid;
	}

	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}

	@Column(name = "adminname", nullable = false, length = 40)

	public String getAdminname() {
		return this.adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	@Column(name = "password", nullable = false)

	public Integer getPassword() {
		return this.password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

}