package code.abstraction;

public class Square extends Shape {

	double area;
	double side;

	@Override
	public double area(double x, double y) {

		System.out.println("Calculating Area of the choice of shape which is asked:");
		this.side = x;
		this.area = x * x;

		return this.area;
	}

	@Override
	public String toString() {
		return "Side length =" + this.side + "\n" + "Area =" + this.area;
	}

}
