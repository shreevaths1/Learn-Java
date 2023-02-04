public class HexByte {
    public static void main(String args[]) {
        // converts byte value to its hexadecimal string representation.
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        byte b = (byte) 0xf1;
        System.out.println(b);
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        /*
         * shifted value is masked by ANDing it with 0x0f to ignore sign extended bits
         * so that it can be used as an index into the hex[] array.
         */
    }
}
