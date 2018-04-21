package chengyang.com;

//gui
import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.util.concurrent.TimeUnit;
public class Swing extends JFrame {
	
	JButton jb1=null;
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Swing swing=new Swing();
		

	}
	
	public Swing()
	{
		
		this.setTitle("Hello world!");
		this.setSize(600,400);
		this.setLocation(300, 300);
		
		jb1=new JButton("hi");
		this.add(jb1);
		
		
		
		//The exit application default window close operation. 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setVisible(true);
		
		//TimeUnit.SECONDS.sleep(10);
		//jf.setVisible(false);
		
		
	}

}
