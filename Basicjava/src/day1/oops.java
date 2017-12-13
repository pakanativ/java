package day1;

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

	}

}
