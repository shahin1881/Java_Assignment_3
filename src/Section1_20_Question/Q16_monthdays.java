package Section1_20_Question;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;


//Question:  no of days in a month in specific year


public class Q16_monthdays {
	
	public static void main(String[] args) {
		
		
		/*YearMonth n = YearMonth.of(2019,11);
		System.out.println(n.lengthOfMonth());
		*/
		
		
		/* // Create a month instance 
         Month month = Month.FEBRUARY; 
  
        // Print the length of this Month 
        System.out.println(month.length(true)); 
		*/
		
		
			int month;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
			month = sc.nextInt();	
			
			switch(month)
			{
			  	case 1:
			  	case 3:
				case 5: 	
				case 7:
				case 8:
				case 10:
				case 12:			  	
					System.out.println("\n 31 Days in this Month");
				  	break;
				
				case 4:	
				case 6:
				case 9:
				case 11:			    	
					System.out.println("\n 30 Days in this Month");  
					break;
				
				case 2:
					System.out.println("\n Either 28 or 29 Days in this Month"); 
					break;
				
				default:		  	
					System.out.println("\n Please enter Valid Number between 1 to 12");
			  }
		}
	
}
	









/*Scanner sc = new Scanner(System.in);

int number_Of_DaysInMonth = 0; 
String MonthOfName = "12";

System.out.print("Input a month number: ");
int month = sc.nextInt();

System.out.print("Input a year: ");
int year = sc.nextInt();

switch (month) {
    case 1:
        MonthOfName = "January";
        number_Of_DaysInMonth = 31;
        break;
    case 2:
        MonthOfName = "February";
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            number_Of_DaysInMonth = 29;
        } else {
            number_Of_DaysInMonth = 28;
        }
        break;
    case 3:
        MonthOfName = "March";
        number_Of_DaysInMonth = 31;
        break;
    case 4:
        MonthOfName = "April";
        number_Of_DaysInMonth = 30;
        break;
    case 5:
        MonthOfName = "May";
        number_Of_DaysInMonth = 31;
        break;
    case 6:
        MonthOfName = "June";
        number_Of_DaysInMonth = 30;
        break;
    case 7:
        MonthOfName = "July";
        number_Of_DaysInMonth = 31;
        break;
    case 8:
        MonthOfName = "August";
        number_Of_DaysInMonth = 31;
        break;
    case 9:
        MonthOfName = "September";
        number_Of_DaysInMonth = 30;
        break;
    case 10:
        MonthOfName = "October";
        number_Of_DaysInMonth = 31;
        break;
    case 11:
        MonthOfName = "November";
        number_Of_DaysInMonth = 30;
        break;
    case 12:
        MonthOfName = "December";
        number_Of_DaysInMonth = 31;
}
System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
}
}




*/