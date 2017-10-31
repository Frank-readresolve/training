package io.readresolve.test;

public class MathUtil {

    private MathUtil() {
    }

    final static int val = 5;

    public static int getVal() {
        return val;
    }

    public static int sum(int x, int y) {
        // blabla je suis une erreur ....
        return x + y;
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
               
    }

        public static int min(int x, int y) {
        if (x > y) {
            System.out.println("x"+x);
            return x;
        } else {
            return y;
        }
        }
    public static boolean isGreater(int other) {
        return other > val;
    }
}
