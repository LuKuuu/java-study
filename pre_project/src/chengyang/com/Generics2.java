package chengyang.com;

public class Generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gen<Integer> g1= new Gen<Integer> (123);
		g1.showTypeName();
		
		Gen<String> g2= new Gen<String> ("hahaha");
		g2.showTypeName();
		
		Gen<Bird> g3=new Gen<Bird> (null);
		//g3.showTypeName();

	}

}


class Gen<T>
{
	private T o;
	
	//T comes from the class
	//o is defined and 
	
	public Gen(T a)
	{
		this.o=a;
		
	}
	
	public void showTypeName()
	{
		System.out.println("The type is "+o.getClass().getName());
	}
	
}

class Bird
{
	public int a;
	
}