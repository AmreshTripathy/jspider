package programming;

import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkCircularPrime(n));
        sc.close();
    }

    private static boolean checkCircularPrime(int n) {
        int len = String.valueOf(n).length();
        int k = len;
        len--;

        while (k > 0) {
            n = ((n % 10) * (int) Math.pow(10, len)) + (n / 10);
            if (!checkPrime(n))
                return false;
            k--;
        }

        return true;
    }

    private static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        else {
            for (int i = 5; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
        }

        return true;
    }
}
