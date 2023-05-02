package Prob.Ex11;

public class Trapezoid {

	double top;
	double bottom;
	double height;
	public Trapezoid() {
	}
	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	double getArea() {
		// ((top) + (bottom)) * height / 2
		return ((top + bottom) * height / 2);
	}
	public final double getTop() {
		return top;
	}
	public final void setTop(double top) {
		this.top = top;
	}
	public final double getBottom() {
		return bottom;
	}
	public final void setBottom(double bottom) {
		this.bottom = bottom;
	}
	public final double getHeight() {
		return height;
	}
	public final void setHegiht(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}
	
	
}
