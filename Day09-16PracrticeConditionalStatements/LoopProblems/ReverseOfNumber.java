import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();

            while(n != 0){
                int lastdigit = n%10;
                System.out.print(lastdigit);
                n /= 10;


            }


        }

    }
    
}
