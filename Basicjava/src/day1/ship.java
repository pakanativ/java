package day1;

public class ship {
	protected int width;     //member variables or instances
	protected int height;
	protected int depth;
	public String objName;
	 
	public ship(String objname){
		objName=objname;
	}
	public void setWidth(int w){// member function or method
		width=w;
		
	}
	public void setHeight(int h){// member function or method
		height=h;
		
	}
	
	public void setValues(int h,int w){
		height=h;width=w;
	}
	public void getValue(String mm){
		if(mm=="height")
			System.out.println("Height of th"+objName+"="+height);
		if(mm=="width")
			System.out.println("base of th"+objName+"="+width);
		
	}
	public int[] getValue(){
		int[] values={height,width};
		return values;
		
	}
	public void getValues(){
		System.out.printf("Height of the"+objName+"=%d\nWidth of the"+objName+"=%d\nDepth of the"+objName+"=%d\n\n",height,width);
	}

	}
	class triangle extends ship{
		int base;
		public triangle(int h,int w,int b, String objName){
			
			super(objName);
			width=w;
			height=h;
			base=b;
		}

		public int getHeight(){
			return height;
		}
		public void setWeight(int ht){
			height=ht;
		}
		public int[] getValue(){
			int[] values={height,width,depth};
			return values;
		}
}
