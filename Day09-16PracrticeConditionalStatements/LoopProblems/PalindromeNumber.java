import java.util.Scanner;
public class PalindromeNumber {
    public static  void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();
            int reverse = 0;
            int initial = n;

            while(n != 0){
                int lastdigit = n % 10;
                reverse = reverse * 10 + lastdigit;
                n /= 10;

            }

            if (initial == reverse){
                System.out.println("Palindrome Number");
            }
            else{
                System.out.println("Not Palindrome Number");
            }

        }


    }
    
}
