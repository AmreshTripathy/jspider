package programming;

public class EvenOrOddWithoutArithematic {
    public static void main(String[] args) {
        System.out.println(check(5));
    }

    public static boolean check(int num) {
        // return ((num & 1) == 1) ? false : true;
        // return ((num | 1) == num) ? false : true;
        return ((num ^ 1) == (num - 1)) ? false : true;
    }
}
