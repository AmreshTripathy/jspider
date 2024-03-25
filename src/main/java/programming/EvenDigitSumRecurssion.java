package programming;

import java.util.Scanner;

public class EvenDigitSumRecurssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if (n == 0)
            return 0;
        else if ((n % 10) % 2 == 0)
            return (n % 10) + sum(n / 10);
        else
            return sum(n / 10);
    }
}
