package Section1_20_Question;
import java.util.Scanner;


/*
Question: Find the no.of charcters,that has repeated 3 consecutive times.
           input1:"aaabbccc"
           ouput1=2; */

public class Q9_consecutive {

	public static void main(String[] args) {
		

	/*	Scanner se = new Scanner(System.in);
		System.out.println("enter String");
		String s = se.next();*/

		 String s = "aaabbcccppptest@gmail.com";
		int count = 0;    //count variable to increment value stored
		for (int i = 0; i < s.length() - 2; i++)// for loop geting 3 value
		{
			if ((s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i) == s.charAt(i + 2)))// compairing value 0+1+2
			{
				count++;
			}
		}
		System.out.println(count);// final output

	}
}
