package regnos.chapter16;

public class Recursive {
    public static void main(String[] args) {
    powerOf2(50);
    }
    public static int powerOf2(int n){
        if (n < 1){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            int prev = powerOf2(n/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}
