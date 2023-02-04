public class Conversion {
    public static void main(String args[]) {
        byte b;
        int i = 257;
        double d = 323.142;

        b = (byte) i;// 257 modulo 256 (range of byte)
        System.out.println("Conversion of int to byte");
        System.out.println("i and b " + i + " " + b);

        i = (int) d;// 324.142 to 324 truncated
        System.out.println("Conversion of double to int");
        System.out.println("d and i " + d + " " + i);

        b = (byte) d;// 324.142 to 324 and then 324 modulo 256 (range of byte)
        System.out.println("Conversion of double to byte");
        System.out.println("d and b " + d + " " + b);
    }
}
