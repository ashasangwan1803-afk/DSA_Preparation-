import java.util.*;
class Average_method_two{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st input: ");
        double a = sc.nextDouble();

        System.out.print("Enter 2nd input: ");
        double b = sc.nextDouble();

        System.out.print("Enter 3rd input: ");
        double c = sc.nextDouble();

        double avg = (a+b+c)/3;
        System.out.println("average of 3 inputs: " + avg);
    }
}