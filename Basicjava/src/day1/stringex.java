package day1;

public class stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] selenium = {'s','e','l','e','n','i','u','m'};
		String str = new String(selenium);
		System.out.println(str);
		
		String str2 = String.valueOf(selenium);
		System.out.println(str2+ "type is"+str2.getClass().getSimpleName());
		
		Integer value=101;
		System.out.println("Type of value is"+value.getClass().getSimpleName());
		str2=String.valueOf(value);
		System.out.println(str2 +"-"+str2.getClass().getSimpleName());
		String someStr="welcome to java basic programming";
		int len=someStr.length();
		System.out.println("String length is:"+len);
		String someStr1="Hi friends";
		System.out.println(someStr1+someStr);
		System.out.println(someStr1.concat(someStr));
		System.out.println(str.replace("e","E"));
		System.out.println(someStr1.equals("hi friends!"));
		System.out.println(str.equalsIgnoreCase("selenium"));

	}

}
