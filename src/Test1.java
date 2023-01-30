import java.util.Scanner;
 class B
{
	Scanner sc=new Scanner(System.in);
	final int a;
	B()
	{
		System.out.print("Enter number:");
		a=sc.nextInt();
	}
	void myfun()
	{
		System.out.println("Entered number is "+a);
		
	}
	final void fun()
	{
		System.out.println("Hello final void fun");
	}
	


}
public class Test1 {

	public static void main(String[] args) {
		B b=new B();
		b.myfun();
		b.fun();
	}

}
