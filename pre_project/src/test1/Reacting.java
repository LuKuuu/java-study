/*
 * event reacting to color
 */

package test1;

/*import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Reacting extends JFrame implements ActionListener{
	
	
	JButton jb1;
	JButton jb2;
	
	Cat cat1;
	
	
	
	MyPanel blackp;
	MyPanel redp;
	
	JPanel jp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reacting r=new Reacting();
		
		

	}
	public Reacting()
	{
		this.setTitle("color reacting");
		this.setSize(600, 400);
		this.setResizable(false);
		
		
		jb1=new JButton("red");
		jb2=new JButton("blue");		
		
		
		
		blackp=new MyPanel(Color.blue);
		redp=new MyPanel(Color.red);
		
		
		jp=new JPanel();
		jp.setBackground(Color.blue);
		
		this.add(jb1, BorderLayout.WEST);
		this.add(jb2, BorderLayout.EAST);
		//this.add(blackp, BorderLayout.CENTER);
		this.add(jp, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb1.addActionListener(this);
		jb1.setActionCommand("red");
		
		
		jb2.addActionListener(this);
		jb2.setActionCommand("blue");
		
		
		
		cat1=new Cat();
		jb1.addActionListener(cat1);
		jb2.addActionListener(cat1);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("red"))
		{
			System.out.println("red");
			jp.setBackground(Color.red);
			
			//this.add(redp, BorderLayout.CENTER);
			

		}
		else if(e.getActionCommand().equals("blue"))
		{
			System.out.println("blue");
			jp.setBackground(Color.blue);
			//this.add(blackp, BorderLayout.CENTER);

			
		}
		
	}

}

class MyPanel extends JPanel
{
	Color c;
	
	public MyPanel(Color c)
	{
		this.setBackground(c);
		this.c=c;
		
	}
	
	/*public void paint(Graphics g)
	{
		g.setColor(c);
		g.fillOval(100, 150, 100, 100);
	}
}


class Cat implements ActionListener
{
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("the cat get that");
		
	}
	
}*/