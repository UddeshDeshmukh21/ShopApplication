package code.abstraction;

public class Rectangle extends Shape {

	double areaRect;
	double x;
	double y;

	@Override
	public double area(double x, double y) {

		System.out.println("Calculating Area of the choice of shape which is asked:");
		this.x = x;
		this.y = y;
		this.areaRect = x * y;

		return this.areaRect;
	}

	@Override
	public String toString() {
		return "width =" + this.x + "\n" + "length =" + this.y + "\n" + "Area =" + this.areaRect;
	}

}
