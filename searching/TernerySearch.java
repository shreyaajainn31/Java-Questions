package searching;

public class TernerySearch {

    public int ternerySearch(int[]nums,int target){
        return ternerySearch(nums,target,0,nums.length-1);
    }
    private int ternerySearch(int [] nums, int target, int left, int right){

        if(left > right){

            return -1;
        }

        int partionSize = (right - left) / 3;

        int mid1 = left + partionSize;
        int mid2 = right - partionSize;

        if(nums[mid1] == target){
            return mid1;
        }
        if(nums[mid2] == target){
            return mid2;
        }

        //left partition
        if(target < nums[mid1]){
            return ternerySearch(nums,target, left,mid1 -1);
        }
        //right partition
        if(target > nums[mid2]){
            return ternerySearch(nums,target,mid2 + 1,right);
        }

        //middle partition
        return ternerySearch(nums,target,mid1 + 1,mid2 -1);

    }

    public static void main(String[] args) {

        TernerySearch sol  = new TernerySearch();

        int nums [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(sol.ternerySearch(nums,5));
        System.out.println(sol.ternerySearch(nums,0));

    }


}
