import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 2; i <= 100; i++) {
            boolean primes = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    primes = false;
                    break;
                }
            }
            if (primes) {
                System.out.print(i + " ");
            }

        }
    }
}