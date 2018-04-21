package com.test1;

import java.net.*;
import java.io.*;

public class Test2 {
	
	public static void main(String []args)
	{
		Test2 t2=new Test2();
		
	}
	
	public Test2()
	{
		try {
			Socket s=new Socket("10.20.181.140", 9999);
			//sent data though pw, true means refresh
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			
			pw.println("This is test2");
			System.out.println("message sent");

			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			
			String response=br.readLine();
			
			System.out.println("message received: "+response);
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
