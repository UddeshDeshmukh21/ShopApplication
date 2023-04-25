package TesterStd;

import java.util.Scanner;

import com.code.StdMark;

public class TesterStd {

	public static void main(String[] args) {

		int total;
		double per;
		char grade;

		System.out.println("--------Student Exam Marks--------");
		System.out.println("\n");
		Scanner sc = new Scanner(System.in);

		StdMark std = new StdMark();
		System.out.println("Enter Marks ");
		System.out.println("Mark1 :");
		System.out.println("Mark2 :");
		System.out.println("Mark3 :");

		std.acceptinfo(sc.nextInt(), sc.nextInt(), sc.nextInt());

		total = std.TotalMark();
		per = total / 3;

		if(total<=300) {
		if (90.00 <= per) {
			System.out.println("Passed");
			System.out.println("Total Marks : " + " " + total);
			System.out.println("Percentage  : " + " " + per + "%");

			System.out.println("Grade A+");
		} else if (80.00 <= per) {
			System.out.println("Total Marks : " + " " + total);
			System.out.println("Percentage  : " + " " + per + "%");
			System.out.println("Passed");
			System.out.println("Grade A");
		} else if (69.00 <= per) {
			System.out.println("Total Marks : " + " " + total);
			System.out.println("Percentage  : " + " " + per + "%");
			System.out.println("Passed");
			System.out.println("Grade B");
		} else if (55.00 <= per) {
			System.out.println("Total Marks : " + " " + total);
			System.out.println("Percentage  : " + " " + per + "%");

			System.out.println("Passed");
			System.out.println("Grade C");
		} else if (36.00 <= per) {
			System.out.println("Total Marks : " + " " + total);
			System.out.println("Percentage  : " + " " + per + "%");
			System.out.println("Passed");
			System.out.println("Grade D");

		} else {
			System.out.println("Total Marks : " + " " + total);
			System.out.println("Percentage  : " + " " + per + "%");
			System.out.println("Failed :( ");

		}}
		else {
			System.out.println("Entre Valid Mark");
		}

	}
		

}
