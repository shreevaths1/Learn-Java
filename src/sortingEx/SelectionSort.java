package sortingEx;

class SelectionSort {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		int array[] = { 7, 8, 5, 6, 1 };

		System.out.println("Selection Sort");
		System.out.println("Unsorted array:");
		printArray(array);

		// Time Complexity: O(N^2)
		// Selection Sort
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[smallest] > array[j]) {
					smallest = j;
				}
			}
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}

		System.out.println();
		System.out.println("Sorted array:");
		printArray(array);
	}
}
