package com.emp;

public class SalePerson extends Emp {

	
	private double PA,TA,FA;

	public SalePerson(double pA, double tA, double fA) {
		
		PA = pA;
		TA = tA;
		FA = fA;
	}
	
	public String toString() {
		return "SalePerson"+PA+"\n"+TA+"\n"+FA;
	}
	
	
}
