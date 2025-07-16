import java.util.Scanner;
public class GreatestOfThreeNumbers {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int n3 = input.nextInt();

            if (n1 > n2 && n1 > n3) {
                System.out.println(n1 + " is greatest.");

            }

            else if (n2 > n1 && n2 > n3){
                System.out.println(n2 + " is the greatest.");
            }

            else{
                System.out.println(n3 + " is the greatest");
            }



        }
        


    }
    
}
