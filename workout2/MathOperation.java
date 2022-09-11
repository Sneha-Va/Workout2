import java.util.*;
class MathOperation
{
int x,y;

void init()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter x and y");
	x=sc.nextInt();
	y=sc.nextInt();
	}
 void add()
	{
      int  R=x+y;
      System.out.println("R ="+R );
	}
	public void multiply()
	{
	int R=x*y;
	System.out.println("R = "+R );
	}
	
	void power()
	{
	double R=Math.pow(x,y);
	System.out.println("R ="+R );

	
    }
    void display()
    {
    	init();
    	add();
    	multiply();
    	power();
    }


public static void main(String args[])
	{
	MathOperation ma= new MathOperation();
	ma.display();
    
	


}

}