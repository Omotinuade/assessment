package regnos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maidcc_Challenge {


        public static List<List<Integer>> getTriplets(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    int start = i + 1, end = nums.length - 1, sum = target - nums[i];

                    while (start < end) {
                        if (nums[start] + nums[end] == sum) {
                            result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                            while (start < end && nums[start] == nums[start + 1]) start++;
                            while (start < end && nums[end] == nums[end - 1]) end--;
                            start++;
                            end--;
                        } else if (nums[start] + nums[end] < sum) {
                            start++;
                        } else {
                            end--;
                        }
                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] array = { -1, 0, 1, 2, -1, -4 };
            int targetSum = 0;

            List<List<Integer>> triplets = getTriplets(array, targetSum);

            System.out.println("Triplets with sum " + targetSum + ":");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        }
    }


