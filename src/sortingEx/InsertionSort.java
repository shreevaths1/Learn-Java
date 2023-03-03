package sortingEx;

class InsertionSort {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		int array[] = { 7, 8, 5, 6, 1 };

		System.out.println("Insertion Sort");
		System.out.println("Unsorted array:");
		printArray(array);

		// Time Complexity: O(N^2)
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}

		System.out.println();
		System.out.println("Sorted array:");
		printArray(array);
	}
}
