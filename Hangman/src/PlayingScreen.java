
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


/*
File Name: PlayingScreen
Programmer: Nelson Daniels
Date: June 3rd 2023
Description: Responsible for the main game function
*/


public class PlayingScreen extends javax.swing.JFrame {
    
    private Timer timer; // creates a new timer
    private int countdown;
    
    private WordManager word; // creates an instance of the WordManager class
    private HangmanLogic logic;
    
    // initilizes some varables for the logic algorithms
    String chosenWord;
    char inputLetter;
    String encodedWord;
    
    // creates starting stats
    int tries = 7; 
    int score = 0;
    int level = 1;
    
    public int getScore() {
        return score; // responsible for giving info to EndingScreen
    }

    public int getLevel() {
        return level; // responsible for giving info to EndingScreen
    }
    
  
    public PlayingScreen() {
        
        initComponents();
        hangmanLabel.setIcon(new ImageIcon(new ImageIcon("assets/hangman1.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT))); // fixes the hangman icon
        
        word = new WordManager(); // creates a new instance of WordManager
        logic = new HangmanLogic(); // creates a new instance of HangmanLogic
        
        levelUp(); 
        
        CountdownTimer(); // starts the countdown timer
        
    }

    public void setDisplay(int tries) {
        
        String asset = "assets/skull.png"; // sets the default display
        
        switch (tries) { // changes the display based on the amount of tries the user has left
            case 6: 
                asset = "assets/hangman2.png";
                break;
            case 5: 
                asset = "assets/hangman3.png";
                break;
            case 4: 
                asset = "assets/hangman4.png";
                break;
            case 3: 
                asset = "assets/hangman5.png";
                break;
            case 2: 
                asset = "assets/hangman6.png";
                break;
            case 1: 
                asset = "assets/hangman7.png";
                break;
        } 
        
        hangmanLabel.setIcon(new ImageIcon(new ImageIcon(asset).getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT))); // sets the icon
    }
    
    public void CountdownTimer() {

        countdown = 120; // set the time for the countdown

        // creates a Timer with a 1-second delay
        timer = new Timer(1000, new ActionListener() { // creates an action listener 
            public void actionPerformed(ActionEvent e) {
                countdown--;
                timerLabel.setText("Timer: " + countdown + "s"); // displays the countdown and updates every second

                if (countdown == 0) {
                    ending(); // calls ending method
                    timer.stop(); // stops the timer
                }
            }
        });

        // stars the timer
        timer.start();

        // Pack and display the JFrame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void levelUp() {
        chosenWord = word.selectWord(); // chooses a new word
        encodedWord = logic.encoder(chosenWord); // encodes the new word
        wordLabel.setText(encodedWord); // displays it
        numLetters.setText("Number of Letters: " + chosenWord.length()); //updates the number of letters
        levelLabel.setText("Level: " + level); // updates the level
        level++;
        triesLeft.setText("Tries Left: " + tries); // updates tries left
    }
    
    public void ending() {
        EndingScreen finalScreen = new EndingScreen(); // creates a new instance of EndingScreen
        finalScreen.setScoreTxt(getScore()); // calls methods to get score and level
        finalScreen.setLevelTxt(getLevel());
        
        finalScreen.getScores(); // calls getScores
        
        finalScreen.show();
        dispose(); // cloes old window
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hangmanLabel = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        hangmanTxt = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        wordLabel = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        displayFind = new javax.swing.JLabel();
        quit = new javax.swing.JButton();
        numLetters = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();
        triesLeft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hangmanLabel.setIcon(new javax.swing.ImageIcon("/Users/school/NetBeansProjects/Hangman/assets/hangman1.png")); // NOI18N

        timerLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        timerLabel.setText("Timer: 120s");

        hangmanTxt.setFont(new java.awt.Font("PT Sans Narrow", 1, 48)); // NOI18N
        hangmanTxt.setText("Hangman");

        levelLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        levelLabel.setText("Level: 1");

        wordLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordLabel.setText("_ _ _ _ _ _ _ _ _ ");
        wordLabel.setToolTipText("");

        inputField.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFieldActionPerformed(evt);
            }
        });

        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        quit.setText("QUIT");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        numLetters.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        numLetters.setText("Number of Letters: ");

        ScoreLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        ScoreLabel.setText("Score:");

        triesLeft.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        triesLeft.setText("Tries Left: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(hangmanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numLetters)
                                        .addComponent(triesLeft))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(hangmanTxt)
                                .addGap(58, 58, 58)
                                .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(displayFind, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hangmanTxt)
                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hangmanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreLabel))
                .addGap(27, 27, 27)
                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(displayFind, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitBtn)
                                .addGap(30, 30, 30)
                                .addComponent(quit))
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(triesLeft)
                        .addGap(13, 13, 13)
                        .addComponent(numLetters)
                        .addGap(73, 73, 73))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        
        String input = inputField.getText().toLowerCase(); // gets the inputed letter and changes it to lower case
        inputField.setText(""); // clears the text bos
        
        if (input == "") {
            displayFind.setText("Not Found!"); // if nothing was typed displays a message
        } else {
            
            if (input.length() == 1) { // if 1 letter is typed
                inputLetter = input.charAt(0); // turns into a char
                boolean letterPresent = logic.letterCheck(inputLetter, chosenWord); // uses letter check to see if the letter is present
        
                if (letterPresent == true) { // if the char is present in the word

                    displayFind.setText("Found!"); // displays found
                    String newOut = logic.decoder(encodedWord, chosenWord, inputLetter); // decoders the letter and adds it to the display
                    wordLabel.setText(newOut); // displays new result
                    encodedWord = newOut;

                    if (newOut.equalsIgnoreCase(chosenWord)) { // the encoded word equals the chosenWord
                        score = score + (chosenWord.length()*100); // updates score
                        ScoreLabel.setText("Score: " + score);
                        levelUp(); // calls level up method to generate a new word
                    }

                } else { // if char not present
                    displayFind.setText("Not Found!"); // displays not found
                    tries--;
                    triesLeft.setText("Tries Left: " + tries); // updates tries

                    setDisplay(tries); // calls setDisplay method to update hangman 

                    if (tries == 0) {
                        ending(); // ends the game
                    }

                }
            } else {
                displayFind.setText("1 Letter Only"); // tells user to only use 1 letter
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFieldActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0); // exits the system
    }//GEN-LAST:event_quitActionPerformed
    
    public static void main(String args[]) {
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
             
                
                new PlayingScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel displayFind;
    private javax.swing.JLabel hangmanLabel;
    private javax.swing.JLabel hangmanTxt;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel numLetters;
    private javax.swing.JButton quit;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel triesLeft;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
