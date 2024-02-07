package programming;

import java.util.Scanner;

public class SeriesWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        show(n);
    }

    private static void show(int n) {
        if (n == 0)
            return;

        show(n - 1);
        System.out.print(n + " ");
    }
}
