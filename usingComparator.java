package arrays;

import java.util.Comparator;
import java.util.*;
public class usingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2){

        int x = o1 % 10;

        int y = o2 % 10;

        if(x > y) {
            return 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(123);
        values.add(1092);
        values.add(10089);
        values.add(100);
        Comparator<Integer> myCompare = new usingComparator();
        Collections.sort(values,myCompare);
        for(int num : values){
            System.out.print(num + " ");
        }
    }


}
