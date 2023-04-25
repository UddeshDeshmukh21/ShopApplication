package code.abstraction;

public class Circle extends Shape {

	double area;
	double x;

	@Override
	public double area(double x, double y) {
		System.out.println("Calculating Area of the choice of shape which is asked:");

		this.x = x;
		this.area = 3.14 * x * x;
		return this.area;
	}

	@Override
	public String toString() {
		return "Radius = " + this.x + "\n" + "Area  =" + this.area;
	}

}
