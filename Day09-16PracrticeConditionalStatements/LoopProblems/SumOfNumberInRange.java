import java.util.Scanner;
public class SumOfNumberInRange {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int total = 0;
            for (int i = n1; i <= n2;i++){
                total += i;
                
            }

            System.out.println(total);


        }
        


    }

    
}
