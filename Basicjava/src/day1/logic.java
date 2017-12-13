package day1;

public class logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output;
		output = "Logical AND (&&)" +
		         "\nfalse && false:"+(false && false)+
		         "\nfalse && true:"+(false && true)+
		         "\ntrue && false:"+(true && false)+
		         "\ntrue && true:"+(false && false);
		 System.out.println(output);
		 
		 output = "\n\nLogical OR (||)" +
		         "\nfalse || false:"+(false || false)+
		         "\nfalse || true:"+(false || true)+
		         "\ntrue || false:"+(true || false)+
		         "\ntrue || true:"+(false || false);
		 System.out.println(output);
		 
		 output = "\n\nLogical NOT (!)"+
		         "\n!false:"+(!false)+
		         "\n!true:"+(!true);
		 System.out.println(output + "\n");
		 
		 int a=100;
		 int b=200;
		 int c=30;
		 
		 if((a>b)&&(a>c)){
			 
			 System.out.println("a is greater than b and c");
			 
		 }else if((b>c)&&(b>a)){
		 
		 System.out.println("b is greater");
		 
		 }else{
		 System.out.println("c is greater than");
		 }
		 if(a>b){
			 System.out.println("a>b");
		 }
		 
		 }
	}


