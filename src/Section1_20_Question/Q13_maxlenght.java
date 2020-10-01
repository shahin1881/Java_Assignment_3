package Section1_20_Question;
import java.util.Scanner;

public class Q13_maxlenght {
	public static void main(String[] args) {
		
/*	Question:	Take the word with a max length in the given sentance in that check for vowels 
                if so count the no.of occurances !
                Input 1="Bhavane is a good girl"
                Output =3
                
                Input 1="Bhavanee is a good girl"
                Output =4
*/
		
		
		Scanner se= new Scanner (System.in);
		System.out.println("Enter string= ");
		 String s=se.next();
		
		
	  //String s = "Bhavane is a good girl";
		String n[] = s.split(" ");
		int no = 0;
		int nj = 0 ;
		for(int i=0;i<n.length;i++)//for Split lenght using for 
		{
			String j = n[i];//Store value in j String
			if(no<j.length())//if condition compairing String
			{
				no = j.length();
				for(int l=0;l<j.length();l++)//ovel check in String
				{
					if((j.charAt(l)=='a')||(j.charAt(l)=='e')||(j.charAt(l)=='i'||(j.charAt(l)=='o'|| (j.charAt(l)=='u'))))
					{
						nj++;//incriment + Stoar value 
					}
				}
			}
		}System.out.println(nj);//final output
		
		

		
		
	}

}
