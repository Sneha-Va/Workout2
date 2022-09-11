import java.util.Scanner;
class Employee
{
 static int empNo;
  static double salary, totalSalary;
	
	Employee(double salary){
		empNo++;
		this.salary=salary;
		totalSalary=salary+totalSalary;
	}
	
	static void show(){
		System.out.println("total number of  employe:"+empNo);
		System.out.println("total salary of all employe:"+salary);
	}
}

class empldetails
{
	public static void main(String args[])
	{
		float a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first employee salary");
		a=sc.nextFloat();
		Employee e1=new Employee(a);
		System.out.println("enter second employee salary");
		b=sc.nextFloat();
		Employee e2=new Employee(b);
		System.out.println("enter third employee salary");
		c=sc.nextFloat();
		Employee e3=new Employee(c);
		System.out.println("enter fourth employee salary");
		d=sc.nextFloat();
		Employee e4=new Employee(d);
		System.out.println("enter fifth employee salary");
		e=sc.nextFloat();
		Employee e5=new Employee(e);
		Employee.show();
	}
}