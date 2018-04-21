package com.test1;

import java.net.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ipAddress=InetAddress.getLocalHost();
			System.out.println(ipAddress.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
