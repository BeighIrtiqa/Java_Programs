
//WAP to iteratively calculate factorial of a number
//Factorial of  5 = 5 x 4 x 3 x 2 x 1 =120
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1, temp;
		System.out.println("Enter any random integer");
		int num = sc.nextInt();
		if(num == 0 || num== 1)
		{
			System.out.println("Factorial of "+ num +" =  1");
		}
		else
		{
			temp = num;
			while(num >= 1){
				fact = fact * num;
				num--;
			 }
			System.out.println("Factorial of "+ temp +" = "+fact);
			}
			sc.close();
		}
	}


