class Box6 {
    double width;
    double height;
    double depth;

    Box6() {
        System.out.println("Constructing Box");
        width = 10;
        height = 20;
        depth = 15;
    }

    double vol() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String args[]) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        System.out.println("Volume of box1 is " + mybox1.vol());
        System.out.println("Volume of box2 is " + mybox2.vol());
    }
}
