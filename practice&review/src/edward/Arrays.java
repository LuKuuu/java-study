package edward;

public class Arrays {
	public static void main(String []args)
	{
		int num[]= new int[20];
		int numb[]= {2,4,6,8,10};
		
		long array[]= new long[80];
		array[0]=1;
		array[1]=1;
		System.out.print(array[0]+" "+array[1]+" ");
		
		for(int i=2; i < array.length; i++)
		{
			array[i]=array[i-1]+array[i-2];
			System.out.print(array[i]+" ");
			if((i+1)%5==0)
			{
				System.out.println();
			}
		}
		
	int Array[] []= new int[20] [20];
	System.out.println(Array[15] [15]);
	System.out.println(args.length );
	
	
	
	}
	
	
	
	
	public static void printArray(int[] intArray)
	{
		for(int i=0; i < intArray.length; i++)
		{
			System.out.println(intArray[i] + " ");
		}
		System.out.println();
	}
	

}
