import java.util.*;

class Strmenu {
    public static void main(String args[]) {
        String a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        a = sc.nextLine();
        b = sc.nextLine();
        int len1 = a.length();
        int len2 = b.length();
        System.out.println("Length of the first string: " + len1);
        System.out.println("Length of the second string: " + len2);
        String concatenatedString = a + b;
        System.out.println("Concatenated string: " + concatenatedString);
        System.out.println("Compared the string:" + a.equals(b));
        if (a.equals(b)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        a = b;
        System.out.println("Copied value of the first string: " + a);
        System.out.println("Value of the second string remains: " + b);
    }
}

