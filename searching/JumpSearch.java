package searching;

import java.util.*;
public class JumpSearch {

    private int jumpSearch(int []nums, int target){

        int length = nums.length;
        int blockSize = (int) Math.sqrt(length);
        int start = 0, next = blockSize;

        while (start < length) {

            next = start + blockSize;
            if (next > length) {
                next = length;
            }
            if (nums[next - 1] < target) {
                start = next;
            }

            //do linear search
            for (int i = start; i < next; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        JumpSearch search = new JumpSearch();

        int[]nums = {3,5,6,9,11,18,20,21,24,30};

        System.out.println(search.jumpSearch(nums, 5));
    }
}
