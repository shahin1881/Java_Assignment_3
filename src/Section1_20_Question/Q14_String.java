package Section1_20_Question;
import java.util.Scanner;

public class Q14_String {
	public static void main(String[] args) {
		/*
		 Question:   For the given string display the middle 2 value, case satisfies only if string is 
                     of even length.
                     i/p - java
                     o/p - av
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("Enter string=");
		String s = se.next();
		
		/*int n = s.length()/2;
		System.out.println(s.substring(n - 1, n + 1));*/
		
		
		System.out.println(s.substring(1, s.length()-1));//final output
	}

}
