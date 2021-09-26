import java.util.Scanner;

public class SchaltjahrBerechnen {
    public static void main(String[] args) {
        int year = 0;
        int remainderFour = 0;
        int remainderFourhundred = 0;
        int remainderHundred = 0;

        // ask and scan for year
        System.out.print("Please enter a year: ");
        Scanner getYear = new Scanner(System.in);
        year = getYear.nextInt();


        // divide year by 4, 400 & 100
        remainderFour = year % 4;
        remainderFourhundred = year % 400;
        remainderHundred = year % 100;

        // check if the year is a leap year or not
        if (remainderFour == 0){
            System.out.println(year + " appears to be a leap year.");
            System.out.print("Do you want us to double-check? [1 to continue] ");
            Scanner askToContinue = new Scanner(System.in);
            int doubleCheck = askToContinue.nextInt();

            if (doubleCheck == 1 && remainderFourhundred != 0 && remainderHundred == 0){
                System.out.println(year + " is not a leap year.");
            }
            else if (doubleCheck != 1){
                System.out.println("Okay, then it shall remain a mystery.");
            }
            else{
                System.out.println(year + " really is a leap year.");
            }
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
