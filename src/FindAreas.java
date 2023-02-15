class Figure {
	double dim1, dim2;

	Figure(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	void area() {
		System.out.println("Area for Figure is undefined.");
	}
}

class Rectangle extends Figure {
	Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	void area() {
		System.out.println("Inside Area for Rectangle.");
		System.out.println("Area is " + dim1 * dim2 + "\n");
	}
}

class Triangle extends Figure {
	Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}

	void area() {
		System.out.println("Inside Area for Triangle.");
		System.out.println("Area is " + dim1 * dim2 / 2 + "\n");
	}
}

class FindAreas {
	public static void main(String args[]) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figref;

		figref = r;
		figref.area();

		figref = t;
		figref.area();

		figref = f;
		figref.area();
	}
}
