package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("The missing number from the array is " + missingNum(array));

    }
    public static int missingNum(int[] array) {

        int maxNum = array[0], arrayNum = array[0];

        for (int i = 1; i < array.length; i++) {

            arrayNum += array[i];
            if (array[i] > maxNum)
                maxNum = array[i];
        }
        return (maxNum * (maxNum + 1) / 2) - arrayNum;
    }
}
