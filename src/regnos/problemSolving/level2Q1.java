package regnos.problemSolving;

public class level2Q1 {
    public static void main(String[] args) {
        System.out.println(binaryConversion(1101));
    }
    public static int binaryConversion(int binary) {
        int count =1;
        int decimal=0;
        while(binary > 0){
            int a= binary % 10;
            binary= binary/ 10;
            a = a * count;
            decimal+= a;
            count*=2;
        }



        return decimal;
    }
}
