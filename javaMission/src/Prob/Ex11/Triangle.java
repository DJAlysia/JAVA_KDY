package Prob.Ex11;

public class Triangle {

	double width;
	double height;
	public Triangle() {
	}
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		// (width) x (height) / 2
		return width * height / 2;
	}
	
	public final double getWidth() {
		return width;
	}
	public final void setWidth(double width) {
		this.width = width;
	}
	public final double getHeight() {
		return height;
	}
	public final void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
