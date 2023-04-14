package regnos.problemSolving;

import java.util.Scanner;

public class Question6 {
    private static Scanner input = new Scanner(System.in);
    private static int birthdate = 12;
    public static void main(String[] args) {
        guessBirthDate();
    }
    public static void guessBirthDate(){
        System.out.println("Take a guess2");
        int guess = input.nextInt();

        if(guess== birthdate){
            System.out.println("Correct Guess");
        }
        else {
            System.out.println("Incorrect guess");
        }
        while(guess != birthdate){
            System.out.println("Take a guess2");
            guess = input.nextInt();

            if(guess== birthdate){
                System.out.println("Correct Guess");
            }
            else {
                System.out.println("Incorrect guess");
            }

        }
        }

}
