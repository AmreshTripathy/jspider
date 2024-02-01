package leetcode;

import java.util.Scanner;

public class Pangram {
    
    public static boolean checkPangram  (String s) {
        // your code here
        if (s.length() < 26)
            return false;
            
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkPangram(sc.nextLine()));
        sc.close();
    }
}
