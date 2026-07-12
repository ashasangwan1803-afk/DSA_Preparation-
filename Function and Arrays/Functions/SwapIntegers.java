import java.util.*;
class SwapIntegers{
    public static void swap(int a, int b){
        // swap integers
        int temp = a; // temp = a = 5
        a = b; // a = b = 7
        b = temp; // b = temp = 5
    }
    public static void main(String args[]){
        int a = 12; 
        int b = 7;
        System.out.println(a + "," + b);

        swap(a, b);
        System.out.println(a + "," + b);
    }
}