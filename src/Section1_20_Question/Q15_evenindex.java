package Section1_20_Question;
import java.util.Scanner;

public class Q15_evenindex {
	public static void main(String[] args) {

		/*
		 Question:  Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
                    If both the sum is equal return 1 or return -1.*/
		
		int[] no = new int[4];//new array create with 4 value
		System.out.println("Enter here= ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < no.length; i++) {

			no[i] = sc.nextInt();

		}

		//int no[]={4,2,1,5};//equal both are even and odd same.
		

		int even = 0;
		int odd = 0;
		for (int i = 0; i < no.length; i++) {
			int j = no[i];
			if (j % 2 == 0) {
				even = even + j;//Addition of even numbers.
			} else {
				odd = odd + j;//Addition of odd numbers.
			}
		}
		if (even == odd) {//Addition if even and odd numbers are similar....then o/p show 1 otherwise -1...6,3,3,0 = 1 o/p
			System.out.println("1");
		} else {
			System.out.println("-1");
		}

	}

}
