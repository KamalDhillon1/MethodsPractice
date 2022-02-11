package CalculateRectangle;

public class RectangleArea {

 int length=6;
 int breadth=4;
 //int area= length*breadth;
 
 
 void calculateAreaofRectangle() {
	System.out.println("Area ofRectangle:"+length*breadth);
}
 void calculateAreaOfRectangle(int length1, int breadth1) {
	 System.out.println("Area ofRectangle:"+length1*breadth1);
 }
 int calculateAreaOfRectangle1() {
	 return length*breadth;
 }
 int calculateAreaOfRectangle2( int length2,int breadth2) {
	 int area = length2 * breadth2;
	 return area;
 }
}
