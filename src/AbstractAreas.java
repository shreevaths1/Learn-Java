abstract class Figure1 {
	double dim1, dim2;

	Figure1(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	abstract void area();
}

class Rectangle1 extends Figure1 {
	Rectangle1(double dim1,double dim2){
		super(dim1, dim2);
	}

	void area() {
		System.out.println("Inside Rectangle's area:");
		System.out.println("Area is " + (dim1 * dim2) + "\n");
	}
}

class Triangle1 extends Figure1 {
	Triangle1(double dim1, double dim2) {
		super(dim1, dim2);
	}

	void area() {
		System.out.println("Inside Triangle's area:");
		System.out.println("Area is " + (dim1 * dim2 / 2) + "\n");
	}
}

class AbstractAreas {
	public static void main(String args[]) {
		// Figure1 f = new Figure1(10,10);
		Rectangle1 r = new Rectangle1(9, 5);
		Triangle1 t = new Triangle1(10, 8);
		Figure1 figref;

		figref = r;
		figref.area();

		figref = t;
		figref.area();
	}
}
