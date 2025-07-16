import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        int input = scanner.nextInt();
        if (input< 0){
            System.out.println("The number is Negative");

        }

        else if (input > 0){
            System.out.println("The Number is Positve");
        
        }

        else{
            System.out.println("The Number is Zero");
        }
        }
    }
}
