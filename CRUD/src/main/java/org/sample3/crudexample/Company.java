package org.sample3.crudexample;

public class Company {
	
	private int comid;
	private String comname;
	private String compassword;
	private int salary;
	public Company(int comid, String comname, String compassword, int salary) {
		super();
		this.comid = comid;
		this.comname = comname;
		this.compassword = compassword;
		this.salary = salary;
	}
	public Company(String comname, String compassword, int salary) {
		super();
		this.comname = comname;
		this.compassword = compassword;
		this.salary = salary;
	}
	public Company() {
		super();
		
	}
	public int getComid() {
		return comid;
	}
	public void setComid(int comid) {
		this.comid = comid;
	}
	public String getComname() {
		return comname;
	}
	public void setComname(String comname) {
		this.comname = comname;
	}
	public String getCompassword() {
		return compassword;
	}
	public void setCompassword(String compassword) {
		this.compassword = compassword;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Company [comid=" + comid + ", comname=" + comname + ", compassword=" + compassword + ", salary="
				+ salary + "]";
	}

}
