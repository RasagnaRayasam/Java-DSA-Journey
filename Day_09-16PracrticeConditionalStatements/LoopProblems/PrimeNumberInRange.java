import java.util.Scanner;
public  class  PrimeNumberInRange {
    public static void main(String[]args){
        try(Scanner input = new Scanner(System.in)){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            

            for (int i = n1;i<=n2;i++){
                boolean flag = true;
                if (i == 2){
                    System.out.print(i + " ");
                    continue;
                }
                if (i%2 == 0   || i < 2){
                     continue;

                    }
                for (int j = 3;j <=Math.sqrt(i);j+=2){
                    if (i%j == 0){
                        flag = false;
                        break;
                    }
                }

                if (flag == true){
                    System.out.print(i +" ");
                }





                

                    
                }
            }

        }

    }
    

