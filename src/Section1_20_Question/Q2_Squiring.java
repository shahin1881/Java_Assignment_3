package Section1_20_Question;

import java.util.Scanner;

public class Q2_Squiring {

	public static void main(String[] args) {
		/*
		  QUESTION:  Given array of intergers,print the sum of elements sqaring/cubing as per the
		             power of their indices.
		            
		            eg:input:{2,3,5}//1+3+25=29 
		            Output:29
		 */
		
		int[] a = new int[3];
		System.out.println("Enter here= ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		
		//int a[] = { 2, 3, 5 };//2*0=0....1,3*1=3,5*5=25...25+3+1=29
		
		double x = 0;
		for (int i = 0; i < a.length; i++) {
			x = x + (Math.pow((double) a[i], (double) i));
		}
		System.out.println((int) x);

	}

}

		
		   