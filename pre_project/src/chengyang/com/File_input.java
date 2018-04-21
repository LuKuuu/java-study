package chengyang.com;


import java.io.*;
public class File_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("E:/baidu/baidu.txt");
		
		//file does have the ability of reading and writing
		
		FileInputStream fis = null;
		
		try {
			fis=new FileInputStream(f);
			
			byte[] bytes=new byte[1024];
			
			int n=0;
			
			while((n=fis.read(bytes))!=-1)
			{
				String s=new String(bytes,0,n);
				
				System.out.println(s);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				if(fis!=null)
				{
					fis.close();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
