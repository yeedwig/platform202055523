import java.util.Scanner;

public class FactorialMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        final int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Factorial of %d = %d\n",i , getFactorial(i));
        }

    }

    private static long getFactorial(final int n){
        long fact = 1;
        for (int k = n; k > 0; k--){
            fact = fact * k;
        }
        return fact;
    }
}