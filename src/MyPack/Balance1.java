package MyPack;

public class Balance1 {
	String name;
	double bal;

	public Balance1(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}

	public void show() {
		if (bal < 0) {
			System.out.print(name + " --> ");
			System.out.println(": $ " + bal);
		}
	}
}