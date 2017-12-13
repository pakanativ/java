package day1;

import java.util.Arrays;

public class MainBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box Box1 = new Box("box1");
		Box1.setWidth(10);
		Box1.setHeight(20);
		Box1.setWidth(10);
		Box1.getValue("height");
		Box1.getValue("width");
		Box1.getValue("depth");
		System.out.println();
		Box Box2=new Box("Box2");
		Box2.setValues(100,200,50);
		Box2.getValue();
		Box Box3=new Box("Box3");
		Box3.getValue();
		Box Box4=Box3;
		Box4.setHeight(5);
		System.out.println(Box4.objName+"="+ Arrays.toString(Box4.getValue()));
		System.out.println("in Box4");
		Box4.getValue("height");
		System.out.println("In Box3");
		Box3.getValue("height");
		BoxWeight bw = new BoxWeight(10,20,5,2,"child class Boxweight bw");
		bw.getValue();
		System.out.println(Arrays.toString(bw.getValue()));
		bw.setWeight(4);
		System.out.println(bw.getWeight());
	}

}
