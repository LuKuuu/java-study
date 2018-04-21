package com.test3;

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
			System.out.println("The client start is conneted to port 999");
			
			Sender sender=new Sender(s);
			Thread t=new Thread(sender);
			t.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

class Sender implements Runnable
{
	Socket s;
	InputStreamReader isr;
	BufferedReader br;
	PrintWriter pw;
	
	public Sender(Socket s)
	{
		this.s=s;
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		try {
			pw=new PrintWriter(s.getOutputStream(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
//					s.close();
					
					this.wait();
					
				}
				
				pw.println(message_from_Client);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		}
		
	}
}









