package hashMaps;

import java.util.*;

public class myHashMap {


    LinkedList<String>[] hashTable;

    myHashMap(){
        this.hashTable = new LinkedList[10];
        for(int i = 0; i<10; i++){
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(int key, String value){
        hashTable[key].add(value);
    }

    public void get(int key){

        System.out.println(hashTable[key]);
    }

    public void remove(int key, String name){
        hashTable[key].remove(name);
    }
    public static void main(String[] args) {

        myHashMap map = new myHashMap();
        map.put(1,"Shreya");
        map.put(1, "Abhijay");
        map.put(2,"Anku");
        map.put(2,"Kanika");
        map.get(1);
        map.remove(1,"Shreya");
        map.get(1);
    }

}
