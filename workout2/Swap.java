class Swap
{
int x,y;
Swap()
{

}
Swap(int a, int b)
{
	x=a;
	y=b;
}
void swapval(int x,int y)
{
	System.out.println("before swapping a=" +x + "and b=" +y);
	int z=x;
	x=y;
	y=z;
	System.out.println("After swapping a=" +x + "and b=" +y);
}
void swapref(Swap number)
{
	System.out.println("before swapping a=" +x + "and b=" +y);
	int c;
	c=number.x;
	number.x=number.y;
	number.y=c;
	System.out.println("After swapping a="+number.x + "  and b=" +number.y);

}
public static void main(String args[])

{
	Swap s=new Swap();
	s.swapval(10,20);
	Swap s1=new Swap(10,20);
	s1.swapref(s1);


}
}