package chengyang.com;

import java.io.*;

public class File_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("E:/baidu/news.txt");
		
		String s="hahaha \r\nHAHAHAHA \r\n";
		
		String s2="husadg'izgda";
		
		
		
		FileOutputStream fos=null;
		
		try {
			
			fos=new FileOutputStream(f);
			
			
			
			fos.write(s.getBytes());
			fos.write(s2.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
