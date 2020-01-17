package string.problems;


import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.toLowerCase();
        HashMap<String, Integer> jProgram = new HashMap<>();
        for (String word : st.split(" ")) {

            int i = jProgram.getOrDefault(word, 0);
            jProgram.put(word, i + 1);
        }

        ArrayList<Integer> lengths = new ArrayList<>();
        System.out.println("Duplicate words and occurrences:");
        for (String key : jProgram.keySet()) {

            lengths.add(key.length());
            if (jProgram.get(key) > 1)
                System.out.println("The word "+key +" "+ "duplicated"+" " + jProgram.get(key)+" times");

        }
        Integer sum = 0;
        for (Integer length : lengths) {
            sum += length;
        }
        int average = sum / lengths.size();

        System.out.println("Average length of the words is: " + average+" letters");
    }
}
