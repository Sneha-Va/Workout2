import java.util.*;
import java.io.*;
class Nofobject
{
	static int count;
Nofobject()
{
	count+=1;
}
public static void main(String args[])
{
	Nofobject a=new Nofobject();
	Nofobject b=new Nofobject();
	Nofobject c=new Nofobject();
	Nofobject d=new Nofobject();
    Nofobject e=new Nofobject();
    System.out.println("number of  objects"+count);
}
}