class Box8 {
    double width, height, depth;

    Box8() {
        width = height = depth = -1;
    }

    Box8(double a) {
        width = height = depth = a;
    }

    Box8(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double vol() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String args[]) {
        Box8 mybox1 = new Box8();
        Box8 mycube = new Box8(7);
        Box8 mybox2 = new Box8(10, 20, 15);

        System.out.println("Volume of mybox1 is " + mybox1.vol());
        System.out.println("Volume of mybox2 is "+mybox2.vol());
        System.out.println("Volume of mycube is "+mycube.vol());

    }

}
