package programming;

public class FullName2 {
    static String fName(String firstName) {
        return "$" + firstName;
    }

    static String lName(String lastName) {
        return lastName + "$";
    }

    static void fullName(String firstName, String lastName) {
        String x = fName(firstName);
        String y = lName(lastName);
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        fullName("Amresh", "Tripathy");
    }
}
