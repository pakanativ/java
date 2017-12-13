package day1;

import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hi = new Scanner(System.in);

		   int a = 1+ (int) (Math.random() * 10);
		   int guess;

		   System.out.println("I am thinking of a number from 1 to 100 ... guess what it is ?");
		   guess = hi.nextInt();

		   while(guess != a){
		   if (guess > a)
		   {  
		     System.out.println("lower!");

		   }
		   else if (guess < a) 
		   {
		    System.out.println("higher!");

		   }
		   else 
		   {
		     System.out.println("Congratulations.   You guessed the number with X tries!");
		   }
		   }

	}

}
