class Box4 {
    double width;
    double height;
    double depth;

    double vol() {
        return width * height * depth;
    }
}

public class BoxDemo4 {
    public static void main(String args[]) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        System.out.println("Volume of box1 is " + mybox1.vol());
        System.out.println("Volume of box2 is " + mybox2.vol());
    }
}
