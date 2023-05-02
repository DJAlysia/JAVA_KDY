package Prob.Ex11;

public class Circle {

	double radius;

	
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		// (원주율) x (반지름) x (반지름)
		return Math.PI * radius * radius;
	}

	
	
	public final double getRadius() {
		return radius;
	}

	public final void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
