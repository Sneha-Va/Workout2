import java.util.*;
class Employee
{
	int empid,result,ass1,ass2,ass3;
	String name;
Employee()
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Employee Name");
name = sc.next();
System.out.println("Enter  employee Id");
empid = sc.nextInt();
System.out.println("Enter Assessment Marks");
ass1 = sc.nextInt();
ass2 = sc.nextInt();
ass3 = sc.nextInt();
	}
	void result()
	{
		if(ass1>75 && ass2>75 && ass3>75)
		{
			System.out.println("prmoted");
		}
		
		else
		{
			System.out.println("demoted");
		}
	}
	void calculate()
	{
	float total=ass1+ass2+ass3;
	System.out.println("total="+total);

	float percentage=(total/300)*100;
    System.out.println("percentage="+percentage);
	}
	
}
public class Empl
{
	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.result();
		emp.calculate();
		
	}
}