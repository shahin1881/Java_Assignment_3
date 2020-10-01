package Section1_20_Question;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


/*	Question: What will be the DAY of current date in next year*/

public class Q10_CurrentDateinNextyear {
	
	public static void main(String[] args) throws ParseException {

		
		
		/*Scanner sc = new Scanner(System.in);
		 System.out.println("enter date in dd/MM/yyyy");
		 String n = sc.next();
		*/
		
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = (c.get(Calendar.MONTH))+1;
		int year = c.get(Calendar.YEAR)+1;
		
		String n = day+"/"+month+"/"+year;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(n);
		System.out.println(sdf.format(d));
		
		sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(d));
						  
		  }

}
