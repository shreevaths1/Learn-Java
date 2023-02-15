class Box10 {
	double width;
	double height;
	double depth;

	Box10() {
		width = height = depth = -1;
	}

	Box10(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box10(double len) {
		width = height = depth = len;
	}

	Box10(Box10 ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}

	double vol() {
		return width * height * depth;
	}
}

class BoxWeight1 extends Box10 {
	double weight;

	BoxWeight1(double width, double height, double depth, double weight) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.weight = weight;
	}
}

class DemoBoxWeight {
	public static void main(String args[]) {
		BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
		BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
		// BoxWeight1 mybox3 = new BoxWeight1(12); constructors of superclass are
		// unknown to BoxWeight1

		System.out.println("Volume of mybox1 is " + mybox1.vol());
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();

		System.out.println("Volume of mybox2 is " + mybox2.vol());
		System.out.println("Weight of mybox2 is " + mybox2.weight);
	}
}