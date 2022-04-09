//simple date format class in java provides methods to format date and time in java. 
//it is also used in parsing
//Create a simpleDateFormat object by passing the date pattern
//then pass the date string to SimpleDateFormat parse method
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class convert_StringToDate {

	public static void main(String[] args) throws ParseException{
		// conversion Input String field to Date
		Scanner sc = new Scanner(System.in);
		//enter date patterns 
		System.out.print("Enter date Pattern:  ");
		String pattern = sc.next();
		System.out.print("Enter Date:  ");
		String dt = sc.next();
		System.out.print("Input date:  "+dt+"     ");
		switch(pattern) {
		case "dd/MM/yyyy":
			SimpleDateFormat input1 = new SimpleDateFormat(pattern);
			Date date1 = input1.parse(dt);
			System.out.println("Converted Date : "+date1);
			break;
		case "dd-MM-yyyy":
            SimpleDateFormat input2 = new SimpleDateFormat(pattern);
            Date date2 = input2.parse(dt);
            System.out.println("Converted Date : "+date2);
			break;
		case "MM dd,yyyy":
            SimpleDateFormat input3 = new SimpleDateFormat(pattern);
            Date date3 = input3.parse(dt);
            System.out.println("Converted Date : "+date3);
			break;
		case "E,MMM dd yyyy":
            SimpleDateFormat input4 = new SimpleDateFormat(pattern);
            Date date4 = input4.parse(dt);
            System.out.println("Converted Date : "+date4);
			break;
		case "E, MMM dd yyyy HH:mm:ss":
            SimpleDateFormat input5 = new SimpleDateFormat(pattern);
            Date date5 = input5.parse(dt);
            System.out.println("Converted Date : "+date5);
			break;
		case "dd-MM-yyyy HH:mm:ss":
            SimpleDateFormat input6 = new SimpleDateFormat(pattern);
            Date date6 = input6.parse(dt);
            System.out.println("Converted Date : "+date6);
			break;
		default:
            System.out.println("Invalid Input");
		}
		
	sc.close();
	}

}

