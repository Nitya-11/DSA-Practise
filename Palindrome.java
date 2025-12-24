import java.util.*;

public class Palindrome {
    // Returns true if s is a palindrome, ignoring non-alphanumeric and case
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        int i = 0, j = s.length() - 1;
        while (i < j) {
            // advance i to next alphanumeric
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            // advance j to previous alphanumeric
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check (press Enter when done):");
        String input = sc.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
