package Section1_20_Question;
import java.util.Scanner;

public class Q12_AveryFineDay {
	public static void main(String[] args) {

		
		/*
		Question:  String a="a very fine day"
                        output:A Very Fine Day */

		
		 
		 
		
		
		System.out.println("Enter here: ");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();

		//String s = "a very fine day";


		String s1[] = s.split(" ");// split string and storad s1
		String s3 = "";
		//System.out.println(s1.length);
		for (int i = 0; i < s1.length; i++) {
			// for loop for split lenght
			
			String s2 = s1[i];// Stoaring value in s2 String
			
		 // s3 = s3 + s2.replace(s2.charAt(0), s2.toUpperCase().charAt(0)) + " ";       // uppercase only 1st letter
		s3 = s3 + s2.replace(s2.charAt(0), s2.toLowerCase().charAt(0)) + " ";
		}
		System.out.println(s3);// final output

	}

}
