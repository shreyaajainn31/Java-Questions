package hashMaps;

import java.util.HashMap;

public class hashmaps {

    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<String, String>();

        h.put("S","J");
        h.put("A","J");

        System.out.println(h);

       // System.out.println(h.get("S"));

        HashMap<String, Integer> rollNo = new HashMap<String, Integer>();

        rollNo.put("S", 231);
        rollNo.put("V", 247);
        rollNo.put("H", 683);

        for(String i : rollNo.keySet()){
            System.out.println(i + " has roll number " + rollNo.get(i));
        }

        rollNo.remove("S");


        System.out.println("After removing:");

        for(String i : rollNo.keySet()){
            System.out.println(i + " has roll number " + rollNo.get(i));
        }
        for(String i : h.values()){
            System.out.println(i);
        }

    }

}
