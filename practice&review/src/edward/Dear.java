package edward;

public class Dear {
	public static void main(String args[])
	{
		String[] abc={"a","d","e","r"};
		
		
		for(int i=0;i<abc.length;i++)
		{	
			
			for(int j=0;j<abc.length;j++)
			{				
				
				for(int k=0;k<abc.length;k++)
				{
										
					for(int l=0;l<abc.length;l++)
					{
						if(i!=j & i!=k & i!=l 
								& j!=k & j!=l 
								& k !=l				
								
								
								) {
							System.out.print(abc[i]);
							System.out.print(abc[j]);
							System.out.print(abc[k]);
							System.out.println(abc[l]);
							
						}
							
							
						
					}
				}
			}
		}
	}

}
