import java.util.Scanner;

public class FibonacciFounder {
    
    public int fibonacci (int limit) {
        int[] fib = new int[limit];
        fib[0] = 0;
        fib[1] = 1;


        for (int i = 2; i < limit; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        };

        if (limit == 0) return 0;
        return fib[limit-1];
    }

    public void main (String[] args) {

        int limit;
        Scanner in = new Scanner(System.in);
        System.out.println("Coloque o numero de fibonacci que deseja achar: ");
        limit = in.nextInt();
        if (limit < 0) {
            System.out.println("O numero de fibonacci deve ser maior que zero.");
        }
        else {
            System.out.println("O numero de fibonacci que está procurando é: " + fibonacci(limit));
        }
    }
}
