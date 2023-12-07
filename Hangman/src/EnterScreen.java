
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
File Name: EnterScreen
Programmer: Nelson Daniels
Date: June 3rd 2023
Description: Creates the start up screen of the game hangman. Is set as the main class of the project.
 */


public class EnterScreen extends javax.swing.JFrame {

    public EnterScreen() {
        initComponents();
        hangmanPNG.setIcon(new ImageIcon(new ImageIcon("assets/hangman7.png").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT))); // sets the background image
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hangmanTxt = new javax.swing.JLabel();
        hangmanPNG = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        credits = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hangman");

        hangmanTxt.setFont(new java.awt.Font("PT Sans Narrow", 1, 48)); // NOI18N
        hangmanTxt.setText("Hangman");

        hangmanPNG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hangmanPNG.setIcon(new javax.swing.ImageIcon("/Users/school/NetBeansProjects/Hangman/assets/hangman1.png")); // NOI18N
        hangmanPNG.setPreferredSize(new java.awt.Dimension(200, 200));

        startBtn.setFont(new java.awt.Font("PT Sans Narrow", 1, 18)); // NOI18N
        startBtn.setText("START");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        credits.setText("Created by Nelson Daniels V1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(hangmanTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(hangmanPNG, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(credits)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(hangmanTxt)
                .addGap(64, 64, 64)
                .addComponent(hangmanPNG, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(credits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        // creates a new instance of PlayingScreen and shows it
        PlayingScreen playingScreen = new PlayingScreen();
        playingScreen.show();
        
        dispose();
    }//GEN-LAST:event_startBtnActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel credits;
    private javax.swing.JLabel hangmanPNG;
    private javax.swing.JLabel hangmanTxt;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
