class Box9 {
    double width;
    double height;
    double depth;

    Box9() {
        System.out.println("No Parameters.");
        width = height = depth = -1;
    }

    Box9(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box9(double l) {
        width = height = depth = l;
    }

    Box9(Box9 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double vol() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String args[]) {
        Box9 mybox1 = new Box9();
        Box9 mybox2 = new Box9(10, 20, 15);
        Box9 mycube = new Box9(2);
        Box9 myclone = new Box9(mybox2);

        System.out.println("Volume of mybox1 is " + mybox1.vol());
        System.out.println("Volume of mybox2 is " + mybox2.vol());
        System.out.println("Volume of mycube is " + mycube.vol());
        System.out.println("Volume of myclone is " + myclone.vol());
    }
}
