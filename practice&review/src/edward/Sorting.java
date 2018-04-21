package edward;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array a1=new Array(80000,100000);
		System.out.println("array has already been created!");
		a1.printArray();
		
		System.out.println();

		int[] bubble=new int[a1.array.length];
		int[] select=new int[a1.array.length];		
		int[] insert=new int[a1.array.length];
		
				
		for(int i=0;i<a1.array.length;i++)
		{
			bubble[i]=a1.array[i];
			select[i]=a1.array[i];
			insert[i]=a1.array[i];

			
		}
		
	
	
		

	
		//a1.printArray();
		

		Insert in=new Insert();
		in.Insert(insert);
		System.out.println("the interval time of insert sorting is: "+ in.timeInterval);
		
		
	
		
		Select s=new Select();
		s.Select(select);
		System.out.println("the interval time of select sorting is: "+s.timeInterval);
		


		


		
		Bubble b=new Bubble();
		b.Bubble(bubble);
		System.out.println("the interval time of bubble sorting is: "+b.timeInterval);
		
	
		System.out.println("\n \n");
		
	}

}

final class Array
{
	int[] array;
	
	public Array(int length,int range)
	{
		int[] array=new int[length];
		
		
		
		for(int i=0;i<length; i++)
		{
			Sign si=new Sign();
			
			array[i]=(int)(Math.random()*range*si.sign());
		}
		this.array=array;
		
				
	}
	public void printArray()
	{
		for(int i=0;i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	
}

class Sign
{
	public int sign()
	{
	
		double randomNum=Math.random();
		if(randomNum>=0.5f)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}

class Sort
{
	int array[];
	long timeInterval;

	public void printArray()
	{
		for(int i=0;i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
}

class Bubble extends Sort
{
	public void Bubble(int[] array)
	{
		int temp;
		long timeStart=System.currentTimeMillis();
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<(array.length-i-1);j++)
			{
				
				if(array[j]>array[j+1])
				{
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
							
					
				}
				
			}
			
		}
		long timeEnd=System.currentTimeMillis();
		long timeInterval=timeEnd-timeStart;
		this.timeInterval=timeInterval;
		this.array=array;
	}
}


class Select extends Sort
{
	public void Select(int[] array)
	{
		int temp;
		long timeStart=System.currentTimeMillis();
		for(int i=0;i<array.length;i++)
		{
			for(int j=0; j<array.length-i;j++)
			{
				if(array[j]>array[i])
				{
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
					
				}
				
			}
		}
		long timeEnd=System.currentTimeMillis();
		long timeInterval=timeEnd-timeStart;
		this.timeInterval=timeInterval;
		this.array=array;
	}
}



class Insert extends Sort
{
	public void Insert(int[] array)
	{
		
		int neddle;
		long startTime=System.currentTimeMillis();
		for(int point=1; point<array.length;point++)
		{
			int insertValue=array[point];
			neddle=point-1;
			while( neddle>=0 && insertValue<array[neddle])
			{
				array[neddle+1]=array[neddle];
				neddle--;
			}
				
		}
		long endTime=System.currentTimeMillis();
		long timeInterval=endTime-startTime;
		this.timeInterval=timeInterval;
		this.array=array;
		
		
	}
}





