//write a program to find out whether an number is in an array or not
import java.util.Scanner;
public class search_float_array {

	public static void main(String[] args) {
		// create an float array of 5 and calculate its sum
		float arr[]= {45.7f,67.8f,63.4f,99.2f,100.0f};
		float sum=0;
		
		for(float element:arr) {
			sum = sum+element;
			
			 
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+sum/arr.length);
		
		
		System.out.println("Enter the number to be checked");
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat() ;
		boolean isInArray = false;
		for(float element:arr)
		{
			if(element==num) {
				isInArray = true;
				break;
			}
				
		}
		if(isInArray) {
			System.out.println("The value is in Array");
		}
		else {
			System.out.println("the value is not in array");
		}
		sc.close();
	}

}
