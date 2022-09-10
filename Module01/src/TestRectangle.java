
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		//System.out.println(r1.getWidth());
		//System.out.println(r1.getLength());
		
		r1.setWidth(1);
		r1.setLength(2);
		//System.out.println(r1.getWidth());
		//System.out.println(r1.getLength());
		//System.out.println(r1.getPerimeter());
		//System.out.println(r1.getArea());
		
		Rectangle r2 = new Rectangle(2,3);
		System.out.println(r2.getPerimeter());
		System.out.println(r2.getArea());
		
	}

}
