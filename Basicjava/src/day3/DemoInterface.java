package day3;

import java.awt.Rectangle;
import java.awt.Shape;

abstract class Interface {
	int length;
	public Interface(int l){
		this.length=l;
		System.out.println("shapes overloaded constructor with one parameter");
	}

public Interface(){
	System.out.println("shapes default constructor");
}	
//specifying a method here without body(abstarct)
abstract void compute_area();
void get_length(){
	this.length=length;
}

}
class Squares implements Interface{
	public Squares(int side){
		super(side);
	}
	void compute_area(){
		System.out.println("Area of square,"+length+"* "+length+"="+length*length);
	}
	public void getSide(){
		get_length();
	}
}
class Triangles implements Interface{
	int height;
	public Triangles(int height,int base){
		super(base);
		this.height=height;
	}
	void compute_area(){
		System.out.println("Area of Triangle("+height+"*"+length+")/2="+(height));
	}
	void compute_perimeter(int side){
		System.out.println("Perimeter of a triangle("+height+"+"+length+"+"+side+")");
	}
}
class Circles extends Interface{
	private int radius;
	public Circles(int radius){
		this.radius=radius;
	}
	void compute_area(){
		System.out.println("Area of Circle,"+Math.PI+"*("+radius+"*"+radius+")="+Math.round(((Math.PI*(radius*radius)))));
	}
	int getRadius(){
		return this.radius;
	}
}
public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rnd=(int)(Math.random()*5);
		System.out.println("rnd="+rnd);
		Squares sq=new Squares(rnd);
		sq.getSide();sq.compute_area();
		Circles cir=new Circles(rnd);
		System.out.println("radius="+cir.getRadius());
		cir.compute_area();Triangles tri=new Triangles(rnd,10);
		tri.compute_area();
		tri.compute_perimeter(5);
		System.out.println("Type shapes");
		Shape sh = new Square(10);
		sh.compute_perimeter();
		sh=new Circle(4);
		sh.compute_area();
		System.out.println("----Type Shape\n");
		Rectangle r = new Recatangle(20,30);
		r.compute_area();
		//sh=new Recatangle(5,10); //Oops! exception,shape donot know who this
		// sh.compute_area();
		
	}

}
