import java.util.Scanner;
 class C
{
	Scanner sc=new Scanner(System.in);
	final static int a;
	
	 final static void myfun()
	{
		System.out.println("Entered number is "+a);
		
	}
	final void fun()
	{
		System.out.println("Hello final void fun");
	}
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value:");
		a=sc.nextInt();
	}
}
public class Test2 {

	public static void main(String[] args) {
	C c=new C();
	c.myfun();
	c.fun();
	}

}
