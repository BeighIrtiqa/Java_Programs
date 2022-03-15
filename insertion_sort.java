//WAP to sort an array using insertion sort algorithm
import java.util.Scanner;

//WAP to sort an array using insertion sort algorithm
public class insertion_sort {
	//	method to print an array
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:    ");
		int size = sc.nextInt();
		int[] arr = new int[size];
//		input array elements
		for(int i = 0 ; i < size ; i++) {
			System.out.print("Enter Element "+ (i+1)+" :       ");
			arr[i] = sc.nextInt();
		}
//		print unsorted array
		System.out.println("Unsorted array is :       ");
		printArray(arr);
		
//		insertion sort looping logic
		for(int i=1; i< arr.length;i++) {
			int current = arr[i];
			int j = i-1;
			//sorting of left part
			while(j>= 0 && current < arr[j]) {
				arr[j+1]  = arr[j];
				j--;
			}
			//placement of hole created
			arr[j+1] = current;
		}
		System.out.println("\nsorted array:    ");
		printArray(arr);
	}

}
