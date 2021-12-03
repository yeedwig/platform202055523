import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a begin number: ");
        final int begin = sc.nextInt();

        System.out.printf("Enter an end number: ");
        final int end = sc.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d: %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d: %,d%n", begin, end, product);


    }

    private static long getSumBetween(final int a, final int b){
        long sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }

    private static long getProductBetween(final int a, final int b){
        long product = 1;
        for(int i = a; i <= b; i++){
            product *= i;
        }
        return product;
    }
}
