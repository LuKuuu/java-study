package chengyang.com;

import java.awt.*;
import javax.swing.*;

public class Drawing extends JFrame {
	
	MyPanel mp=new MyPanel();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawing d =new Drawing();
		

	}
	public Drawing()
	{
		this.add(mp);
		this.setTitle("Drawboard");
		this.setSize(300, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MyPanel extends JPanel
{
	
	
	// Graphics is seems like a pen
	public void paint(Graphics g)
	{
		super.paint(g);
		
		
		//g.drawOval(30, 30, 100, 100);
		
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(30, 30, 100, 100);
		
		g.setColor(Color.darkGray);
		g.setFont(new Font("Times New Roman", Font.ITALIC, 40));
		g.drawString("xMessage", 150, 150);
		
		
	}
}