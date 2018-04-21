package test1;

import java.io.*;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File floder=new File("E:/String");
		if(!floder.exists())
		{
			floder.mkdirs();
			
		}
		else
		{
			System.out.println("Floder exists");
		}
		
		File file=null;
		
		int no=1;
		
		String path;
		
		
		
		
		while(true)
		{
			path="E:/String/string"+no+".txt";
			file=new File(path);
			if(!file.exists())
			{
				try {
					file.createNewFile();
					System.out.println("file created");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			}
			else {
				System.out.println("string"+no+".txt exists");
				no++;
			}
		}
		
		
		
		
		
		
	}

}
