
//WAP to sort an integer array (using bubble sort) and using for loop
import java.util.Scanner;
public class bubble_sort {

//	print array method
	public static void printArray(int arr[]) {
		for(int i = 0 ; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("\n");
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		input array size
		System.out.print("Enter the size of your Array:    ");
		int size = s.nextInt();
		
//		declare an array
		int[] arr = new int[size];

//		input array elements from user
		for(int i=0;i<size;i++) {
			System.out.print("Enter Element " + (i+1) + " :    ");
			arr[i] = s.nextInt();
		}
		
	
//		print unsorted array
		System.out.println("Unsorted Input Array");
		printArray(arr);
		
		
//		bubble sort
		System.out.println("WithIn bubble sort");
		for(int i = 0; i< (arr.length-1);i++) {            // length-1 because array out of bound
			for(int j = 0 ; j< (arr.length-i-1); j++) {    //length-i-1 because we will not check the last elements as they are sorted
				if(arr[j] > arr[j+1]) {
//					swap them
					int temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
//				print passes
				System.out.println("    PASS  " + (j+1));
				printArray(arr);
			}
		}
//		print sorted array
		System.out.println("Sorted Output Array");
		printArray(arr);
			
	}

}
