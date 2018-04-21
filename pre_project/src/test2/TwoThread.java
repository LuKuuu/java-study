package test2;

public class TwoThread {
	public static void main(String args[])
	{
		Print p=new Print();
		Thread t1=new Thread(p);
		Calculate c=new Calculate(20);
		Thread t2=new Thread(c);
		
		
		t2.start();
		t1.start();
		
		
	}

}

class Print implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello world!");
		}
		
	}
	
}

class Calculate implements Runnable
{ 
	int n;
	int result=0;
	int times=0;
	
	public Calculate(int n)
	{
		this.n=n;
	}
	
	public void run()
	{
		
		while(true)
		{
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			
			System.out.println("it is "+times);
			
			result=result+times;
			
			
			
			if(times==n)
			{
				System.out.println("result is "+ result);
				break;
			}
		}
	}
}