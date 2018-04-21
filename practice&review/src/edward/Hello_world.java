package edward;
import java.util.Scanner; 
public class Hello_world {

	public static void main(String args[])
	{
		System.out.println("Hello world!");
		String a="Hello ";
		String b="world!";
		String c=a+b;
		System.out.println(c);
		Scanner data= new Scanner(System.in);
		
		int i=0;
		boolean writed=false;
		
		try {
			i=data.nextInt();
			writed=true;
			

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		if(writed)
		{
			System.out.println(i);

		}
		else {
			
		}
		
		
		
		System.out.println("dir C://");
				
		
	}
}
