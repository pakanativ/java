package day1;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0;
		int num=0;
		int rand = (int)(Math.random()*10);
		System.out.println(rand);
		System.out.println("enter integer number");
		Scanner hi = new Scanner(System.in);
		while(a!=rand){
			a = hi.nextInt();
			System.out.println("enter integer number");
			num++;
		}
		System.out.println(" number:"+num);
		hi.close();
	}

}
