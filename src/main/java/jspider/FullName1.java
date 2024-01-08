package jspider;

public class FullName1 {
    static String fName(String firstName) {
        return "$" + firstName;
    }

    static String lName(String lastName) {
        return lastName + "$";
    }

    static void fullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        String firstName = fName("Amresh");
        String lastName = lName("Tripathy");
        fullName(firstName, lastName);
    }
}
