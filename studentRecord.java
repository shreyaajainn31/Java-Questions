package challenge_6;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students:"); //who took the exam
        int numOfStudents = sc.nextInt();
        System.out.print("Enter total number of marks possible:");
        int totalMarks = sc.nextInt();

        double studentMarks[] = new double[numOfStudents];

        //inputting the marks of each student
        System.out.println("Enter marks of each student.");

        for (int i = 0; i<studentMarks.length; i++){
            System.out.print("Enter mark for student " + (i+1) + ":");
            studentMarks[i] = sc.nextInt();
            while(studentMarks[i] > totalMarks){
                System.out.print("Invalid entry. Enter again for student " + (i+1) + ":");
                studentMarks[i] = sc.nextInt();
            }
        }

        //Printing the marks and the percentage of the student
        for(int i = 0; i<studentMarks.length; i++){
            System.out.println("The marks you entered for the student " + (i+1) + " is " + studentMarks[i] +".");

            double percentage = (studentMarks[i] / totalMarks) * 100;

            System.out.println("The percentage is " + percentage + "%.");
        }

        //the average of the exam
        double sum = 0;
        for(int i = 0; i<studentMarks.length;i++){
            sum+=studentMarks[i];
        }

        double avg = sum/numOfStudents;

        double totalClassMarks = totalMarks * numOfStudents;
        double avgPercent = (sum/totalClassMarks) * 100;

        System.out.format("The class average is %.2f.\n", avg);
        System.out.format("The class percent is %.2f.",avgPercent);

    }
}
