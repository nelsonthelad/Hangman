

/*
File Name: EndingScreen
Programmer: Nelson Daniels
Date: June 3rd 2023
Description: Responsible for the ending screen of the game. Displays the score, level, words made, and buttons to
restarts or quit.
 */

public class EndingScreen extends javax.swing.JFrame {

    // ints to store level and score
    int scoreTxt; 
    int levelTxt;
    
    public EndingScreen() {
        initComponents();
    }

    public void setScoreTxt(int score) {
        this.scoreTxt = score; // gets score from PlayingScreen
    }

    public void setLevelTxt(int level) {
        this.levelTxt = level; // gets level from PlayingScreen
    }

    public void getScores() {
       // displays the scores of the game
       score.setText("SCORE: " + scoreTxt);
       Level.setText("LEVEL: " + (levelTxt-1));
       wordsSolved.setText("WORDS SOLVED: " + (levelTxt-2));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        QUIT = new javax.swing.JButton();
        RESTART = new javax.swing.JButton();
        wordsSolved = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        skull = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("PT Sans Narrow", 1, 48)); // NOI18N
        title.setText("GAME OVER");

        score.setFont(new java.awt.Font("PT Sans Narrow", 0, 24)); // NOI18N
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("SCORE:");

        QUIT.setFont(new java.awt.Font("PT Sans Narrow", 1, 18)); // NOI18N
        QUIT.setText("QUIT");
        QUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUITActionPerformed(evt);
            }
        });

        RESTART.setFont(new java.awt.Font("PT Sans Narrow", 1, 18)); // NOI18N
        RESTART.setText("RESTART");
        RESTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTARTActionPerformed(evt);
            }
        });

        wordsSolved.setFont(new java.awt.Font("PT Sans Narrow", 0, 24)); // NOI18N
        wordsSolved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordsSolved.setText("WORDS SOLVED:");

        Level.setFont(new java.awt.Font("PT Sans Narrow", 0, 24)); // NOI18N
        Level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level.setText("LEVEL:");

        skull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skull.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wordsSolved, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(skull, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RESTART, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(score)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wordsSolved)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skull, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RESTART, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void QUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUITActionPerformed
        System.exit(0); // exits the game when pressed
    }//GEN-LAST:event_QUITActionPerformed

    private void RESTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTARTActionPerformed
        PlayingScreen playingScreen = new PlayingScreen(); // creates a new instance of PlayingScreen and shows it
        playingScreen.show();
        
        dispose();
    }//GEN-LAST:event_RESTARTActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndingScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Level;
    private javax.swing.JButton QUIT;
    private javax.swing.JButton RESTART;
    private javax.swing.JLabel score;
    private javax.swing.JLabel skull;
    private javax.swing.JLabel title;
    private javax.swing.JLabel wordsSolved;
    // End of variables declaration//GEN-END:variables
}
