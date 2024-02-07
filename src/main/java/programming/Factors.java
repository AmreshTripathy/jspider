package programming;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printFactors(n);
        countFactors(n);
        sumOfFactors(n);
        printFactorsWithoutOneAndItself(n);
    }

    private static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void countFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        System.out.println(count);
    }

    private static void sumOfFactors(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }

        System.out.println(sum);
    }

    private static void printFactorsWithoutOneAndItself(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}
