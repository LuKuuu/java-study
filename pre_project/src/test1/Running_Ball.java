package test1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Running_Ball extends JFrame {
	
	MyPanel mp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Running_Ball rb=new Running_Ball();		

	}
	
	public Running_Ball()
	{
		
		mp=new MyPanel();
		this.add(mp);
		
		this.addKeyListener(mp);
		
		
		
		
		this.setTitle("Running Ball");
		this.setSize(1000,1000);
		this.setResizable(false);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	
		
	


		
		

}


class MyPanel extends JPanel implements KeyListener
{
	int x;
	int y;
	
	public void paint (Graphics g)
	{
		super.paint(g);
		g.fillOval(x-25,y -25, 50, 50);
		
		g.setColor(Color.red);
	
	
	}

	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		
		System.out.println("key pressed "+k.getKeyCode());
		
		if(k.getKeyCode() == KeyEvent.VK_W)
		{
			y=y-5;
			
			
			
		}
		else if(k.getKeyCode() == KeyEvent.VK_S)
		{
			y=y+5;			
			
		}
		else if(k.getKeyCode()== KeyEvent.VK_A)
		{
			x=x-5;
			
		}
		else if(k.getKeyCode() == KeyEvent.VK_D)
		{
			x=x+5;
		}
		this.repaint();
			
		
	
		
	}

	@Override
	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		System.out.println("key released "+k.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("key typed");
		
	}
}



