import java.util.*;
class NcR{
    public static int findFactorial(int num){
        int res = 1; 
        for(int mul=1; mul<=num; mul++){
            res = res*mul;
        }
        return res;
    }
    public static int findNcR(int n, int r){
        int nFac = findFactorial(n);
        int rFac = findFactorial(r);
        int NmRFac = findFactorial(n-r);

        int ncrRes = nFac / (rFac * NmRFac);
        return ncrRes;
    }
    public static void main(String args[]){ 
        // jis din aap chez main per likh dete ho 
        // aap limit kar dete ho apne code ko mean 
        // (woh ik hi input ke liye chalega, ik hi logic ke liye chalega )
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter n = ");
        int n = sc.nextInt();

        System.out.print("enter r = ");
        int r = sc.nextInt();

        int res = findNcR(n, r);
        System.out.println("Result is: " + res);
        
    }
}

