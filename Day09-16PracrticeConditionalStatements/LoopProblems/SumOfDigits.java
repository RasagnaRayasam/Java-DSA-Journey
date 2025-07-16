import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[]args){
        try( Scanner input = new Scanner(System.in)){
         int n = input.nextInt();
         int total = 0;
         while (n != 0) {
            int lastdigit = n % 10;
            total += lastdigit;
            n /= 10;



         }
        System.out.println(total);

        }
       
        


    }
    
}




