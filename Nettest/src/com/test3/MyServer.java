package com.test3;

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
			ServerSocket ss=new ServerSocket(999);
			System.out.println("The server start to listen at port 999");
			Socket s=ss.accept();
			System.out.println("Client connected");
			
			Listener listener=new Listener(s);
			Thread t1=new Thread(listener);
			t1.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

}

class Listener implements Runnable
{
	Socket s;
	InputStreamReader isr;
	BufferedReader br;
	
	public Listener(Socket s)
	{
		this.s=s;	
		
		try {
			isr=new InputStreamReader(s.getInputStream());
			br=new BufferedReader(isr);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				String message_from_Client=br.readLine();
				
				if(message_from_Client.equals("bye"))
				{
					System.out.println("the convesation end");
					s.close();
					break;
				}
				
				System.out.println(message_from_Client);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
			
		}
			
		
	}
	
}