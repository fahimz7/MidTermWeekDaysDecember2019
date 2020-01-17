package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
    for (int i=0; i<40; i++) {
        System.out.print(fNum(i)+",");
    }

    }

    public static int fNum(int z) {
        if (z<=1)
            return z;
        return fNum(z-1) +fNum(z-2);

    }

}
