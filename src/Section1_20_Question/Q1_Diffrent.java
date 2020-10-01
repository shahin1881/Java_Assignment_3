package Section1_20_Question;

import java.util.Scanner;

public class Q1_Diffrent {
//16/20
	public static void main(String[] args) {

		/*
		  QUETION:  input1="abc2012345"
                    input2="abc2112660"
                    input 3=4
                    here "abc**" refers to customer id.
                    12345 refers to last month eb reading and 12660 refers to this month eb reading
                    find the difference between two readings and multiply it by input3 ie., 
                     output=(12660-12345)*4
                     
                                   315*4=1260
		 */
		
		Scanner se = new Scanner(System.in);
		System.out.println("Enter 1 string=");
		String s1 = se.next();
		System.out.println("Enter 2 string=");
		String s2 = se.next();
		

		//String s1 = "abc2012345";
	   //String s2 = "abc2112660";

		String s3 = s1.substring(5, s1.length());//substring String start with 5
		String s4 = s2.substring(5, s2.length());

		int no1 = Integer.parseInt(s3);//convert into intiger
		int no2 = Integer.parseInt(s4);//convert into intiger
		int ans = 0, 
				n = 4;

		if (no1 > no2) {
			ans = no1 - no2;
		} else {
			ans = no2 - no1;
		}

		int nj = ans * n;//315*4=12+1260
		System.out.println(nj);//final outpute

	}

}

