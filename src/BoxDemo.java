/*You can also put Box and BoxDemo classes
 * in seperate java files Box.java and
 * BoxDemo.java. They need not be in the
 * same source file.
 */
class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo {
    public static void main(String args[]) {
        Box mybox = new Box();
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        double vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}