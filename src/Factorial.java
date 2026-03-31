import java.util.Scanner;
public class Factorial {

    // TODO: Create a method 'public static long factorial(int n)'
    // It should return the factorial of n.
    public static long factorial(int n){
        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
    
        // TODO: Read input n
        // TODO: Call factorial(n)
        // TODO: Print the result
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println(fact);
    }
}
