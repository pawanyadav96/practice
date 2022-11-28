package com.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phoneno {
	@Id
	private int phoneId;
	@Override
	public int hashCode() {
		return Objects.hash(phoneId, phoneNumber, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phoneno other = (Phoneno) obj;
		return phoneId == other.phoneId && phoneNumber == other.phoneNumber && Objects.equals(type, other.type);
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Phoneno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phoneno(int phoneId, int phoneNumber, String type) {
		super();
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Phoneno [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", type=" + type + "]";
	}
	private int phoneNumber;
	private String type;
	
	

}
