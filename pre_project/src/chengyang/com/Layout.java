/*
 * 
 */
package chengyang.com;
import java.awt.*;
import javax.swing.*;
public class Layout extends JFrame {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Borderlayout bj=new Borderlayout();
		Flowlayout fl=new Flowlayout();
		//Gridlayout gl=new Gridlayout();

	}
	
	
}


class Borderlayout extends JFrame
{
	
	JButton jb[]= new JButton[5];
	
	public Borderlayout()
	{
		
			jb[0]=new JButton("east");
			jb[1]=new JButton("west");
			jb[2]=new JButton("sorth");
			jb[3]=new JButton("north");
			jb[4]=new JButton("center");
			
			this.add(jb[0], BorderLayout.EAST);
			this.add(jb[1], BorderLayout.WEST);
			this.add(jb[2], BorderLayout.SOUTH);
			this.add(jb[3], BorderLayout.NORTH);
			this.add(jb[4], BorderLayout.CENTER);
			
			this.setTitle("Border Layout");
			this.setSize(500, 500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);
			
			

	}
}


class Flowlayout extends JFrame
{
	JButton jb[]= new JButton[30];
	
	
	public Flowlayout()
	{
		this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		for(int i=0; i<jb.length;i++)
		{
			jb[i]=new JButton(Integer.toString(i+1));
			this.add(jb[i]);
		}
		
		this.setTitle("Flow Layout");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
			
			
}


class Gridlayout extends JFrame
{
	JButton jb[]= new JButton[81];
	
	
	public Gridlayout()
	{
		this.setLayout(new GridLayout(9,9,10,10));
		for(int i=0; i<jb.length;i++)
		{
			jb[i]=new JButton(Integer.toString(i+1));
			this.add(jb[i]);
		}
		
		this.setTitle("Flow Layout");
		this.setSize(900, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
			
			
}

















