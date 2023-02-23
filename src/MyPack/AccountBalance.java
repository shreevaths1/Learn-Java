/*Creating array of object*/
package MyPack;

class Balance {
	String name;
	double bal;

	Balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}

	void show() {
		if (bal < 0) {
			System.out.print("--> ");
			System.out.println(name + " : $" + bal);
		}
	}
}

class AccountBalance {
	public static void main(String args[]) {
		Balance current[] = new Balance[3];
		current[0] = new Balance("Ram", 200);
		current[1] = new Balance("Shree", 350);
		current[2] = new Balance("Sruthi", -900);

		for (int i = 0; i < 3; i++) {
			current[i].show();
		}
	}
}
