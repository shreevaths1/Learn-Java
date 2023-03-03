package arraysEx;

import java.util.Scanner;

class Arrays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int[] numbers = new int[size];

		// input
		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}

		// output
		System.out.println("Arrays elements displayed:");
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.print("Enter what element to search for: ");
		int x=sc.nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==x) {
				System.out.println("x found at index "+i);
			}
		}
	}
}
