package regnos.problemSolving;

import java.util.*;

public class Question6 {
    private static Scanner input = new Scanner(System.in);
    private static int birthdate = 12;
    public static void main(String[] args) {
        guessBirthDate();
    }
    public static void guessBirthDate(){
        System.out.println("Take a guess2");
        int guess = input.nextInt();

        if(guess== birthdate){
            System.out.println("Correct Guess");
        }
        else {
            System.out.println("Incorrect guess");
        }
        while(guess != birthdate){
            System.out.println("Take a guess2");
            guess = input.nextInt();

            if(guess== birthdate){
                System.out.println("Correct Guess");
            }
            else {
                System.out.println("Incorrect guess");
            }

        }
        }

        public int lengthOfLastWord(String s) {
            var result=s.split(" ");

            return result[result.length-1].length();

        }




    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> beg = new HashMap<>();
        int k=0;
        for(int i =k+1;i<nums.length;i++){
            for(int j= i+1; j< nums.length; j++){
                if((nums[k]+nums[i]+nums[j])==0){
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[k]);
                    newList.add(nums[i]);
                    newList.add(nums[j]);
                    list.add(newList);
                    list.stream().distinct().toList();

                }

            }
        }
        return list;
    }
}
