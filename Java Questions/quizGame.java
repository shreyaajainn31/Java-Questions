package challenge_6;

import java.util.*;
public class Q2 {

    public static void main(String[] args) {

        System.out.println("WELCOME TO TRUE AND FALSE GAME!");
        System.out.println("There are 5 questions in this game.\nEnter true if the answer is true and false if the answer is false. \nThe answer is case sensitive, if answered in any other way, it would be marked wrong.\nYou can not change the answer once entered. \nEach question carries one mark.The score would be displayed at the end of the game. \nGood luck!");
        System.out.println("------------------------------------------");


        String [] questions = {"The radius of the circle is twice its diameter.", "2+2 = 5", "There are 29 states in India.", "a/b = b/a where a and b are integers", "Prime Minister of India is Narendra Modi."};
        String [] correctAnswers = {"false","false","true","false","true"};
        String[] userAnswers = new String[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++){

            System.out.print(questions[i] + "." + "Enter your answer for Q" + (i+1) + ": "  );
            userAnswers[i] = sc.next();

            if(userAnswers[i].equals(correctAnswers[i])){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong.");
            }
        }

        int totalMarks = 0;

        for(int j = 0; j<5; j++){
            if(correctAnswers[j].equals(userAnswers[j])){
                totalMarks++;
            }
        }

        System.out.println();
        System.out.println("Thanks for taking the test. You have scored " + totalMarks + "/5.");

        System.out.println("------------------------------------------------------------------");
    }

}
