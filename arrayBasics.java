package arrays;

import java.util.Scanner;

public class arrayBasics {

    public static void main(String[] args) {

        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true){

            System.out.println("You have following options to choose from:");
            System.out.println("1. Add element");
            System.out.println("2. Update Element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");

            System.out.print("Enter your choice(1,2,3 or 4):");
            int choice = sc.nextInt();


            if(choice == 1){

                while(index < arr.length){
                    System.out.print("Enter the element you want to add:");
                    arr[index] = sc.nextInt();
                    System.out.println("Element added.");
                    index++;
                    break;
                }
                if(index == arr.length){
                    System.out.println("Sorry, no more space.");
                }
            }
            else if(choice == 2){
                System.out.print("Enter the element you want to update:");
                int element = sc.nextInt();

                int elementInd = -1;
                for(int i =0;i<arr.length; i++){
                    if(arr[i] == element){
                        elementInd = i;
                        break;
                    }
                }

                if(elementInd == -1){
                    System.out.println("Sorry element not found.");
                }
                else{
                    System.out.print("You want to update it too?");
                    int updateTo = sc.nextInt();
                    arr[elementInd] = updateTo;
                    System.out.println("Element updated.");
                }

            }
            else if(choice == 3){
                System.out.println("These are the elements. The empty spaces are termed as 0.");
                for(int i = 0; i<arr.length; i++){
                    System.out.println(arr[i]);
                }
            }
            else if(choice == 4){
                break;
            }







        }


    }
}
