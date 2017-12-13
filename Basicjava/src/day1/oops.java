package day1;

import java.util.Arrays;

public class oops {
private int width;     //member variables or instances
private int height;
private int depth;
public String objName;

public oops(String objname){
	objName=objname;
}
public void setWidth(int w){// member function or method
	width=w;
	
}
public void setHeight(int h){// member function or method
	height=h;
	
}
public void setDepth(int d){// member function or method
	depth=d;
	
}
public void setValues(int h,int w,int d){
	height=h;width=w;depth=d;
}
public void getValue(String mm){
	if(mm=="height")
		System.out.println("Height of th"+objName+"="+height);
	if(mm=="width")
		System.out.println("Width of th"+objName+"="+width);
	if(mm=="depth")
		System.out.println("depth of th"+objName+"="+depth);
}
public int[] getValue(){
	int[] values={height,width,depth};
	return values;
	
}
public void getValues(){
	System.out.printf("Height of the"+objName+"=%d\nWidth of the"+objName+"=%d\nDepth of the"+objName+"=%d\n\n",height,width,depth);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oops oops1 = new oops("box1");
		oops1.setWidth(10);
		oops1.setHeight(20);
		oops1.setWidth(10);
		oops1.getValue("height");
		oops1.getValue("width");
		oops1.getValue("depth");
		System.out.println();
		oops oops2=new oops("oops2");
		oops2.setValues(100,200,50);
		oops2.getValue();
		oops oops3=new oops("oops3");
		oops3.getValue();
		oops oops4=oops3;
		oops4.setHeight(5);
		System.out.println(oops4.objName+"="+ Arrays.toString(oops4.getValue()));
		System.out.println("in oops4");
		oops4.getValue("height");
		System.out.println("In oops3");
		oops3.getValue("height");
	}

}
