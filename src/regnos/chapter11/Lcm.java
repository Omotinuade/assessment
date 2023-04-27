package regnos.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcm(50)));
    }

    public static int[] lcm(int num) {
        int i=2;
        List<Integer> list= new ArrayList<>();
        if (num < 0) {
            return new int[0];
        }
        while (num > 1) {
        if(num%i==0){
            num= num/i;
            list.add(i);
        }
        else{
            i++;
        }
        }
        int[] arr = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            arr[j]= list.get(j);
        }
        return arr;
    }
}
