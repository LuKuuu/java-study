package com.test2;

import java.net.*;
import java.io.*;


public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyServer ms=new MyServer();

	}
	
	public MyServer()
	{
		
		
		try {
			System.out.println("The server is listening");
			ServerSocket ss=new ServerSocket(999);
			
			Socket s=ss.accept();
			System.out.println("client conneted");
			
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader bf=new BufferedReader(isr);
			
			PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
			InputStreamReader isr2=new InputStreamReader(System.in);
			BufferedReader bf2=new BufferedReader(isr2);
			
			while(true)
			{
				String message=bf.readLine();
				if(message.equals("bye"))
				{
					System.out.println("server close");
					s.close();
					break;
				}
				System.out.println("the client sent a message: "+message);
				
				
				
				System.out.println("please input the message you want to sent to the client");
				String message_send_to_client=bf2.readLine();
				
				pw.println(message_send_to_client);
				
				
			}			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
