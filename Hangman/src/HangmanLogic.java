
import java.util.Random;

/*
File Name: HangmanLogic
Programmer: Nelson Daniels
Date: June 3rd 2023
Description: Responsible for logic behind the hangman game
*/

public class HangmanLogic {
    
    public static String encoder(String word) {
        Random random = new Random(); // creates new random
        StringBuilder convertedWord = new StringBuilder(); // creates new string builder

        for (int i = 0; i < word.length(); i++) { // creates a string the same length as the inputed word with all "_"
            convertedWord.append('_');
        }

        int maxNumber = word.length() - 1; // max number of "_" in the set

        int charactersToSet = (word.length() - 2); // chooses how many characters to unscramble

        for (int i = 0; i < charactersToSet; i++) { // unscrambles random charcters by a random number generator providing the indexes
            int randomIndex = random.nextInt(maxNumber + 1);
            convertedWord.setCharAt(randomIndex, word.charAt(randomIndex));
        }

        return convertedWord.toString(); // returns the convertedWord as a string
    }
    
    public String decoder(String maskedWord, String originalWord, char character) {
       
        StringBuilder updatedWord = new StringBuilder(maskedWord); // 
        
        for (int i = 0; i < originalWord.length(); i++) { // loop for the length of the orignialWord
            if (maskedWord.charAt(i) == '_' && originalWord.charAt(i) == character) { // if index of the maskedWord and Orignial Wrd are equals then then masked word gets updated with the inputed char
                updatedWord.setCharAt(i, character); // replaces the "_" with the correct letter
            }
        }
        
        return updatedWord.toString(); // returns he updatedWord in a string
       
    
    }
     
    public static boolean letterCheck(char letter, String word) {
        
        for (int i = 0; i < word.length(); i++) { //checks if a letter is in a sting
            if (word.charAt(i) == letter) {
                return true; // returns true if found
            }
        }
        return false; // returns false if not found
    }
    
    
    // possible uses for future updates | diffrent iterations of the encoder
    
    /* public String history(String typeHistory, char letter) {
        
        StringBuilder updatedWord = new StringBuilder(typeHistory);
        updatedWord.setCharAt(typeHistory.length() + 1, letter);
        
        return updatedWord.toString();
       
    } */
    
    /* public static String encoder(String word) {
        
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        StringBuilder convertedWord = new StringBuilder();
        convertedWord.append(firstLetter);
        
        for (int i = 1; i < word.length() - 1; i++) {
            convertedWord.append("_");
        }
        
        convertedWord.append(lastLetter);
        return convertedWord.toString();
        
    } */
    
    // 
    
    /*public static String encoder(String word) {
        
        char firstLetter = word.charAt(0); // gets the character at index 0
        char lastLetter = word.charAt(word.length() - 1); //gets the last character
        StringBuilder convertedWord = new StringBuilder(); // creates a new string builder
        convertedWord.append(firstLetter);

        Random random = new Random();
        int underscoreCount = 1;

        for (int i = 1; i < word.length() - 1; i++) {
            char currentChar = word.charAt(i);
            if (currentChar != ' ') {
                if (underscoreCount < 3 && random.nextBoolean()) {
                    convertedWord.append(currentChar);
                } else {
                    convertedWord.append("_");
                    underscoreCount++;
                }
            } else {
                convertedWord.append(" ");
            }
        }

        convertedWord.append(lastLetter);
        return convertedWord.toString();
    } */
    
}
