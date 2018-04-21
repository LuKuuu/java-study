package chengyang.com;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserManage qq=new UserManage();
		
		User lcy= new User(1240291449, "Edward");
		qq.addUser(lcy);

		
		User qk=new User(409036894, "Camille");
		qq.addUser(qk);

		
		User dog= new User(123456789, "DOOOOG");
		qq.addUser(dog);
		
		
		qq.showID("Camille");
		qq.showSize();
		qq.deleteUser(123456789);
		qq.showSize();

		}
}

class UserManage
{
	private ArrayList users=null;
	public UserManage()
	{
	 users=new ArrayList();
	}
	
	
	public void addUser(User user)
	{
		users.add(user);
	}
	
	public void deleteUser(int ID)
	{
		boolean exist=false;
		for(int i=0;i<users.size();i++)
		{
			User temp=(User) users.get(i);
			if(ID==temp.ID)
			{
				users.remove(i);
				System.out.println("User name is "+ temp.name+", user has been deleted.");
				exist=true;				
			}
			
		}
		if(exist)
		{
		}
		else
		{
			System.out.println("cannot find that user");
		}
	}
	
	
	public void showSize()
	{
		System.out.println("The total number of users is "+users.size()+".");
	}
	
	public void showName(int userID)
	{
		for(int i=0; i<users.size();i++)
		{
			User temp=(User) users.get(i);
			
		}
	}
	
	public void showID(String name)
	{
		boolean exist=false;
		for(int i=0;i<users.size();i++)
		{
			User temp=(User) users.get(i);
			if((temp.name).equals(name))
			{
				System.out.println("The userID is "+temp.ID+".");
				exist=true;
				
			}
			
		}
		if(exist)
		{
		}
		else
		{
			System.out.println("cannot find that user");
		}
	}
	
}

class User
{
	public int ID;
	String name;
	
	public User(int ID, String name)
	{
		this.ID=ID;
		this.name=name;
	}
}