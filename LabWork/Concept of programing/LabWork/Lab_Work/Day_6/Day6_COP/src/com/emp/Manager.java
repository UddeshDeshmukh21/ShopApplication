package com.emp;

public class Manager extends Emp {

	private String dept;
	private int teamMember;
	private String domain;
	
	public Manager(String dept, int teamMember, String domain) {
		
		this.dept = dept;
		this.teamMember = teamMember;
		this.domain = domain;
	}
	
	public String toString() {
		return "Manager"+dept+"\n"+teamMember+"\n"+domain;
	}
	
	
}
