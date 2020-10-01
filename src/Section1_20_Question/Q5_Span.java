package Section1_20_Question;

import java.util.Scanner;

public class Q5_Span {

	public static void main(String[] args) {
		/*
		 * QUESTION: Given an array find the largest 'span'(span is the number of elements between two 
                     same digits) find their sum.
                     a[]={1,4,2,1,4,1,5}                               //a[]={2,4,2,1,2,4,1,6}it is start index to end index same value its called span
                     Largest span=5
		 */

		int[] a = new int[7];
		System.out.println("Enter here= ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}

		// int a[] = { 1, 4, 2, 1, 4, 1, 5 };
		int max = 0, p = 0;
		for (int i = 0; i < a.length; i++)// first loop for "a"
		{
			int no1 = a[i]; // 1,
			for (int j = i + 1; j < a.length; j++)// second loop for "a"
			{
				int no2 = a[j]; // 4,2,1,4,1,5...2,1,4,1,5

				if (no1 == no2)// compairing two value
				{
					int x = i;//stored for index value stored
					int y = j;
					p = y - x;// subtract big-low
				}
			}
			if (p > max)// condition value is less than max
			{
				max = p;// storing value in max in 5
			}
		}
		System.out.println(max);// final output

	}

}
