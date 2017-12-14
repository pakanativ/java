package day1;

public class Mainshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
triangle tr=new triangle(20,30,11, "child class triangle tr");
tr.getValues();
tr.setHeight(4);
System.out.println("Height of the tirangle:"+tr.getHeight());
	}

}
