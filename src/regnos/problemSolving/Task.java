package regnos.problemSolving;

import java.util.stream.IntStream;

public class Task {
    public static void main(String[] args) {
        String[] arr = {"Ab1396", "Q2RBs", "G381ac"};
        System.out.println(task(arr));
    }
    static int task(String[] arr){
        int count =0;
        for( var i : arr){
            for (int j = 0; j < i.length(); j++) {
                if(Character.isDigit(i.charAt(j))){
                    count++;
            }
            }
        }
        return count;
    }
}
