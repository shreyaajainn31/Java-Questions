package Sorting;

import java.util.Arrays;
import java.util.Queue;

public class QuickSort {

    public void sort(int[]nums){
        sort(nums, 0, nums.length - 1);
    }
    private void sort(int [] nums, int start, int end){

        if(start >= end){
            return;
        }

        //Partitioning
        int boundary = partition(nums,start,end);
        //Sort Left
        sort(nums, start, boundary - 1);
        //Sort right
        sort(nums, boundary + 1, end);
    }

    private void swap(int [] nums, int i1, int i2 ){

        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    private int partition(int [] nums, int start, int end){

        int pivot = nums[end], boundary = start-1;
        for(int i = start; i<=end; i++){
            if(nums[i] <= pivot){
                swap(nums,i,++boundary);
            }
        }
        return boundary;
    }

    public static void main(String[] args) {
        QuickSort sorter = new QuickSort();
        int[]nums = {0,10,2000,-100,1000,10,0};
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
