package com.learn.classesandobjects;

public class Employee {
	
private String name;
private String dob;
private String sid;

@Override
public String toString() {
	return "Employee [name=" + name + ", dob=" + dob + ", sid=" + sid + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}


}
