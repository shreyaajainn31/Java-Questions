package searching;

public class BinarySearchRecursive {

    public int binarySearchRecursive(int nums[], int target){

        return binarySearchRecursive(nums,0, nums.length - 1, target);
    }

    private int binarySearchRecursive(int[]nums, int left, int right, int target){

        if(left >= nums.length){
            return -1;
        }

        if(right < 0){
            return -1;
        }

        int mid = left + right / 2;

        if(nums[mid] ==  target){
            return mid;
        }

        if(target > nums[mid]){
            return binarySearchRecursive(nums, mid + 1, right, target);
        }


        return binarySearchRecursive(nums, left,mid - 1, target);

    }

    public static void main(String[] args) {

        int[]nums = {1,2,3,4,5,6,7,8,9};

        BinarySearchRecursive sol = new BinarySearchRecursive();
        System.out.println(sol.binarySearchRecursive(nums,5));
        System.out.println(sol.binarySearchRecursive(nums,0));
        System.out.println(sol.binarySearchRecursive(nums,1));

    }



}
