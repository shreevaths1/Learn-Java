class Box5 {
    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double vol() {
        return width * height * depth;
    }
}

public class BoxDemo5 {
    public static void main(String args[]) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        System.out.println("Volume of box1 is " + mybox1.vol());
        System.out.println("Volume of box2 is " + mybox2.vol());
    }
}
