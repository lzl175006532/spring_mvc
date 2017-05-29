package com.lzl.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Student {

	private long id;
	private String studentname;
	private int age;
	private Date birthday;
	private Map<String, Object> map = new HashMap<String, Object>();
	
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Student(long id, String studentname, int age, Date birthday) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.age = age;
		this.birthday = birthday;
	}
	public Student(){} 

}
