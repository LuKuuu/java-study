package edward;

public class Void {
	public static void main(String args[])
	{
		vvoid vd= new vvoid();
		
		vd.add(1,2);
		int i= vd.addd(1,2);
		System.out.println(i);
		
		
	}
	

}

class vvoid
{
	public static void add(int i, int j)
	{
		int k = i+j;
		System.out.println("The result is: "+k+".");
	}
	
	public static int addd(int a, int b)
	{
		return a+b;
		
	}
}
