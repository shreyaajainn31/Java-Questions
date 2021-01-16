
import java.util.ArrayList;
import java.util.Scanner;

public class arrayListBasics {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("You have following options to choose from:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Update Element");
            System.out.println("4. Display elements");
            System.out.println("5. Exit");


            System.out.print("Enter your choice (1,2,3,4 or 5): ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter the element you want to add:");
                int element = sc.nextInt();
                array.add(element);
                System.out.println("Element added.");
            }
            else if(choice == 2){
                System.out.print("Enter the element you want to delete:");
                int delete = sc.nextInt();
                int index = array.indexOf(delete);
                if(index == -1){
                    System.out.println("Element doesn't exist.");
                }
                else{
                    array.remove(index);
                    System.out.println("Element deleted.");
                }
            }
            else if(choice == 3){
                System.out.print("Enter the element you want to update:");
                int element = sc.nextInt();

                int index = array.indexOf(element);
                if(index == -1){
                    System.out.println("Element doesn't exist.");
                }
                else
                {
                    System.out.print("You want to update it too?");
                    int updateTo = sc.nextInt();
                    array.set(index,updateTo);
                    System.out.println("Element updated.");
                }

            }
            else if(choice == 4){
                System.out.println("These are the elements:");
                for(int i = 0; i<array.size(); i++){
                    System.out.println(array.get(i));
                }
            }
            else if(choice == 5){
                break;
            }

        }




    }


}
