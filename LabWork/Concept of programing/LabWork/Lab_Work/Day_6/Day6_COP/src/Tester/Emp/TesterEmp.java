package Tester.Emp;

import java.util.Scanner;

import com.emp.Manager;

public class TesterEmp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Manager obj1 = new Manager(sc.next(), sc.nextInt(), sc.next());
		System.out.println(obj1);

	}

}
