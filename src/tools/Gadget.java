package tools;

import java.util.Arrays;

public class Gadget {
    public static double[] rar(int size) {
        double[] array = new double[200];
        Arrays.setAll(array, i -> Math.random());
        return array;
    }
}
