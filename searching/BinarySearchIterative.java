package searching;

public class BinarySearchIterative {

    public int binarySearchIterative(int[] nums, int target){

        int left = 0, right = nums.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                left = mid  + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[]nums = {1,2,3,4,5,6,7,8,9};

        BinarySearchIterative sol = new BinarySearchIterative();
        System.out.println(sol.binarySearchIterative(nums,5));
        System.out.println(sol.binarySearchIterative(nums, 10));

    }
}
