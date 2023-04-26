package Day08.Ex01_Shape;

public class Triangle extends Shape {  	// shape 이라는 추상 클래스를 상속을 받아 넓이, 둘레의 공통된 기능을 어떤 형태로 사용해서 구현을 해주는지 나타냄. 
										// 추상 메소드는 오버라이딩 해주지 않으면 오류 발생함. 반드시 오버라이딩 해줘야 함.

	double width, height;
	
	public Triangle() {
		this(0,0);
	}
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// (가로) x (세로) / 2
		return width * height / 2;
	}

	@Override
	double round() {
		// (정삼각형) : (한 변의 길이) * 3
		return width * 3;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

	
	
}
