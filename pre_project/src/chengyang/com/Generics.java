package chengyang.com;

import java.util.*;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Dog> a1=new ArrayList<Dog>();
		Dog dog1=new Dog();
		a1.add(dog1);
		
		Dog temp= a1.get(0);
		
		Cat cat1=new Cat();
		
		System.out.println(cat1.getClass().getTypeName());
		//a1.add(cat1);
		
		
	}

}

class Dog
{
	public String name;
	public int age;
	
	//source>>>generate...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

class Cat
{
	public String name;
	public int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}