package com.employeeDetails.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails implements java.io.Serializable {

	private Integer id;
	private String name;
	private String desgination;
	private String image;

	public EmployeeDetails() {
	}

	public EmployeeDetails(String name, String desgination, String image) {
		this.name = name;
		this.desgination = desgination;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "desgination", nullable = false, length = 100)
	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	@Column(name = "image", nullable = false, length = 100)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}