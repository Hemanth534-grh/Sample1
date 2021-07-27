package com.pack.employee.model;

public class Employee {
 
private String  name,email,gender,country;
public int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
 
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
