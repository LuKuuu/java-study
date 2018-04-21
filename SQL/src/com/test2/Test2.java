package com.test2;

import java.net.InetAddress;
import java.net.UnknownHostException;
 

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  InetAddress ip;
	        String hostname;
	        try {
	            ip = InetAddress.getLocalHost();
	            hostname = ip.getHostName();
	            System.out.println("Your current IP address : " + ip);
	            System.out.println("Your current Hostname : " + hostname);
	 
	        } catch (UnknownHostException e) {
	 
	            e.printStackTrace();
	        }

	}

}


