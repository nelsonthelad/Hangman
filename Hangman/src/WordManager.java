
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


/*
File Name: WordManager
Programmer: Nelson Daniels
Date: June 3rd 2023
Description: Responsible for reading a txt file and randomly selecting a word from it
 */

public class WordManager {
    
    static ArrayList<String> words = new ArrayList<>(); // creates the array to store the words
    
    public void textScanner() {
        String fileName = "assets/words.txt"; // the file name that we want to search

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { // creates a new BufferedReader that reads fileName
            String line; // variable to store each new line of code
            while ((line = reader.readLine()) != null) {
                words.add(line); // adds each new line to the arraylist lines
            }
        } catch (IOException e) {
            e.printStackTrace();
            return; // returns the method if an exception is caught
        }
    }
    
    public String selectWord() {
        
        textScanner(); // scans the txt file
        String output;
        
        Random random = new Random();
        
        int size = words.size();

        // generates a random number within the range of the arraylist size
        int randomIndex = random.nextInt(size);

        // retrieves the item at the randomly generated index from the arraylist
        output = words.get(randomIndex);

        System.out.println("Random Word: " + output);
        
        
        return output;
    }
    
    
}
