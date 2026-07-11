// QUESTION 30 --> 
/* Prime factors -->

// Factors woh numbers hote hain jo 
kisi number ko poori tarah divide kar 
dete hain, yani remainder (shesh) 0 aata hai.

Prime factors sirf wahi factors hote hain jo prime numbers hote hain.
Prime number = Jiske sirf 2 factors hote hain:1 , Khud woh number
*/

import java.util.*;
class PrimeFactor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();

        System.out.print("Prime factors are: ");

        //divide by 2 until not divisible
        while(n % 2 == 0){
            System.out.print(2 + " ");
            n = n / 2; 
        }

        // check odd factors from 3 onwords
        for(int i=3; i<=Math.sqrt(n); i += 2){ // 2 se increment means even numbers skip ho jayenge 
            while(n%i == 0){
                System.out.print(i + " ");
                n = n / 10;
            }
        }
        // If n is still greater than 2, it is prime
        if (n > 2) {
            System.out.print(n);
        }
        sc.close();
    }
}