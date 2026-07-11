import java.util.*;
class Prime_number_range{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        for(int i=2; i<=n; i++){
            boolean isPrime = true;

            for(int div=2; div*div<=i; div++){
                if(i%div == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.print(i + " , ");
            }
        }
        

    }
}