public class ShortCircuitLogic {
    public static void main(String args[]) {
        boolean a = true, b = false;
        boolean c1 = a | b; // will evaluate right hand operand
        boolean c2 = b | a; // will evaluate right hand operand
        boolean c3 = b || a; // will evaluate right hand operand
        boolean c4 = a || b; // this won't right hand operand

        boolean d1 = a & b; // will evaluate right hand operand
        boolean d2 = b & a; // will evaluate right hand operand
        boolean d3 = a && b; // will evaluate right hand operand
        boolean d4 = b && a; // this won't evaluate right hand operand

        System.out.println("         a = " + a);
        System.out.println("         b = " + b);
        System.out.println("     a | b = " + c1);
        System.out.println("     b | a = " + c2);
        System.out.println("    b || a = " + c3);
        System.out.println("    a || b = " + c4);

        System.out.println("     a & b = " + d1);
        System.out.println("     b & a = " + d2);
        System.out.println("    a && b = " + d3);
        System.out.println("    b && a = " + d4);
    }
}
