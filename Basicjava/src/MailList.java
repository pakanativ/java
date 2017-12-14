import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Address{
	private String name,street;
	private String city;
	private String state;
	private String code;
	public Address(String n,String s,String c,String st,String cd){
		name=n;
		street=s;
		city=c;
		state=st;
		code=cd;
	}
	public String toString(){
		return name + "\n"+street+"\n"+city+""+state+""+code;
	}
}
public class MailList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Address>ml=new ArrayList<Address>();
//add elememnts to the linked list
Address address1=new Address("subbu","rao","selenium","pune","12334");
ml.add(address1);
ml.add(new Address("subbarao","ao","selenm","pue","1233467"));
ml.add(new Address("su","rao","sele","pun","1233499"));
//iterating method
System.out.println("the given address are:");
Iterator<Address>itr=ml.iterator();
while(itr.hasNext()){
	Object element=itr.next();
	System.out.println(element+"\n");
}
//iterator method2
int count=1;
for(Address element:ml){
	System.out.println("Address"+count);
	System.out.println(element);
	System.out.println();
	count++;
}
// no iteration,simply access the element in the list ml
System.out.println("Address@pos1\n"+ml.get(0)+"\n");
System.out.println("Address@pos2\n"+ml.get(1)+"\n");
System.out.println("Address@pos3\n"+ml.get(2)+"\n");
	}

}
