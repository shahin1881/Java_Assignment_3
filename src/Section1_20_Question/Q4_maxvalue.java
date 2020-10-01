package Section1_20_Question;

import java.util.Scanner;

public class Q4_maxvalue {

	public static void main(String[] args) {
		/*QUESTION: int[] a={12,14,2,26,35}
		            find the difference b/w max and min values in array
		            output:35-2=33.
		*/
		
		int[] a = new int[5];
		System.out.println("Enter here= ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		
	//	int a[]={12,14,2,26,35};
				int min = 0,max = 0 ;
				
				for(int i=0;i<a.length;i++)
				{
					int no = a[i];//12,14,2,26,35
					if(no>max)//max value are 0 so alws true
					{
						max = no;//max value hear...12,14,26,35
					}
					else 
					{
						min = no;//condition in case fail then min value..2
					}
				}System.out.print(max+"-"+min+"=");//get value max-min..35-2=33
				System.out.print((max-min));//35-2=33....33
				
				
	}
}
