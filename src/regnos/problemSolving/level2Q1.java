package regnos.problemSolving;

public class level2Q1 {
    public static int binaryConversion(String binary) {
        int num =0;
        int j=0;
        int i = binary.length()-1;
        while (i >=0 ) {
            int result = (int)(Math.pow(2, i)* Integer.parseInt(String.valueOf(binary.charAt(j))));
            num += result;
            i--;
            j++;
        }

        return num;
    }
}
