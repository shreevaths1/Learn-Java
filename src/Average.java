class Average {
    public static void main(String args[]) {
        double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0;

        for (double num : nums) {
            result = result + num;
        }
        System.out.println("Average is " + (float)(result / 5));
    }
}