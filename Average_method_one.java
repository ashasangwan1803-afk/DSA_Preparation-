import java.util.*;
class Average_method_one{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st input: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd input: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd input: ");
        int c = sc.nextInt();

        double avg = (a+b+c)/3.0;
        // we can't use this double avg = (a+b+c)/3; beacuse it replace all values after decimal with 0  
        // (int/int) = int
        // so to avoid data lose we use 2 different data types 
        // (int/double) = double or (double/int) = double 

        System.out.println("average of 3 inputs: " + avg); 
    }
}