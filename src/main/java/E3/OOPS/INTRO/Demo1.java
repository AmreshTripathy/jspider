package E3.OOPS.INTRO;

public class Demo1 {
    static int x = 10;

    static void test() {
        System.out.println("running static test() method");
    }
}

class MainClass1 {
    public static void main(String[] args) {
        System.out.println("main method started");
        // printing static variable of Demo1 class
        System.out.println("x value is " + Demo1.x);
        // printing static method of Demo1 class
        Demo1.test();
        Demo1.x = 20;
        System.out.println("x after modifying is " + Demo1.x);
        System.out.println("main method ended");
    }
}
