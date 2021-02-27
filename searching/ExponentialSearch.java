package searching;

public class ExponentialSearch {

    private int binarySearch(int nums[], int target, int left, int right){

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
    private int exponentialSearch(int[]nums, int target){

        int bound = 1;

        while(bound < nums.length && nums[bound] < target){
            bound = bound * 2;
        }

        int left = bound / 2;
        int right = Math.min(bound, nums.length - 1);
        return binarySearch(nums,target,left, right);
    }

    public static void main(String[] args) {

        ExponentialSearch search = new ExponentialSearch();

        int [] nums = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(search.exponentialSearch(nums,5));
        System.out.println(search.exponentialSearch(nums, 0));
        System.out.println(search.exponentialSearch(nums,10));
    }

}
