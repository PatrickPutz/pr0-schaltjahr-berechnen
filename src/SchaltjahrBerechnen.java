import java.util.Scanner;

public class SchaltjahrBerechnen {
    public static void main(String[] args) {
        int year = 0;

        // ask and scan for year
        System.out.print("Please enter a year: ");
        Scanner getYear = new Scanner(System.in);
        year = getYear.nextInt();

        // test
        System.out.println("Selected year: " + year);
    }
}
