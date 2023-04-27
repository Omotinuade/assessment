package regnos.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ReturnLowestIndex {
    public static void main(String[] args) {
        int[] array= {-2,5,9,-2};
        System.out.println(Arrays.toString(getMinAndMax(array)));
        //arr();
//        int sum=0;
//        List<Integer> list= new ArrayList<>();
//        int[] array ={3, 2,1000,-5};
//        int[] array2 =new int[array.length];
//        int lowest = array2[0];
//        int low = 0;
//        int highest = array2[0];
//        int high = 0;
//        for(int j=0; j<= array.length-1; j++){
//            sum+=array[j];
//        }
//
//        for(int k=0;k<= array.length-1;k++){
//            array2[k]= sum-array[k];
//        }
//        System.out.println(Arrays.toString(array2));
//
//
//        for(int i=0; i<= array2.length-1; i++){
//
//           if(array2[i] < lowest) {
//               lowest = array2[i];
//               low = i;
//           }
//
//           if(array2[i] > highest) {
//               highest = array2[i];
//               high = i;
//           }
//
//
//        }
//        list.add(low);
//        list.add(high);
//
//
//        System.out.println(list);
//        //Arrays.stream(array).boxed().toArray(Integer[]::array);
//
//
//    }
//
//    public static void arr() {
//        int[] array ={2,3,4,5};
//        int[] newArray = new int[array.length];
//
//        int indexValue = 0;
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                sum += array[j] ;
//            }
//            sum -= array[i];
//            newArray[i] = sum;
//            sum = 0;
//        }
//        System.out.println(Arrays.toString(newArray));
//    }
    }
    public static int[] getMinAndMax(int[] array){
        int tempSum=0;
        int maxSum=0;
        int[] result = new int[2];
    for(int i=0; i< array.length;i++){
        tempSum=0;
        for (int j=0;j<array.length;j++){
            if (i != j) {
                tempSum+=array[j];
            }
            if(tempSum> maxSum){
                maxSum=tempSum;
                result[0]=i;
            }

        }
    }
        return result;
    }
}
