package Section1_20_Question;
import java.util.Scanner;

public class Q7_arrylist {

	public static void main(String[] args) {
		/*
		 * Question:   arraylist1={ 1,2,3,4,5}
                       arraylist2={ 6,7,8,9,10}
                       size of both list should be same 
                       output={6,2,8,4,10} */
		int[] a = new int[5];
		System.out.println("Enter here 1= ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		
		int[] b = new int[5];
		System.out.println("Enter here 2= ");
		for (int i = 0; i < b.length; i++) {

			b[i] = sc.nextInt();//1,2,3,4,5

		}

		// int a[]={1,2,3,4,5};
		//int b[] = { 6, 7, 8, 9, 10 };

		int c[] = new int[a.length + b.length];// Merge new Array in one Array
		int index = 0;
		int k;

		for (int i = 0; i < a.length; i++)// for loop new s.lenght
			
		{
			  //if (i % 2 == 0)     // condition i divided 2.....even 
		    if	(i % 2 != 0) //i doesn't divided by 2.....odd
			{
				c[index] = b[i];// get odd value only
				index++;
			} else {
				c[index] = a[i];// get even value only
				index++;
			}
		}
		for (int i = 0; i < index; i++)// geting odd and even value
		{
			System.out.println(c[i] + " ");// concat or merge + final output
		}

	}

}
