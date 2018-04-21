package chengyang.com;

import java.io.*;

public class Image_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File image=new File("E:/BG.JPG");
		File copied_image=new File("E:/baidu/copied_BG.jpg");

		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream(image);
			fos=new FileOutputStream(copied_image);
			
			byte bytes[]=new byte[1024];
			int n=0;
			
			while((n=fis.read(bytes))!=-1)
			{
				fos.write(bytes);
				System.out.println("file reading");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
