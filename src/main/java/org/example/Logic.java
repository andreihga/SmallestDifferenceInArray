package org.example;

public class Logic {

    static int min = Integer.MAX_VALUE;

    public static int getResult(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result = array[i] - array[j];
                } else if (array[i] < array[j]) {
                    result = array[j] - array[i];
                }
            }
            if (result < min) {
                min = result;
            }
        }
        return min;
    }

}
