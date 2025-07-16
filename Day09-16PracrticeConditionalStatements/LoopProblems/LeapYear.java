import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args) {
        try(Scanner input = new Scanner(System.in)){
        int n = input.nextInt();

        if (n%400 == 0 || (n%4 == 0 && n%100 != 0)){
            System.out.println(n + " is a leap year.");
        }

        else {
            System.out.println(n + " is not a leap year");
        }
        }
    


    }
    
}
