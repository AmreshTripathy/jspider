package jspider;

public class Love6 {
  public static void main(String[] args) {
    // System.out.println(love6(-7,1));
    // System.out.println(inOrderEqual(3, 4, 3, true));
    // System.out.println(evenlySpaced(2, 4, 6));
    // System.out.println(makeChocolate(4, 1, 9));
    System.out.println(11 & 1);
  }

  // public static boolean love6(int a, int b) {
  // if (a == 6 || b == 6 || Math.abs(a - b) == 6 || Math.abs(a + b) == 6)
  // return true;

  // return false;
  // }

  public static int makeChocolate(int small, int big, int goal) {
    int count = 0;
    if (goal / 5 <= big) {
      count += goal / 5;
      big -= goal / 5;
      goal -= (goal / 5) * 5;
    }

    if (goal == 0)
      return count;
    else if (small >= goal)
      return count + goal - 1;
    else
      return -1;
  }

  public static boolean evenlySpaced(int a, int b, int c) {
    if (a == b && b == c && a == c)
      return true;
    else if ((a < b && b < c) || (a > b && b > c))
      return Math.abs(a - b) == Math.abs(b - c);
    else if (a > b && b < c)
      return (a < c) ? Math.abs(b - a) == Math.abs(a - c) : Math.abs(b - c) == Math.abs(a - c);
    else if (b > a && a < c)
      return (b < c) ? Math.abs(a - b) == Math.abs(b - c) : Math.abs(a - c) == Math.abs(b - c);
    else if (a > c && c < b)
      return (a < b) ? Math.abs(c - a) == Math.abs(a - b) : Math.abs(c - b) == Math.abs(b - a);
    else
      return false;
  }

  public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (equalOk && (a == b || a == c || b == c))
      return true;
    else if (a < b && b < c)
      return true;
    else
      return false;
  }
}
