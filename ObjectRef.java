public class ObjectRef {
    public static void main(String args[]) {
        Box b1 = new Box();
        Box b2;
        b2 = b1; /*
                  * Assigning b1 to b2 does
                  * not create and allocate 2 distinct objects.
                  * Rather 2 distinct references are created
                  * pointing to the same object of type Box
                  */

        b2.width = 10;
        b2.height = 20;
        b2.depth = 15;

        System.out.println(b1.width);
        System.out.println(b1.height);
        System.out.println(b1.depth);
        System.out.println();

        b1.width += 1;
        b1.height += 2;
        b1.depth -= 3;

        System.out.println(b2.width);
        System.out.println(b2.height);
        System.out.println(b2.depth);
        System.out.println();

        b1 = null;
        /*
         * Creates a NullPointerException
         * System.out.println(b1.width);
         * System.out.println(b1.height);
         * System.out.println(b1.depth);
         */

    }
}
