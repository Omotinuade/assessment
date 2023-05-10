package regnos.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAndSort {


    public static List<Integer> mergeAndSortList(int[] list, int[] list2){
        List<Integer> arr = new ArrayList<>();
        var count=0;
        var i = 0;
        var j = 0;
        while(i< list.length && j< list2.length){
            if(list[i]< list2[j]){
                arr.add(list[i]);
                i++;
            }
            else{
                arr.add(list2[j]);
                j++;
            }
            count++;
        }
//       int[] arr = Arrays.stream((Arrays.copyOfRange(list, i, list.length) )).mapToObj(x -> arr.add(x));
//        arr= arr.add(Arrays.copyOfRange(list2, j, list2.length));

        return arr;
    }

    public static void main(String[] args) {
        int[] list={1,3,4,5};
        int[] list2={2,6,7,8};
        System.out.println(mergeAndSortList(list, list2));
    }
}
