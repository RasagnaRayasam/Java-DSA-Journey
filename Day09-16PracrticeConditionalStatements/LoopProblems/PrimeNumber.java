import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            int n = input.nextInt();
            int flag = 0;

            for (int i=2;i<n;i++){
                if (n%i== 0){
                    flag = 1;
                    break;
                }



            }

            if (flag == 1){
                System.out.println(n + " is not a Prime number");
            }

            else{
                System.out.println(n + " is a prime number");
            }

        }
        


    }
    
}
