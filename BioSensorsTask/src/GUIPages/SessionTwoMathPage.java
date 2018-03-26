/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPages;

import static GUIPages.SessionOneMathPage.taskTimerText;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Dharam
 */
public class SessionTwoMathPage extends javax.swing.JFrame {

    /**
     * Creates new form SessionTwoMathPage
     */
    
    int secondsLeft = 10;
    public Timer timer;
    public TimerTask timerTask;
    int problemCounter = 0;
    
    String answerString = "Your answer";
    Color[] answerColors = new Color[]{Color.red, Color.CYAN, Color.BLUE, Color.PINK, Color.orange, Color.MAGENTA, 
        Color.red, Color.CYAN, Color.BLUE, Color.PINK, Color.orange, Color.MAGENTA, 
        Color.red, Color.CYAN, Color.BLUE, Color.PINK, Color.orange, Color.MAGENTA,
        Color.red, Color.CYAN, Color.BLUE, Color.PINK, Color.orange, Color.MAGENTA};
    
    
    public SessionTwoMathPage() {
        initComponents();
        mathTwoTimer.setText(String.valueOf(secondsLeft));
        changingNumber.setForeground(Color.BLACK);
        startTaskTimer();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changingNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        changingAnswer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mathTwoTimer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changingNumber.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        changingNumber.setText("2549");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setText("-");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel3.setText("13");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel4.setText("=");

        changingAnswer.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        changingAnswer.setText("Keep this result in mind");

        jLabel1.setText("<html>In this task, you will ten sesonds to perform the following substraction. <br>In each round, keep your resulting answer in mind, and subtract 13 from your answer till the task is completed.</br></html>");

        mathTwoTimer.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        mathTwoTimer.setText("00");

        jLabel6.setText("seconds left");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(761, 761, 761)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changingNumber)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(changingAnswer)))
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mathTwoTimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mathTwoTimer)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changingNumber)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(changingAnswer))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SessionTwoMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SessionTwoMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SessionTwoMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SessionTwoMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SessionTwoMathPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changingAnswer;
    private javax.swing.JLabel changingNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel mathTwoTimer;
    // End of variables declaration//GEN-END:variables


private void startTaskTimer() {
        System.out.println("Timer task started");

        timer = new Timer();
        timerTask = new TimerTask() {
            public void run() {
                mathTwoTimer.setText(String.valueOf(secondsLeft));
                secondsLeft--;
                System.out.println("Before checking timer: " + String.valueOf(secondsLeft));
                if (secondsLeft <= 0) {
                    System.out.println("Before timer cancel: " + String.valueOf(secondsLeft));
                    timer.cancel();
                    System.out.println("Timer cancelled");
                    secondsLeft = 10;
                    System.out.println("Seconds left reset");   
                    //generateProblem();
                    problemCounter++;
                    if (problemCounter < answerColors.length){
                    
                    displayProblem(problemCounter);
                    System.out.println("Problem regenerated");
                    mathTwoTimer.setText(String.valueOf(secondsLeft));
                    startTaskTimer();
                    } else {
                    
                        System.out.println("Problem set maxed out. Cannot display any more questions");
//                        displayNextInstructionsText();
//                        questionText.setText("Task has been completed!");
//                        answerTextBox.setVisible(false);
//                        equalsText.setVisible(false);
                    }
                    
                    //startTimer();
                       

                } else {

                    //set text for timer here
                    System.out.println("After checking timer: " + String.valueOf(secondsLeft));
                    mathTwoTimer.setText(String.valueOf(secondsLeft));

                }

            }
        };
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);
    }


    private void displayProblem(int i){
        
        changingNumber.setText("Your answer");
        changingNumber.setForeground(answerColors[i]);
    
    
    }




}
