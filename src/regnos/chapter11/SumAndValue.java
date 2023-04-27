package regnos.chapter11;

import java.util.Arrays;

public class SumAndValue {
    public static void main(String[] args) {
        //getNumber(3,36,2);
        System.out.println(consecutiveNumbers(5, 20, 3));
    }

    public static int[] findConsecutive(int x) {
        int[] arr = {11, 12, 13, 15};
        int[] arr2 = new int[x];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                arr2[i] = arr[i];
                arr2[i + 1] = arr[i + 1];
            }

        }
        return arr2;
    }
    public static int[] findSum(int[] arr, int y) {
        int sum=0;
        for(int i: arr){
           sum+=i;
           if(sum== y){
               return arr;
           }
        }
        throw new IllegalArgumentException("Have sense");
    }
    public static int returnValue(int[] arr, int n){
        for (int counter=0; counter< arr.length; counter++){
            if (counter==n){
                return arr[0];
            }
        }
        throw new IllegalArgumentException("Have sense");
    }
    public static int getNumber(int x, int y, int n){
       int value = returnValue(findSum(findConsecutive(x),y),n);

        return value;
    }
    public static int consecutiveNumbers(int x, int y, int n){
        int sum = 0;
        int [] num = new int[y];
        int [] result = new int[x];
        int [] result1 = new int[x];
        int answer =0;
        int counter = 0;
        for (int i = 0; i < y; i++) {
            num[i]  = i;
        }
        for (int i = 0; i < x; i++) {
            sum+=num[i];
            result[i] = num[i];
          result1 = Arrays.stream(result).sorted().toArray();
        }
        if (sum == y)return result1[n];
        else {
            for (int i = x; i < y; i++) {
                sum+=num[i];
                result[counter] = num[i];
                sum -= num[counter];
                counter++;
                result1 = Arrays.stream(result).sorted().toArray();
                if (sum == y)return result1[n];
            }
        }
        return result1[n];
    }
}
