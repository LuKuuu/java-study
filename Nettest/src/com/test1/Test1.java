package com.test1;

import java.io.*;
import java.net.*;


public class Test1 {
	
	public static void main(String []args)
	{
		Test1 t1=new Test1();
	}

	
	public Test1()
	{
		try {
			

			ServerSocket ss=new ServerSocket(9999);
//			ss.close();
			
			System.out.println("I am the server and I am listening");
			
			//it will return a socket connect
			Socket s=ss.accept();
			
			System.out.println("it works");
			
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			
			
			System.out.println(br.readLine());
			
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			pw.println("This is Test 1");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
