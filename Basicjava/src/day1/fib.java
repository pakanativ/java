package day1;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prevVal = 1;
	     int prevPrevVal = 0;
	     int n = 0;
	     do{
	         int currVal = prevVal + prevPrevVal;
	         prevPrevVal = prevVal;
	         prevVal = currVal;
	         System.out.print(currVal+" ");
	         n++;
	     }while(n<5);//n is the number of terms
	     for (int j=10;j>1; j--){
	    		System.out.println("j="+j);
	    		}

	}

}
