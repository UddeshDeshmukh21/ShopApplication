package code.abstraction;

public abstract class ShapeFactory extends Shape {

	static int choice = 0;

	public static void generateShape() {

		switch (choice) {
		case 0:
			System.out.println("Shape is Circle");
			choice++;
			break;

		case 1:
			System.out.println("Shape is Square");
			choice++;
			break;

		case 2:
			System.out.println("Shape is Rectangle");
			choice++;
			break;
		}

	};

}
