package chengyang.com;

import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Typing extends JFrame {
	
	Board b;
	JButton save;
	
	public static void main(String[] args)
	{ 
		Typing t=new Typing();
		
		
	}
	
	public Typing()
	{
		this.setTitle("Type Place");
		this.setSize(1800, 100);
		this.setResizable(false);
		
		
//		save=new JButton("Save");			
//		System.out.println("save created");				
//		this.add(save, BorderLayout.EAST);
		
				
		
		b=new Board();
		this.add(b,BorderLayout.CENTER);
		this.addKeyListener(b);
		
		
		
		
		this.setVisible(true);

		
		
		
		
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	


}


class Board extends JPanel implements KeyListener, Runnable
{
	
	String s="";
	char ch;
	
	public Board()
	{
		this.setBackground(Color.BLACK);
		
	}
	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.white);
		
		//g.fillRect(70, 57, 68, 78);
		g.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		g.drawString(s, 20, 40);
	}

	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Key pressed"+e.getKeyCode());
		if(e.getKeyChar()==10)
		{
			this.stringSaving(s);
			System.out.println("file saved");
			s="";
			this.repaint();
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		ch=e.getKeyChar();
		s=s+ch;
		System.out.println(s);
		this.repaint();
		
	}
	
	
	public void stringSaving(String s)
	{
		File floder=new File("E:/String");
		if(!floder.exists())
		{
			floder.mkdirs();
			
		}
		else
		{
			System.out.println("Floder exists");
		}
		
		File file=null;
		
		int no=1;
		
		String path;
		
		
		
		while(true)
		{
			path="E:/String/string"+no+".txt";
			file=new File(path);
			if(!file.exists())
			{
				try {
					file.createNewFile();
					System.out.println("file created");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			}
			else {
				System.out.println("string"+no+".txt exists");
				no++;
			}
		}
		
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(file);
			fos.write(s.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
}