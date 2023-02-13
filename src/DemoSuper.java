class Box11 {
	private double width;
	private double height;
	private double depth;

	Box11() {
		width = height = depth = -1;
	}

	Box11(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box11(double len) {
		width = height = depth = len;
	}

	Box11(Box11 ob) {
		this.width = ob.width;
		this.height = ob.height;
		this.depth = ob.depth;
	}

	double vol() {
		return width * height * depth;
	}

}

class BoxWeight2 extends Box11 {
	double weight;

	BoxWeight2() {
		super();
		weight = -1;
	}

	BoxWeight2(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	BoxWeight2(double len, double weight) {
		super(len);
		this.weight = weight;
	}

	BoxWeight2(BoxWeight2 ob) {
		super(ob);
		this.weight = ob.weight;
	}

}

class DemoSuper {
	public static void main(String args[]) {
		BoxWeight2 mybox1 = new BoxWeight2();
		BoxWeight2 mybox2 = new BoxWeight2(10,20,15,34.3);
		BoxWeight2 mybox3 = new BoxWeight2(2,3,4,0.076);
		BoxWeight2 mycube = new BoxWeight2(3,2);
		BoxWeight2 myclone = new BoxWeight2(mybox2);
		
		System.out.println("Volume of mybox1 is "+mybox1.vol());
		System.out.println("Weight of mybox1 is "+mybox1.weight);
		System.out.println();
		
		System.out.println("Volume of mybox2 is "+mybox2.vol());
		System.out.println("Weight of mybox2 is "+mybox2.weight);
		System.out.println();
		
		System.out.println("Volume of mybox3 is "+mybox3.vol());
		System.out.println("Weight of mybox3 is "+mybox3.weight);
		System.out.println();
		
		System.out.println("Volume of mycube is "+mycube.vol());
		System.out.println("Weight of mycube is "+mycube.weight);
		System.out.println();
		
		System.out.println("Volume of myclone is "+myclone.vol());
		System.out.println("Weight of myclone is "+myclone.weight);
		System.out.println();
	}
}