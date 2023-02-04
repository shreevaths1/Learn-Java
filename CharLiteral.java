public class CharLiteral {
    public static void main(String args[]) {
        System.out.println('\u0061'); // ISO-Latin repr. for 'a'
        System.out.println('\ua432'); // hexadecimal repr. for japanese katakana character
        System.out.println('\''); // single quotes
        System.out.println('\"'); // double quotes
        System.out.println('\n'); // newline or linefeed
        System.out.println("Hello" + '\t' + "There"); // tab
        System.out.println("Hello" + '\b' + "There"); // backspace
        System.out.println("Hello" + '\f' + "There"); // form feed
        System.out.println("Hello" + '\r' + "There"); // carriage return
    }
}
