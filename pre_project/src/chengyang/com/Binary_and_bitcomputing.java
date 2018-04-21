package chengyang.com;

public class Binary_and_bitcomputing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		//00000000 00000000 00000000 00000010
		int y=-2;
		//10000000 00000000 00000000 00000010
		//01111111 11111111 11111111 11111101
		//01111111 11111111 11111111 11111110
		int sum=x+y;
		//10000000 00000000 00000000 00000000
		

		int a=~2;
		System.out.println(a);
		
		int b=2&3;
		int c=2|3;
		int d=~-5;
		int e= 13&7;
		int f=-3^3;
		
		
	}

}
