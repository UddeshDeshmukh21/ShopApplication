package code.Tester;

import java.util.Scanner;
import code.abstraction.Circle;
import code.abstraction.Rectangle;
import code.abstraction.ShapeFactory;
import code.abstraction.Square;

public class TesterShape {

	public static void main(String[] args) {

		ShapeFactory[] arr = new ShapeFactory[3];
		System.out.println("\n\n");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {

			System.out.println("Enter Your Shape Choice::");
			choice = sc.nextInt();

			// for (int i = 0; i < arr.length; i++) {

			switch (choice) {

			case 0:
				Circle c = new Circle();
				double areac = c.area(20, 0);
				System.out.println(c);

				// ShapeFactory shape1 = new ShapeFactory();
				ShapeFactory.generateShape();
				System.out.println("\n\n");
				break;
			case 1:
				Square s1 = new Square();
				double areas1 = s1.area(11, 0);
				System.out.println(s1);
				// ShapeFactory shape2 = new ShapeFactory();
				ShapeFactory.generateShape();
				System.out.println("\n\n");
				break;
			case 2:
				Rectangle r = new Rectangle();
				double arear = r.area(20, 10);
				System.out.println(r);
				// ShapeFactory shape3 = new ShapeFactory();
				ShapeFactory.generateShape();

				break;
			default:
				System.out.println("Not a valid choice");
				break;

			}
		} while (choice != 3);

	}

}
