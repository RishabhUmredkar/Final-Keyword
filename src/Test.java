import java.util.Scanner;

final class A
{
	Scanner sc=new Scanner(System.in);
	int a;
	void fun(final int a)
	{
		this.a=a*a;
		System.out.println("Multiplication is "+ this.a+" and value of a is "+a);	
	}
}
public class Test {
	public static void main(String[] args) 
	{	
		A a=new A();
		a.fun(5);
	}
}
