package com.test2;

import java.net.*;
import java.io.*;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClient mc=new MyClient();

	}
	
	public MyClient()
	{
		try {
			Socket s=new Socket("10.20.181.140", 999);
			
			PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
			
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			
			InputStreamReader isr2=new InputStreamReader(System.in);
			BufferedReader br2=new BufferedReader(isr2);
			
			
			
			while(true)
			{
				System.out.println("please input the message you want to sent to server");
				
				String message=br2.readLine();
				pw.println(message);
				
				if(message.equals("bye"))
				{
					System.out.println("the convecition end");
					s.close();
					break;
				}
				
				System.out.println("Here is the message sent from server");
				String Message_from_server=br.readLine();
				
				
				System.out.println(Message_from_server);
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
