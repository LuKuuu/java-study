package edward;

public class If {
	public static void main(String args[])
	{
		int a;
		int b;
		int c;
		
		a=1;
		b=2;
		c=-8;
		
		float delta=((b*b)-4*a*c);
		
		double result1=(-b+Math.sqrt(delta))/(2*a);
		double result2=(-b-Math.sqrt(delta))/(2*a);
		
		if(delta>0)
		{
			System.out.println("There are 2 results. One is "+result1+", another is "+result2+".");
		}
		if(delta==0 && result1==result2)
		{
			System.out.println("There is one result. It is "+result1+".");
		}
		if(delta<0)
		{
			System.out.println("There is no result.");
		}
		
		System.out.println(6%2*5);
		
		
	}

	
}
