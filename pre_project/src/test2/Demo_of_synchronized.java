//to show the usage of synchronized

package test2;

public class Demo_of_synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ATM a=new ATM();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		result:
		
		total money is: 200
Thread-1 -200.
total money is: 0
Thread-2 -200.
total money is: -200
Thread-0 -200.
total money is: -400*/
		
		SmartATM a=new SmartATM();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		Thread t3=new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}

class ATM implements Runnable
{
	private int TotalMoney=20000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			if(TotalMoney>0)
			{
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				TotalMoney=TotalMoney-200;
				System.out.println(Thread.currentThread().getName()+" -200.");
				System.out.println("total money is: "+TotalMoney);
			}
			
			else
			{
				break;
			}
			
		}
		
		
		
	}
	
	
	
}





class SmartATM implements Runnable
{
	private int TotalMoney=20000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this)
		{
			while(TotalMoney>0)
			{
				try {
					Thread.sleep(50);
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				TotalMoney=TotalMoney-200;
				System.out.println(Thread.currentThread().getName()+"-200");
				System.out.println("total money is: "+TotalMoney);
				
					
				
			}
		}
		
	}
	
	
}