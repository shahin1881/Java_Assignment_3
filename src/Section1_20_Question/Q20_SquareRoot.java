
package Section1_20_Question;

import java.util.Scanner;

    /*
     Question:   Square root calculation of
                 ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
                 o/p should be rounded of to int;*/

public class Q20_SquareRoot {
	
	public static void main(String[] args) {
		

		Scanner se = new Scanner(System.in);
		System.out.println("Enter value 4intiger:=");
		int x1 = se.nextInt();
		int y1 = se.nextInt();
		int x2 = se.nextInt();
		int y2 = se.nextInt();

		// int x1 = 10; int x2 = 10; int y1 = 5; int y2 = 5;

		int no = (((x1 + y1) * (x1 + y1)) + ((x2 + y2) * (x2 + y2)));

		int d = (int) Math.sqrt(no);//Type casting 

		System.out.println((d));
		
		
		
		
		
	
		/*
	     int x1=10,x2=10;
		 int y1=5,y2=5;
		
		 int p;
		 
		 
		 p=((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
		 
		 // ((10+10)*(10+10)) + ((5+5) * (5+5))
		 //    20   *   20    +    10  *  10
		 //        400        +       100
		 //                 500
		 
		 System.out.println("calculation of total num: "+p);
		 System.out.println(Math.sqrt(p));     //square root of p
		 System.out.println((int)Math.sqrt(p));//Integer of p
	
		*/
	}
	
	
	}


