package com.tcs.co.in.StudentService;



import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.validation.constraints.*;

   
@Entity  
  
@Table  
public class Student   
{  
//mark id as primary key  
@Id  
//defining id as column name  
@Column
@NotNull(message = "Id cannot be null")
@Min(5)
private int studentId;

//defining name as column name  
@Column 
@NotBlank(message = "Name cannot be null")
private String forename;  

@Column
private String surname;

@Column
private String dob;

@Column
private int postcode;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getForename() {
	return forename;
}

public void setForename(String forename) {
	this.forename = forename;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public int getPostcode() {
	return postcode;
}

public void setPostcode(int postcode) {
	this.postcode = postcode;
}
  
}