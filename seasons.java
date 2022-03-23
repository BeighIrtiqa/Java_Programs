//WAP to print season name corresponding to it's month number
//1. using if-else
//2. using switch statements
import java.util.Scanner;
public class seasons {

	public static void main(String[] args) {
		System.out.println("Month Names And Their Month Numbers");
		System.out.println("1 = January 2 = February  3 = March  4 = April  5 = May 6 = June 7 = July  8 = August  9 = September 10 = October 11 = November 12 = December");
		
//		check for month
		System.out.print("Enter the Month Number:    ");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
//		check for attribute
		System.out.println("For Season - Type \"season\"       For Climate -  Type \"climate\"");
		String str = sc.next();
		
		switch(str) {
		case "season":
//			Using if-else for seasons
			if(month >=1 && month <=12) {
				if(month == 12 || month == 1) {
					System.out.println("This is Winter Season");
				}
				else if(month == 2 || month == 3) {
					System.out.println("This is Spring Season");
				}
				else if(month == 4 || month == 5 || month == 6) {
					System.out.println("This is Summer Season");
				}
				else if(month == 7 || month == 8 || month == 9) {
					System.out.println("This is Monsoon Season");
				}
				else {
					System.out.println("This is Autumn Season");
				}
				
			}
			else {
				System.out.println("You have entered an Invalid month number......");
				System.out.println("There are only 12 months in a year.....");
			}

				break;
		case "climate":
//			Using Switch statement for climate
			switch(month)
			{
			case 1: 
				System.out.println("The Climate is very cold");
				break;
			case 2: 
				System.out.println("The Climate is very cool");
				break;
			case 3: 
				System.out.println("The Climate is sunny and pleasant");
				break;
			case 4: 
				System.out.println("The Climate is Hot");
				break;
			case 5: 
				System.out.println("The Climate is very Hot");
				break;
			case 6: 
				System.out.println("The Climate is extremely Hot");
				break;
			case 7: 
				System.out.println("The Climate is Hot and Humid");
				break;
			case 8: 
				System.out.println("The Climate is Wet, Hot and Humid");
				break;
			case 9: 
				System.out.println("The Climate is very Wet, Hot and Humid");
				break;
			case 10: 
				System.out.println("The Climate is very pleasant");
				break;
			case 11: 
				System.out.println("The Climate is pleasant");
				break;
			case 12: 
				System.out.println("The Climate is pleasant and cool");
				break;
			default:
				System.out.println("Invalid Month Number.....");
			}

			break;
		default:
			System.out.println("You have entered an Invalid Attribute......");
		}
		
		sc.close();
		
	}

}
