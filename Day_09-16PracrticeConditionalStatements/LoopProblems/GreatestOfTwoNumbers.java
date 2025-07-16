import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int n1 = input.nextInt();
            int n2 = input.nextInt();

            if (n1>n2){
                System.out.println(n1 + " is greater than " + n2);

            }

            else if (n2>n1){
                System.out.println(n2 + " is greater than " + n1);
            }

            else{
                System.out.println(n1 + " and " + n2 + " are equal.");
            }
            


        }

    }

    
}
