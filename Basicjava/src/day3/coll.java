package day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDuplicateChars("abdshfjdhf");
	}


public static void countDuplicateChars(String str){
	System.out.println("Given str="+str);
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	char[] chars=str.toCharArray();
	System.out.println("chars[2]="+chars[2]);
	for(Character ch:chars){
		if(map.containsKey(ch)){
			map.put(ch,map.get(ch)+1);
		}else{
			map.put(ch, 1);
		}
	}
	
	System.out.println("method 1 for listing all chars");
	Set<Character>keys=map.keySet();
	for(Character ch:keys){
		System.out.println("char"+ch+""+map.get(ch));
		
	}
	System.out.println("Method 2 for listing all chars");
	Set<?>set=map.entrySet();
	//Iterator<?>itr=set.iterator();
	Iterator itr=set.iterator();
	while(itr.hasNext()){
	Map.Entry me=(Map.Entry)itr.next();
	System.out.println(me.getKey()+":"+me.getValue());		
}
}
}
