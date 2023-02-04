public class IntLiteral {
    public static void main(String args[]) {

        for (int c = 0xa; c < 16; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println(123); // base 10 integer
        System.out.println(07); // base 8 integer - octals
        System.out.println(0x7ffff); // base 16 integer - hexadecimals

        /*
         * long p = 254809349823498239;
         * System.out.println(p);
         */
        long p = 254809349823498239l; // long integer is denoted by suffixing with 'l' or 'L'
        System.out.println(p);

        int x = 0b1010; // binary representation for '10'
        System.out.println(x);

        int y = 123_456_789; // the underscores will be ignored, the value given to x is 123,456,789 by
                             // compiler
        y = 123__456__789; // this is also valid
        System.out.println(y);

    }
}