package jspider;

public class Percentage {
    static int total(int p, int c, int m, int o) {
        return p + c + m + o;
    }

    static void percentage(int p, int c, int m, int o) {
        System.out.println((total(p, c, m, o) / 400.0f) * 100);
    }

    public static void main(String[] args) {
        percentage(80, 80, 80, 80);
    }
}
