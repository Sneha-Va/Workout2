class MathFunction
{
	int x,y;
	double x1,y1;
	
	public void multiply(int x,int y)
	{
	System.out.println(x*y);
	}
	public void multiply(double x1, double y1)
	{
	System.out.println(x1*y1);
	}
	public void multiply(double x1, int x)
		{
	System.out.println(x1*x);
	}
	
}
class MultiplyDemo
{
	public static void main(String args[])
	{
	MathFunction m1 = new MathFunction();
	m1.multiply(9,7);
	m1.multiply(5.3,3.1);
	m1.multiply(4.6,6);
	}
}