
public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(1.5);
		System.out.println(c1.radius);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		System.out.println("-----------");
		
		Circle c2 = new Circle();
		c2.radius = 2.0;//user can overwrite radius by assigning a new value.
		System.out.println(c2.radius);
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		
		System.out.println("-----------");
		
		Circle c3 = new Circle(10);
		System.out.println(c3.radius);
		System.out.println(c3.getArea());
		System.out.println(c3.getPerimeter());
	}

}
