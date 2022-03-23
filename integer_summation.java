//WAP to receive two integers from keyboard, does their summation and display the result.
//ensure that only integer values are processed
import java.util.Scanner;
public class integer_summation {

	public static void main(String[] args) {
		int num,limit,sum=0;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter total numbers to be summed");
		limit = sc.nextInt();
		System.out.println("Enter "+limit+" Numbers:  ");
		for(int i=0;i<limit;i++)
		{
			if( sc.hasNextInt())
			{
				
				num = sc.nextInt();
				sum= sum+num;
			}	
			else
			{
				System.out.println("Invalid Input");
				System.out.println("Please enter Integer Only.....");
				//System.exit(0);
				break;
			}
		}	
		System.out.println("Sum of "+limit+ "numbers is   "+sum);
		sc.close();
	}

}
