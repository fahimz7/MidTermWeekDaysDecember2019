package math.problems;

import static java.lang.Math.abs;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        int minDiff = abs(array1[0] - array2[0]);
        for(int a : array1)
            for(int b : array2)
                if (abs(a - b) < minDiff)
                    minDiff = abs(a - b);

        System.out.println("The lowest difference between the two array cells is " + minDiff);




    }

}
