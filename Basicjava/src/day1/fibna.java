package day1;

import java.util.Scanner;

public class fibna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x=0;
         int y=1;
         int z=x+y;
       
         int num;
         double i = Math.random()*10;
         System.out.print(i);
         System.out.println("enter an integer number:");
         
 		Scanner input = new Scanner(System.in);
 		num=input.nextInt();
 		input.close();
 	
         System.out.print(z);
       
         do{
        	int fib = x+y;
        	y=z;
        	x=y;
         System.out.print(fib+" ");
    
         z++;
         }while(z<10);
        	// for (int j=30;j>1; j--){
 	    		//System.out.print("j="+j);
 	    		//}
         
	}

}
