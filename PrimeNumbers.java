import java.util.Scanner;

public class PrimeNumbers {

    public void primeNumber(int max) {
        for (int i = 2; i <= max; i++) {
            boolean isPrime = true;
            for (int num = 2; num <= Math.sqrt(i); num++) {
                if (i % num == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
    }


    public void main (String[]args) {
        System.out.println("Coloque o numero maximo para ser primo");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        primeNumber(max);
        sc.close();
    }
}