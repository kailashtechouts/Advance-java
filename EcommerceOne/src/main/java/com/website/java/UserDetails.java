package com.website.java;

public class UserDetails {

private String name;
private String email_id;
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserDetails [name=" + name + ", email_id=" + email_id + ", password=" + password + "]";
}


}
