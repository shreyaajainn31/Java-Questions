package Sorting;

import java.util.*;

public class InsertionSort {

    private void sort(int [] nums){
        int prevIndex = 0, current = 0;
           for (int i = 1; i < nums.length; i++) {
               current = nums[i];
               prevIndex = i - 1;
               while(prevIndex >= 0 && nums[prevIndex] > current){
                   nums[prevIndex + 1] = nums[prevIndex];
                   prevIndex--;
               }
               nums[prevIndex + 1] = current;
           }
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int [] nums = {0,2,100,-10,-100,90000,900,4500};
        sorter.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
