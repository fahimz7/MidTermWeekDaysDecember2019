package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String x = "MOM", y = "BROTHER";
        System.out.println(isPalindrome(x) ? x + " is palindrome." : x + " is not palindrome");
        System.out.println(isPalindrome(y) ? y + " is palindrome." : y + " is not palindrome");
    }

    public static boolean isPalindrome(String x) {

        if (x.isEmpty()) {
            return true;
        }

        int left = 0, right = x.length() - 1;

        while(left <= right) {

            char a = x.charAt(left);
            char b = x.charAt(right);

            if (Character.toLowerCase(a) != Character.toLowerCase(b))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
