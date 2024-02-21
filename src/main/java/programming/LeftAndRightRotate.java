package programming;

import java.util.Scanner;

public class LeftAndRightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println("Left Rotate: " + leftRotateNum(n, k));
        System.out.println("Right Rotate: " + rightRotateNum(n, k));
    }

    private static int rightRotateNum(int n, int k) {
        // Calculating Length
        int len = String.valueOf(n).length();

        // Sometimes k may be grater than the actual number give
        // So below minimizing the count
        k = k % len;

        // 123 -> 312 (right roatate)
        // 312 -> 300 + 12;
        // (123 % 10) * (10 ^ length of number - 1) + (123 / 10)
        // length - 1 because 123 --> length is 3 but we need 300 so length - 1
        len--;

        while (k > 0) {
            n = ((n % 10) * (int) Math.pow(10, len)) + (n / 10);
            k--;
        }

        return n;
    }

    private static int leftRotateNum(int n, int k) {
        // Calculating Length
        int len = String.valueOf(n).length();

        // Sometimes k may be grater than the actual number give
        // So below minimizing the count
        k = k % len;

        // 123 -> 231 (left rotate)
        // 231 -> 230 + 1;
        // ((123 % 100) * 10) + (123 / 10)
        // length - 1 because 123 --> length is 3 but we need 300 so length - 1
        len--;

        while (k > 0) {
            n = (n % (int) Math.pow(10, len)) * 10 + (n / (int) Math.pow(10, len));
            k--;
        }

        return n;
    }
}
