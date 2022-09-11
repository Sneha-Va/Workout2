import java.util.*;
class Rectangle
{
	double length,breadth;
	Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	Rectangle(int a)
	{
		System.out.println("length is"+a);

	}
	Rectangle(int a, int b)
	{
		System.out.println("length is"+a);
		System.out.println("breadth is"+b);
	}
	public void getarea()
	{
		double area;
		area=length*breadth;
		System.out.println("area of Rectangle"+area);
	}
	public void getperimeter()
	{
		double perimeter;
		perimeter=2*(length*breadth);
		System.out.println("perimeter of Rectangle"+perimeter);
	}
}
class Rect
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(5);
		Rectangle r2 = new Rectangle(5,6);
		r.getarea();
		r.getperimeter();
	}
}