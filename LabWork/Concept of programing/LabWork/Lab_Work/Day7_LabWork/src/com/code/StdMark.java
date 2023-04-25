package com.code;

import TesterPackage.TesterPackage;

 public class StdMark {

	private int mark1;
	private int mark2;
	private int mark3;
	private int total;

	public void acceptinfo(int mark1, int mark2, int mark3) {

		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}

	public int TotalMark() {
		
		this.total=this.mark1+this.mark2+this.mark3;
		
		return this.total;
	}
	
//	TesterPackage // Public Tester class Accessible 
	
	
	
}
