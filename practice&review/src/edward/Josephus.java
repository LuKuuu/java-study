package edward;
import java.util.Scanner;
public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);

		System.out.print("please give the n£º");
		int n=num.nextInt();

		
		System.out.print("please give the k£º");
		int k=num.nextInt();
		final long startTime=System.currentTimeMillis();
		System.out.println("the start time is "+startTime);
		Cycle c1= new Cycle(n,k);

		c1.setGroup();
		c1.deleteChild();
		c1.printArray();
		final long endTime=System.currentTimeMillis();
		System.out.println("the start time is "+endTime);

		System.out.println(endTime-startTime);


		

	}

}

class Child
{
	int no;
	String name;
	boolean alive;
	int nextChild;
	int lastChild;
	
	static int totalnumber=0;
	
	public Child(int no)
	{
		this.no=no;
		totalnumber++;
	}
}




class Cycle
{
	Child[] ch;
	int n;
	int k;
	int[] array;
	
	public Cycle(int n, int k)
	{
		this.n=n;
		this.k=k;
	}
	
	
	public void setGroup()
	{
		Child[] ch= new Child[n];
		for(int i=0; i<n; i++)
		{			
			ch[i]= new Child(i);
			ch[i].alive=true;
			ch[i].name="ch"+Integer.toString(ch[i].no);
			//System.out.println(ch[i].name+" has been created.");
			if(i==0)
			{
				ch[i].nextChild=i+1;
				ch[i].lastChild=n-1;

			}
			else if(i==n-1)
			{
				ch[i].nextChild=0;
				ch[i].lastChild=i-1;
			}
			else
			{
				ch[i].nextChild=i+1;
				ch[i].lastChild=i-1;
			}
			//System.out.println("it is in the order of "+ch[i].lastChild+" , "+ ch[i].no+" , "+ch[i].nextChild);
			this.ch=ch;
			
		}
		System.out.println();
	}

	
	
	
	
	
	public void deleteChild()
	{
		int point=0;
		int nextnumber=k;
		int array[]= new int[n];
		for(int i=0; i<n; i++)
		{
			if(i!=0)
			{
				for(int j=0;j<=k;j++)
				{
					nextnumber=ch[nextnumber].nextChild;
				}
			}
			
			point=nextnumber;
			//System.out.println("the next number to be delete is "+point);
			
			//delete one child
			ch[point].alive=false;
			ch[ch[point].lastChild].nextChild=ch[point].nextChild;
			ch[ch[point].nextChild].lastChild=ch[point].lastChild;
			
			//System.out.println(ch[point].name+" has been deleted.");
			array[i]=ch[point].no;
			this.array=array;
			
			//Connect the cycle
			
			
		}
		
		
	}
	public void printArray()
	{
		/*System.out.println("Here is the array: ");
		
		for(int i=0;i<array.length;i++)
		{
			
			System.out.print(array[i]+1+" ");
			if((i+1)%10==0)
			{
				System.out.println();

			}
			
			
		}*/
		System.out.println("the last one to be delete is "+ (array[array.length-1]+1));
		

	}
}

/*class Scan
{
	int n;
	boolean exist=false;
	public int getNumber()
	{
		System.out.println("please give a number in the range of int and greater than 0");
		Scanner num= new Scanner(System.in);
		n= num.nextInt();
		
		this.exist=true;
		return n;
		
	}
}
*/


