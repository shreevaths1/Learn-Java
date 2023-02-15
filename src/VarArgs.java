class VarArgs {

	public static void main(String args[]) {
		VarArgsTest.vaTest(1, 3, 5, 7); // implicitly creates an array called v of type int[];
		VarArgsTest.vaTest();
	}
}

class VarArgsTest{
	static void vaTest(int... v) {
		System.out.println("No. of elements: " + v.length);
		System.out.print("Contents: ");
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
	}
}