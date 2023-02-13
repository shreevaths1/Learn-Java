class Box7 {
    double width;
    double height;
    double depth;

    /*
     * The below constructor uses 'this' keyword
     * to avoid name collisions b/w local variables and instance
     * variables and to avoid hiding of instance variables by
     * same-named local variables.
     */
    Box7(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /*
     * Box7(double w, double h, double d) {
     * System.out.println("Constructing Box");
     * width = w;
     * height = h;
     * depth = d;
     *
     * }
     */

    double vol() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String args[]) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        System.out.println("Volume of box1 is " + mybox1.vol());
        System.out.println("Volume of box2 is " + mybox2.vol());
    }
}
