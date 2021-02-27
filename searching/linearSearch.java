package searching;

public class linearSearch {


    private int search(int [] nums, int target){

        for(int i = 0; i<nums.length; i++){

            if(nums[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7};

        linearSearch solution = new linearSearch();

        System.out.println(solution.search(nums,5));
        System.out.println(solution.search(nums,0));

    }
}
