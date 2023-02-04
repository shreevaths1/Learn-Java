public class LifeTime {
    public static void main(String args[]) {
        for (int x = 0; x < 3; x++) {
            // y is reinitialized to -2 each time it enters this for block
            int y = -2; // Life time of y begins
            System.out.println("y is: " + y);
            y = -100;
            System.out.println("y is now: " + y);
        }
        // Life time of y is terminated
    }

}
