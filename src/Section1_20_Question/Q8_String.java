package Section1_20_Question;
import java.util.Scanner;

public class Q8_String {
	public static void main(String[] args) {
		/*
		 * Question:  Count the number of times the second word in second string occurs in first string-
                      case sensitive.
                      input1=hai hello hai where hai Hai; //3 times hai
                      input2=what hai
                      output=3;*/
		
		/*System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();// user enter first string
		System.out.println("enter here");
		String s1=sc.nextLine();// user enter second string
*/




		String s = "hai hello hai where hai Hai";
		String s1 = "what hai";
		String a1[] = s.split(" ");
		String a2[] = s1.split(" ");
		String n = a2[1];
		int count = 0;

		for (int i = 0; i < a1.length; i++) {
			String j = a1[i];

			if (j.equals(n)) { 
				count++;
			}
		}
		System.out.println(count);//final output

	}

}
