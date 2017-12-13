package day1;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,c=0,result=0;
		int b=1;
		int rnd=(int)(Math.random()*10);
		System.out.print(a+","+b+",");
		do{
			result=a+b;
			System.out.println(","+result);
			a=b;
			b=result;
			c++;
		}while(c<=rnd);
		
		
		
	
		}
		}
		
		
	


