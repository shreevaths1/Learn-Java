public class MultByTwo {
    public static void main(String args[]) {
        int i, num = 0XFFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num); // if you shift a 1 bit into high order position the value will become negative.
        }
    }
}
