
package edward;
import java.util.Scanner;
public class packeted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeArray a= new MakeArray();
		a.makeArray();	

	}

}





class Scan_a_number
{
	
	int i;
	public void get_a_number()
	{
		do {
			System.out.println("Please give a number, greater than 0 and less than 100.\n");
			Scanner num= new Scanner(System.in);
			int i= num.nextInt();
			this.i= i;
			if(0<i & i<100)
			{
				System.out.println("the number get is "+i+".\n");
				
			}
			else
			{
				System.out.println("The number is not available\n");
			}
		}while(i<0 | i>=100);
		
		
	}
	
}


class Rearrange
{
	int totalnumber;
	int length;
	
	
	public void getTotalnumber()
	{
		Scan_a_number a= new Scan_a_number();
		a.get_a_number();
		this.totalnumber=a.i;
		
	}
	
	
	
	public void getLength()
	{
		double SqrtOfThetalNumber=Math.sqrt(totalnumber);
		System.out.println("The sqrt of the number is "+SqrtOfThetalNumber+".\n");
		double length=0;
				
		while(length <= SqrtOfThetalNumber)
		{
			length++;	
		}
		length--;
		System.out.println("The length is "+(int)(length)+".\n");
		this.length=(int)length;
		int remaining = (int)(totalnumber) - (int)(length*length);		
		
		System.out.println("The remaining is "+remaining+", and the remaining numbers will not be used.\n");
	}
	
	
	public int[][] Array()
	{
		int[][] a= new int[1][2];
		
		return a;
		
	}
	
	public void printArray()
	{
		int array1[][] =new int[length][length];
		
		//create the first arrayj
		int num=1;
		for(int i=0;i<length;i++)
		{
			for(int j=0; j<length; j++)
			{
				array1[i][j]=num;
				num++;				
			}
		}
		
		System.out.println("The first array has been created.\n");
		//print the first array
		for(int i=0;i<length;i++)
		{
			for(int j=0; j<length; j++)
			{
				if(array1[i][j]<10)
				{
					System.out.print(" ");
				}
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//create the second array
		int array2[][] =new int[length][length];
		for(int i=0;i<length;i++)
		{
			for(int j=0; j<length; j++)
			{
				array2[j][i]=array1[i][j];
							
			}
		}
		
		System.out.println("The second array has been created.\n");
		//print the second array
		for(int i=0;i<length;i++)
		{
			for(int j=0; j<length; j++)
				{
					if(array2[i][j]<10)
					{
						System.out.print(" ");
					}
					System.out.print(array2[i][j]+" ");
				 }
				System.out.println();
		}
		System.out.println();
	}
	
	
		
}


class MakeArray
{
	Rearrange a= new Rearrange();
	
	public void makeArray()
	{
		a.getTotalnumber();
		a.getLength();
		a.printArray();
	}

	
}
