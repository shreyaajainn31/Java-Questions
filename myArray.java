package arrays;

import java.lang.*;
public class myArray {

    static int[]array = new int[100000];
    public static int arrayIndex = 0;
    public static void insert(int data){

        array[arrayIndex] = data;
        arrayIndex++;

        if(arrayIndex > array.length){
            System.out.println("Sorry no more space.");
        }
    }

    public static void display(){

        for(int i = 0; i<arrayIndex;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void removeAt(int pos){
        int copy[] = new int[arrayIndex];
        int ci = 0;
        for(int i = 0; i<arrayIndex; i++){
            if(i != pos){
                copy[ci] = array[i];
                ci++;
            }
        }

        arrayIndex = 0;
        for(int i = 0; i<copy.length - 1; i++){

            array[arrayIndex] = copy[i];
            arrayIndex++;
        }
    }

    public static int indexOf(int num){

        for(int index = 0; index<arrayIndex; index++){
            if(array[index] == num){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        myArray arrays = new myArray();

        arrays.insert(1);
        arrays.insert(2);
        arrays.insert(3);

        display();
        System.out.println();
        System.out.println(arrays.indexOf(3));
        System.out.println(arrays.indexOf(7));
        removeAt(1);
        display();


    }
}

