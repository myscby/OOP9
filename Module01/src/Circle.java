
public class Circle {

	//data field
	double radius = 1.0;

	//no-arg constructor or default constructor
	public Circle() {
	
	}

	//arg constructor
	public Circle(double radius) {
		this.radius = radius; //this makes radius 1.0
	}
	
	double getArea( ) {
		return radius * radius * Math.PI;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double getPerimeter() {
		return radius * 2 * Math.PI;
	}
	
	
	
}
