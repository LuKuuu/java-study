/*
 * show the usage of buffered reader and buffered writer
 */

package chengyang.com;

import java.io.*;

public class Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		BufferedReader bfr=null;
		
		FileWriter fw=null;
		BufferedWriter bfw=null;
		
		
		
		
		
		try {
			fr=new FileReader("E:/baidu/aa.txt");
			
			bfr=new BufferedReader(fr);
			
			fw=new FileWriter("E:/baidu/bb.txt");
			
			bfw=new BufferedWriter(fw);
			
			String s="";
			
			
			while((s=bfr.readLine())!=null)
			{
				System.out.println(s);
				bfw.write(s+"\r\n");
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				
				bfr.close();
				fr.close();
				
				bfw.close();				
				fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		
		

	}

}
