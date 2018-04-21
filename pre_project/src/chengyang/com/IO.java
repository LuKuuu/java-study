package chengyang.com;

import java.io.*;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f=new File("C:\\x.txt");
		
		//System.out.println(f.length());
		//System.out.println(f.canRead());
		
		
		
		File folder=new File("E:/Android");
		
		if(!folder.exists())
		{
			folder.mkdirs();
		}
		else
		{
			System.out.println("folder exist");
		}
		
		
		File f =new File("E:/baidu/baidu.txt");
		
		if(!f.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("file exists");
		}
		
		
		
		if(folder.isDirectory())
		{
			File list[]=folder.listFiles();
			for(int i=0;i<list.length;i++)
			{
				System.out.println("file name:"+list[i].getName());
			}
		}
		
		
		
		
	}
	
	

}
