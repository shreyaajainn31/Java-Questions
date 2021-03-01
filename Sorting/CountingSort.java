package Sorting;

import java.util.*;

public class CountingSort {

    private int findMaximum(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int num : nums){
            if(ans < num){
                ans = num;
            }
        }

        return ans;
    }
    private void sort(int[]nums){

        int maximum = findMaximum(nums);
        int [] freq = new int[maximum + 1];

        for(int num : nums){
            freq[num]++;
        }

        int j = 0;
        for(int i = 0; i<freq.length; i++){

            if(freq[i] != 0){
                int num = i;
                for(int k = 0; k<freq[i]; k++){
                    nums[j++] = num;
                }
            }
        }


    }

    public static void main(String[] args) {

        CountingSort sorter = new CountingSort();
        int[]nums = {1,1,2,9,9,8,7,7,4,3,3,6};
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[]nums2 = {1,0,5,3,3,2,0};
        sorter.sort(nums2);
        System.out.println(Arrays.toString(nums2));
    }
}
