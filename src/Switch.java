import java.util.Scanner;

/*This program has a downside:
 * if input is less than 1 or
 * greater than 12, then you get
 * ArrayIndexOutOfBounds Exception.
 *
 * Try to improve upon this.
 */

public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month by number: ");
        

        int month = sc.nextInt();
        sc.close();
        String season;

        String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus Month";
                break;
        }
        System.out.println(months[month - 1] + " is in the " + season + " .");
    }
}
