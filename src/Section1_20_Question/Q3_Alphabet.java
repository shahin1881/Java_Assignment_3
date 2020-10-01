package Section1_20_Question;

import java.util.Scanner;

public class Q3_Alphabet {

	public static void main(String[] args) {
		/*
		 *Question:  Given array of string check whether all the elements contains only digits not any 
                     alaphabets. If condn satisfied print 1 else -1.
                     Input:{"123","23.14","522"}
                      output:1
                      
                     Input1:{"asd","123","42.20"}
                     output:-1
		 */
		
	   String[] s = new String[3];
		System.out.println("Enter here= ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {

			s[i] = sc.next();//

		}

		 //String[] s = { "123", "23.14", "522" };
		
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			String x = s[i];//123,23.14,522

			try {

				double no = Double.parseDouble(x);//123,23.14,522.. convert value in bouble
				count++;//1,2,3
			} catch (Throwable t) {
				System.out.println("-1");// condition fail
			}
		}
		if (count == s.length) {// compairing count and String lenght
			System.out.println("1");
		
		}

	}

}
