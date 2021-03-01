package Sorting;

import java.util.*;

public class SelectionSort {


    private void swap(int[]nums, int index1, int index2){

        if(index1 != -1) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }
    }
    private int indexOf(int []nums, int number){

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == number){
                return i;
            }
        }
        return -1;
    }
    private void sort(int[]nums){
        int currentUnsortedIndex = 0, currentSwapIndex = 0;
        for(int i = 0; i<nums.length; i++){
            int currentMinimum = findMinimum(nums, currentUnsortedIndex);
            swap(nums, indexOf(nums,currentMinimum), currentSwapIndex);
            currentSwapIndex++;
            currentUnsortedIndex++;
        }
    }
    private int findMinimum(int[]nums, int index){

        int ans = Integer.MAX_VALUE;
        for(int i = index; i<nums.length; i++){
            if(ans > nums[i]){
                ans = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] nums = {0,19,28,10,-10};
        int [] nums2 = {1,2,0,-100,-90,100000,20};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));
        sorter.sort(nums2);
        System.out.println(Arrays.toString(nums2));

    }

}
