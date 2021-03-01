package Sorting;

import java.util.*;

public class BucketSort {

    private void sort(int[]nums, int numberOfBuckets){
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i<numberOfBuckets;i++){
            buckets.add(new ArrayList<>());
        }

        for(int num : nums){
            buckets.get(num/numberOfBuckets).add(num);
        }

        int j = 0;
        for(var bucket : buckets){
            Collections.sort(bucket);
            for(var item : bucket){
                nums[j++] = item;
            }
        }
    }

    public static void main(String[] args) {
        BucketSort sorter = new BucketSort();

        int [] nums = {2,1,0};

        sorter.sort(nums, 3);

        System.out.println(Arrays.toString(nums));
    }

}
