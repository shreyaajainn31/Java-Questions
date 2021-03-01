package Sorting;


import java.util.*;
public class MergeSort {
    private void merge(int[]left, int[]right, int[]result){

        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k++] = left[i++];
            }
            else {
                result[k++] = right[j++];
            }
        }
        while(i < left.length){
            result[k++] = left[i++];
        }
        while(j < right.length){
            result[k++] = right[j++];
        }
    }
    private void sort(int [] nums){

        if(nums.length < 2){
            return;
        }

        //Divide the array into two halves
        int mid = nums.length / 2;
        int [] left = new int[mid];
        for(int i = 0; i<mid; i++){
            left[i] = nums[i];
        }

        int [] right = new int[nums.length - mid];
        for(int j = mid; j<nums.length; j++){
            right[j - mid] = nums[j];
        }

        //Sort the two halves
        sort(left);
        sort(right);

        //Merge the two halves
        merge(left,right,nums);
    }

    public static void main(String[] args) {
        MergeSort sorter  = new MergeSort();
        int [] nums = {1,0,10,-100,12001};
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
