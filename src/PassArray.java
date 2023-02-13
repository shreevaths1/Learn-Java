class PassArray {
	static void vaTest(int v[]) {
		System.out.println("No. of elements: " + v.length);
		System.out.print("Contents: ");
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
	}

	public static void main(String args[]) {
		int n1[] = { 1, 3, 5, 7 }; // explicitly creating an array
		int n2[] = {};

		vaTest(n1); // and then passing the array into method
		vaTest(n2);
	}
}