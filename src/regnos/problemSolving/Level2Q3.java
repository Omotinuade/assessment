package regnos.problemSolving;

import java.util.Arrays;

public class Level2Q3 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4};
        int[] newArray = new int[array.length];

        int product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    product *= array[j];
                    newArray[i] = product;
                }

            }product= 1;

        }
        System.out.println(Arrays.toString(newArray));
    }
}
