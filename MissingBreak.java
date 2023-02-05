public class MissingBreak {
    public static void main(String args[]) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("i is less than 6.");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("i is less than 11.");
                    break;
                case 11:
                    System.out.println("i is equal to 11 now.");
                    break;
                default:
                    System.out.println("i is greater than or equal to 12.");
            }
        }
    }
}
