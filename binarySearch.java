/* Finds an element using binary search in a sorted array, returns not found if the element isnt found.*/


import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search:");
        int searchElement = sc.nextInt();
        int start = 0, end = arr.length-1;
        int mid;
        int found = 0;

        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == searchElement){
                System.out.println("Element Found at index " + mid + ".");
                found = 1;
                break;
            }
            else if(arr[mid] > searchElement){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        if(found == 0){
            System.out.println("Element not found.");
        }
    }
}
