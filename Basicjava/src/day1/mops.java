package day1;

import java.util.Scanner;

public class mops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My first pgm");
mops m = new mops();
m.basicMaths();
m.CheckEvenOdd();
	}

	public void basicMaths(){

		float a=10.0f;
		float b=20.0f;
		int c;
		c=(int) (a+b);
		System.out.println("a+b" +c);
		c=(int) (a*b);
		System.out.println("a*b" +c);
				
		c=(int) (a-b);
		System.out.println("a-b" +c);
		float f=a/b;
		System.out.println("a/b" +c);
		
		int d=0;
		System.out.println("d=" + d++);
		System.out.println("d=" + ++d);
	     }
	public void CheckEvenOdd(){
		int num;
		System.out.println("enter an integer number:");
		Scanner input = new Scanner(System.in);
		num=input.nextInt();
		input.close();
		if(num % 2 == 0)
			System.out.println("entered number"+num+"is even");
		else
			System.out.println("entered number"+num+"is odd");
		
		
	}
		
	
}
