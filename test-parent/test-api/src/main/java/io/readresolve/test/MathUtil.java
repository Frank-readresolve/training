package io.readresolve.test;

public class MathUtil {

    public static int VAL = 5;

    public static int sum(int x, int y) {
	return x + y;
    }

    public static int max(int x, int y) {
	throw new UnsupportedOperationException("not implemented");
    }

    public static boolean isGreater(int other) {
	return other > VAL;
    }
}
