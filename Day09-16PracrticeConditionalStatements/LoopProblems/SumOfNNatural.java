import java.util.Scanner;
public class SumOfNNatural {
    public static void main(String[] args) { 
    
        try (Scanner input = new Scanner(System.in)) 
        {
        
        int n = input.nextInt();
        int total = 0;

        for (int i=0;i<=n;i++) {
            total += i;

        }

        System.out.println(total);

        }
        

    }
    
}
