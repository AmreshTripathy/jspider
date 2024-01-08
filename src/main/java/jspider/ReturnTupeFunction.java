package jspider;

public class ReturnTupeFunction {
    static int total(int p, int c, int m, int o) {
        return p + c + m + o;
    }

    static void percentage(int total) {
        System.out.println((total / 400.0f) * 100);
    }

    public static void main(String[] args) {
        percentage(total(80, 80, 80, 80));
    }
}
