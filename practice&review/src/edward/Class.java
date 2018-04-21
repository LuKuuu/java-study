package edward;
import java.util.Scanner;
public class Class {
	public static void main(String args[])
	{
		Dog dog1=new Dog();
		System.out.println("calculating by dog, please give the name of the dog");
		Scanner name=new Scanner(System.in);
		String dogname=name.nextLine();
		dog1.name=dogname;
		System.out.println("please geive the first number");
		Scanner data1= new Scanner(System.in);	
		int a=data1.nextInt();
		System.out.println("please geive the first number");
		Scanner data2= new Scanner(System.in);
		int b=data2.nextInt();
		
	
		
		dog1.add(a, b);
		int c=dog1.addd(a, b);
		System.out.println(c);
	}
	
	

}

class Dog
{
	String name;
	int age;
	public void add(int a, int b)
	{
		int result=a+b;
		System.out.println("Dog "+name+"'s calculation is "+result+".");
	}
	public int addd(int a, int b)
	{
		return a+b;
		
	}
}