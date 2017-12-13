package day1;

import java.util.Random;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		donothandleException();
		handleGenericException();
		handleException();
		
	}
	private static void donothandleException(){

		System.out.println("\n*****donothandleException()******");
		int a=0,b=0,c=3,d=0;
		Random r=new Random();
		
		System.out.println("a="+a+"\tb="+b);
		System.out.println("c="+c);
		d=12345/c;
		System.out.println("d="+d);
	}
    private static void handleGenericException(){
    	System.out.println("\n*****handleGenericException()******");
    	int a=0,b=0,c=0,d=0;
    	Random r=new Random();
    	for(int i=1;i<=5;i++){
    		try{
    			a=r.nextInt();
    			b=r.nextInt();
    			c=a/b;
    			d=12345/c;
    		
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    		System.out.println(i+"-in catch block,a/b:"+c+",d:Undefined");
    		d=0;
    	}finally{
    		System.out.println(i+"-in finally block,a/b:"+c+",d:"+d);
    		d=0;
    	}
    	}	
    		
    		
    }
    

private char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}
private static void handleException(){
	System.out.println("\n*****handleException()******");
	int a=2,b=1,c=3,d=5;
	int arr[]={0,0,0,0};
	Random r=new Random();
	for(int i=1;i<=5;i++){
		try{
			a=r.nextInt();
			b=r.nextInt();
			c=a/b;
			d=12345/c;
		System.out.println("arr["+(i-1)+"]="+i);
	}catch(ArithmeticException e){
		System.out.println(e.getMessage());
		System.out.println(i+"-in catch block,a/b:"+c+",d:Undefined\narr[i]"+arr[i-1]);
		d=0;
	}catch(ArrayIndexOutOfBoundsException  ae){
			System.out.println(ae.getMessage());
			System.out.println(i+"-in catch block,a/b:"+c+",d:Undefined\narr["+(i-1)+"]="+i);
			d=0;
	}finally{
		System.out.println(i+"-in finally block,a/b:"+c+",d:"+d);
		d=0;
	}
	}	
		
		
}
}

