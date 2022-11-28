package com.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
private int	userId;
private String	userName;
private String	emailid ;


@ElementCollection
@Embedded
private Set<Phoneno> ph=new HashSet<Phoneno>();


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getEmailid() {
	return emailid;
}


public void setEmailid(String emailid) {
	this.emailid = emailid;
}


public Set<Phoneno> getPh() {
	return ph;
}


public void setPh(Set<Phoneno> ph) {
	this.ph = ph;
}


@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", emailid=" + emailid + ", ph=" + ph + "]";
}


public User() {
	super();
	// TODO Auto-generated constructor stub
}






}
