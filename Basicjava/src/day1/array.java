package day1;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//single array
		getseason();
		//getMonthname();
		singleDimArray();
		doubleDimArray();

	}
      public static void singleDimArray()
      {
    	  int month_days[]=new int[12];
    	  month_days[0]=31;// store 31 in zero-th position(index)
    	  month_days[1]=28;
    	  month_days[2]=31;
    	  month_days[3]=30;
    	  month_days[4]=31;
    	  month_days[5]=30;
    	  month_days[6]=30;
    	  month_days[7]=30;
    	  month_days[8]=30;
    	  month_days[1]=31;
    	  month_days[1]=30;
    	  month_days[1]=31;
    	  System.out.println("sept has"+month_days[8]+"days.");
    	  
    	  // method storing data in an array
    	  
    	  int[]mth_days={31,28,31,30,31,30,31,30,31,30,30,31};
    	  System.out.println("March has"+mth_days[2]+"days.");
      }
      
      public static void doubleDimArray(){
    	  int twoD[][]=new int[6][6];
    	  int i,j,k=10;
    	  for(i=0;i<6;i++){
    		  for(j=0;j<6;j++){
    			  twoD[i][j]=k;
    			  k++;
    		  }
    	 
    	  }
    	  for(i=0;i<6;i++){
    		  for(j=0;j<6;j++){
    			 System.out.print(twoD[i][j]+"");
    			
    		  }
    	 System.out.println();
    	  }
      
      
      
      }   

public static void  getseason(){
	  String season = null;
	  int month;
	  System.out.println("Enter an integer betwen 1-12");
	  Scanner input = new Scanner(System.in);
	  month = input.nextInt();
	  input.close();
	  if((month>=8 && month<=12) ||(month ==1)){
		  season = "winter";
	  }else if((month >= 4 && month<=8) ||(month ==1)){
	  
		  season = "summere";
	  }else if((month >= 6 && month<=10) ||(month ==1)){
	  
		  season = "rain";
	  }
	  String mth_name=getMonthname(month);
		 System.out.println(season) ;

}

private static String getMonthname(int month){
	
    
    String month_name;
    System.out.println("Enter the season number");
    
    switch(month)
    {
   case 1:
      System.out.println("Jan");
      break;
   case 2:
      System.out.println("Feb");
      break;
   case 3:
      System.out.println("mar");
      break;
   case 4:
      System.out.println("Apr");
      break;
   case 5:
      System.out.println("May");
      break;
   case 6:
      System.out.println("June");
      break;
   case 7:
      System.out.println("July");
      break;
   case 8:
      System.out.println("Aug");
      break;
   case 9:
      System.out.println("Sep");
      break;
   case 10:
      System.out.println("Oct");
      break;
   case 11:
      System.out.println("Nov");
      break;
   case 12:
      System.out.println("Dec");
      break;

    }
    return mth_name;
}
}
