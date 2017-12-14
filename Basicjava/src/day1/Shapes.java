package day1;

public class Shapes {
	int length;
	public Shapes(int l){
		this.length=l;
		System.out.println("shapes overloaded constructor with one parameter");
	}

public Shapes(){
	System.out.println("shapes default constructor");
}	
//specifying a method here without body(abstarct)
abstract void compute_area();
void get_length(){
	this.length=length;
}

}
class Squares extends Shapes{
	public Squares(int side){
		super(side);
	}
	void compute_area(){
		System.out.println("Area of square,"+length+"* "+length+"="+length*length");
	}
	public void getSide(){
		getLength();
	}
}
class Triangles extends Shapes{
	int height;
	public Triangles(int height,int base){
		super(base);
		this.height=height;
	}
	void compute_area(){
		System.out.println("Area of Triangle("+height+"*"+length+")/2="+(height))
	}
	void compute_perimeter(int side){
		System.out.println("Perimeter of a triangle("+height+"+"+lenght+"+"+side)
	}
}
class Circles extends Shapes{
	private int radius;
	public Circles(int radius){
		this.radius=radius;
	}
	void compute_area(){
		System.out.println("Area of Circle,"+Math.PI+"*("+radius+"*"+radius+")=
	}
	int getRadius(){
		return this.radius;
	}
}
public class DemoAbstaractClass{
	public static void main(String[] args){
		int rnd=(int)(Math.random()*5);
		System.out.println("rnd="+rnd);
		Squares sq=new Squares(rnd);
		sq.getSide();sq.compute_area();
		Circles cir=new Circles(rnd);
		System.out.println("radius="+cir.getRadius());
		cir.compute_area();Triangles tri=new Triangles(rnd,10);
		tri.compute_area();
		tri.compute_perimeter(5);
		
	}
}