package CalculateRectangle;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea obj = new RectangleArea();
		

		RectangleArea area = new RectangleArea();
		area.calculateAreaofRectangle();
		area.calculateAreaOfRectangle(8, 5);
		
		int area1 = area.calculateAreaOfRectangle1();
		int area2 = area.calculateAreaOfRectangle2(12, 10);
		System.out.println("area1:"+ area1);
		System.out.println("area2:"+ area2);
	}

}
