package com.egen.MoviFlixApi.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
//@Table
//@NamedQueries(@NamedQuery(name = "User.GetUser", query = "Select u from User u Where u.email=:pEmailId AND u.email=:pUserPwd"))
public class User {
	
	@Id
	@Column(columnDefinition="VARCHAR(250)" ,unique=true)
	private String emailId;
	
	@Column(columnDefinition="VARCHAR(100)")
	private String firstName;
	
	@Column(columnDefinition="VARCHAR(100)")
	private String lastName;
	
	
	@Column(columnDefinition="VARCHAR(20)")
	private String usrPwd;
	
	
	
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsrPwd() {
		return usrPwd;
	}
	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}
	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", usrPwd=" + usrPwd
				+ "]";
	}
	
	
	
	
	

}
