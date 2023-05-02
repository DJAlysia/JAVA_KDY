package Prob.Ex11;

public class Rectangle extends FigureTest {

	double width;
	double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		// (width) x (height)
		return width * height;
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
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
