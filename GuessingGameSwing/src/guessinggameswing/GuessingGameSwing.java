
package guessinggameswing;

import javax.swing.*;
/**
 *
 * @author mmroziuk
 */
public class GuessingGameSwing {
    
    public static void main(String[] args) {
       int computerNumber = (int)(Math.random()*100 + 1);
       int userAnswer = 0;
       String name = "";
       // System.out.println("Hello, what's your name?");
        name = JOptionPane.showInputDialog(null, 
                "Hello, what's your name?", "Guessing GAme", 3);
        JOptionPane.showMessageDialog(null, 
                "Hello " + name + "!\nLet's play a guessing game!");
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;
        while (userAnswer != computerNumber)
        {
            String resonse = JOptionPane.showInputDialog(null, 
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(resonse);
            JOptionPane.showMessageDialog(null,
                    " " + determineGuess(userAnswer, computerNumber, count) );
            count++;
        }
    }
    
    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <= 0 || userAnswer >100 ){
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber){
            return "Your guess is too high, try again.\nTry number: " + count;
        }
        else if (userAnswer < computerNumber){
            return "Your guess is too low, try again.\nTry number: " + count;
        }
        else {
            return "Your guess is incorrect.\nTry number: " + count;
        }
    }
}
