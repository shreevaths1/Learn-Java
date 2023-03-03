package sortingEx;

class BubbleSort {

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		int array[] = { 7, 8, 5, 6, 1 };
		int temp;
		
		System.out.println("Bubble Sort");
		System.out.println("Unsorted array:");
		printArray(array);

		// time complexity = O(N^2)
		// Bubble Sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("Sorted array:");
		printArray(array);

	}
}