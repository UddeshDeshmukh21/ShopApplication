package com.emp;



public class Developer extends Emp {

	private String project;
	private String domain;
	

	public Developer(String project, String domain) {
		
		this.project = project;
		this.domain = domain;
	}
	
//	Date obj1=new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
	
	
	public String toString() {
		return "Developer"+project+"\n"+domain;
	}
	
	
	 
	
	
	
}
