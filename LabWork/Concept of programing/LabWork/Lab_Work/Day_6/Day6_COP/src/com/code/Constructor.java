package com.code;

public class Constructor {

	private int day;
	private int month;
	private int year;
	
	public Constructor () {
		
		System.out.println("-------Inside the default const---------");
		this.day=21;
		this.month=5;
		this.year=1999;
		
		
	}
	
	
	
	
	
	public Constructor(int day, int month, int year) {
		
		this();
		
		this.day = day;
		this.month = month;
		this.year = year;
		
		
	
	}
	
	public String toString() {
		return "date"+day+"/"+month+"/"+year;
	}

	
}
