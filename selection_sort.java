//Sorting an array using Selection sort technique
import java.util.Scanner;
public class selection_sort {
//	method to print an array
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
//main block
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array:    ");
	int size = sc.nextInt();
	int[] arr = new int[size];
//	input array elements
	for(int i = 0 ; i < size ; i++) {
		System.out.print("Enter Element "+ (i+1)+" :       ");
		arr[i] = sc.nextInt();
	}
//	print unsorted array
	System.out.println("Unsorted array is :       ");
	printArray(arr);
	
//	selection sort looping logic
	
	for(int i=0; i< arr.length-1;i++){    
		int smallest = i;
		for(int j= i+1 ; j< arr.length; j++){  
			if(arr[smallest] > arr[j]){
					smallest = j;
				}
		}
//			swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	System.out.println("\nSorted array:   ");
	printArray(arr);
	sc.close();
	}
}

