package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	private String courseName ;
	private int duration;
	private int fee;
	
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="course")
      private List<Student> stu;



	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Course(int courseId, String courseName, int duration, int fee, List<Student> stu) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.stu = stu;
	}



	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public int getFee() {
		return fee;
	}



	public void setFee(int fee) {
		this.fee = fee;
	}



	public List<Student> getStu() {
		return stu;
	}



	public void setStu(List<Student> stu) {
		this.stu = stu;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ ", stu=" + stu + "]";
	}
	
	
	
	

}
