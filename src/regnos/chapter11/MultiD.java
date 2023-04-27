package regnos.chapter11;

import java.util.Arrays;

public class MultiD {
  static  char[][] array = new char[3][3];

    public static char[][] printArray() {

        array[0][0] = 'x';
        array[0][1] = 'o';
        array[0][2] = 'x';
        array[1][0] = 'o';
        array[1][1] = 'o';
        array[1][2] = 'x';
        array[2][0] = 'x';
        array[2][1] = 'o';
        array[2][2] = 'o';


        return array;
    }

    public static String changeValue(char value, char change) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    array[i][j] = change;
                }
            }
        }

        return Arrays.deepToString(array);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(printArray()));
        System.out.println(changeValue('x', '1'));
    }
}
