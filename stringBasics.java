package strings;

import java.util.Scanner;

public class stringBasics {

    public static void main(String[] args) {

        String s = "Shreya";
        int length = s.length();
        System.out.println(length);
        String firstName = "Shreya";
        String lastName = "Jain";
        System.out.println(firstName.concat(lastName));
        System.out.println(s.indexOf("h"));
        System.out.println(s.toUpperCase());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("u have entered " + str);

    }
}
