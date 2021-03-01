package Sorting;

import java.util.Arrays;

public class bubblesort {
    private static void swap(int[]nums, int index1, int index2){

        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    private void sort(int[]nums){

        for(int i = 0; i<nums.length;i++){
            for(int j = 1; j<nums.length; j++){
                if(nums[j] < nums[j-1]){
                    swap(nums,j, j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        bubblesort sorter = new bubblesort();
        int [] nums = {11,12,10,88,2,0};
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
