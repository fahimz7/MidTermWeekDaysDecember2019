package string.problems;


public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String x = "cat", y = "act";
        System.out.println(isAnagram(x, y) ? "The two strings are anagram." : "The two strings are not anagram.");
    }
    public static boolean isAnagram(String x, String y) {

        if (x.length() != y.length()) {
            return false;
        }

        x = x.replaceAll("x+","").toLowerCase();
        y = y.replaceAll("y+","").toLowerCase();
        int[] count = new int[26];

        for (int i = 0; i < x.length(); i++) {
            count[x.charAt(i) - 'a']++;
        }
        for (int i = 0; i < y.length(); i++) {

            count[y.charAt(i) - 'a']--;
            if (count[y.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
