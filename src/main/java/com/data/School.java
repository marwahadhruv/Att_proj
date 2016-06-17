package com.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="School")
public class School {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long schoolId;
	private String schoolName;
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolBranch() {
		return schoolBranch;
	}
	public void setSchoolBranch(String schoolBranch) {
		this.schoolBranch = schoolBranch;
	}
	public String getSchoolUsername() {
		return schoolUsername;
	}
	public void setSchoolUsername(String schoolUsername) {
		this.schoolUsername = schoolUsername;
	}
	public String getSchoolPassword() {
		return schoolPassword;
	}
	public void setSchoolPassword(String schoolPassword) {
		this.schoolPassword = schoolPassword;
	}
	private String schoolAddress;
	private String schoolBranch;
	private String schoolUsername;
	private String schoolPassword;

}
