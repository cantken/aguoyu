package xxx;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle rec1 = new MyRectangle();
		MyRectangle rec2 = new MyRectangle(10, 20);
		System.out.println(rec1.getArea());
		System.out.println(rec2.getArea());
	}

}
