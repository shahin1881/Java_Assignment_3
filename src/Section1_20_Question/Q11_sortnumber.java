package Section1_20_Question;
import java.util.Scanner;


/*		Question:  Get all the numbers alone from the string and return the sum.
                   Input"123gif"
				   Output:6*/



public class Q11_sortnumber {
	
	public static void main(String[] args) {

        /*Scanner se =new Scanner(System.in);
		System.out.print("Enter String");
        String s = se.next();*/
        
		    String s = "123gif";		
			int ans = 0 ;// ans value is 0
				for(int i=0;i<s.length();i++)//for loop using geting lenght s 
				{
					if(Character.isDigit(s.charAt(i)))//condition...string collect from char
					{
						ans = ans + Character.getNumericValue(s.charAt(i));//get only numeric value and addtion
					}
				}System.out.println(ans);// final output
				
				
		
	}

}
