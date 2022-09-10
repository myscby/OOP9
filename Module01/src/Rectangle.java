
public class Rectangle {
	//attributes
	private double width;
	private double length;
	
	//no arg constructor
	public Rectangle() {
		
	}

	//with arguments
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	//setters return void
	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	//getter return something
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	public double getArea() {
		return length * width;
	}
	
	//try
}
