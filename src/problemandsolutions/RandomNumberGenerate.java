package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {
        Random rdom = new Random();
        int num = 0;
        while (true) {
            num = rdom.nextInt(9);
            if (num != 0) break;
        }
        System.out.println(num);
    }
}