package chengyang.com;

import java.io.*;

public class Read_and_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="my name is Chengyang Li.";
		
		File aa=new File("E:/baidu/aa.txt");
		File bb=new File("E:/baidu/bb.txt");
		
		
		try {
			aa.createNewFile();
			bb.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		//write the String into the file
		
		FileOutputStream fos=null;
		
		try {
			fos= new FileOutputStream(aa);
			
			fos.write(s.getBytes());
			


			
			
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
		
		
		//try to copy aa to bb
		
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader(aa);
			
			
			
			fw=new FileWriter(bb);
			
			char chars[]=new char[1024];
			
			int n=0;
			
			while((n=fr.read(chars))!=-1)
			{
				String ss=new String(chars, 0, n);
				System.out.println(ss);
				fw.write(ss);
				
				fw.write(chars, 0, n);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
