package test2;

public class Helloworldprint {
	
	public static void main(String Args[])
	{
		Cat cat1=new Cat();
		
		//
		//cat1.start();
		Dog dog=new Dog();
		Thread t= new Thread(dog);
		t.start();
		
		
	}

}


class Cat extends Thread
{
	//rewrite run
	
	int times=0;
	
	public void run()
	{
		while(true)
		{
			times++;
			try {
				Thread.sleep(1000);
				// release the RAM
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello World!"+times);
			
			
			if(times==10)
			{
				break;
			}
			
		}
		
	}
}



class Dog implements Runnable
{
	int times=0;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		
			while(true)
			{
				times++;
				try {
					Thread.sleep(1000);
					// release the RAM
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Hello World!"+times);
				
				
				if(times==10)
				{
					break;
				}
				
			}			
		
		
	}
	
}