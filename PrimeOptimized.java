import java.util.*;
class PrimeOptimized{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int div=2; div*div <= n; div++){
            if(n % div == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println("the given number is a prime number");
        }
        else{
            System.out.println("the given number is not a prime number");
        }
    }
}