/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPages;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Dharam
 */
public class SessionOneMathPage extends javax.swing.JFrame {

    /**
     * Creates new form SessionOneMatchPage
     */
    int secondsLeft = 10;
    public Timer timer;
    public TimerTask timerTask;
    int problemCounter = 0;
    
    String[] questionSet = new String[]
        {"14*6-17", "17*6-19", "13*7-15", "23*9-19", "37*6-23", "26*8-29", 
        "16*7-17", "27*8-19", "33*7-13","28*9-15", "19*7-17", "17*8-19", 
        "22*6-13", "14*7-15", "18*5-19", "31*7-19", "13*8-17", "23*7-13", 
        "17*6-17", "37*3-13", "18*9-19", "26*7-15", "13*9-17", "29*4-19"};

    public SessionOneMathPage() {
        initComponents();
        //generateProblem();
        displayProblem(problemCounter);
        startTaskTimer();
        //startTimer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        taskTimerText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNumber = new javax.swing.JLabel();
        firstOperator = new javax.swing.JLabel();
        secondNumber = new javax.swing.JLabel();
        secondOperator = new javax.swing.JLabel();
        thirdNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answerTextBox = new javax.swing.JTextField();
        questionText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Second left");

        taskTimerText.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        taskTimerText.setText("00");

        jLabel3.setText("Please select the correct answer within 10 seconds:");

        firstNumber.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        firstNumber.setText("AA");

        firstOperator.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        firstOperator.setText("OO");

        secondNumber.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        secondNumber.setText("AA");

        secondOperator.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        secondOperator.setText("OO");

        thirdNumber.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        thirdNumber.setText("AA");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setText("=");

        questionText.setText("Question comes here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(588, 588, 588)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstOperator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secondOperator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thirdNumber)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                        .addComponent(taskTimerText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(362, 362, 362))))
            .addGroup(layout.createSequentialGroup()
                .addGap(614, 614, 614)
                .addComponent(questionText)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(taskTimerText)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thirdNumber)
                        .addComponent(secondOperator)
                        .addComponent(secondNumber)
                        .addComponent(firstOperator)
                        .addComponent(firstNumber)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(answerTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(questionText)
                .addContainerGap(159, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(SessionOneMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SessionOneMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SessionOneMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SessionOneMathPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SessionOneMathPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerTextBox;
    private javax.swing.JLabel firstNumber;
    private javax.swing.JLabel firstOperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel questionText;
    private javax.swing.JLabel secondNumber;
    private javax.swing.JLabel secondOperator;
    public static javax.swing.JLabel taskTimerText;
    private javax.swing.JLabel thirdNumber;
    // End of variables declaration//GEN-END:variables

    private void startTaskTimer() {
        System.out.println("Timer task started");

        timer = new Timer();
        timerTask = new TimerTask() {
            public void run() {
                secondsLeft--;
                if (secondsLeft < 1) {
                    System.out.println("Before timer cancel");
                    timer.cancel();
                    System.out.println("Timer cancelled");
                    secondsLeft = 10;
                    System.out.println("Seconds left reset");   
                    //generateProblem();
                    problemCounter++;
                    if (problemCounter < questionSet.length){
                    
                    displayProblem(problemCounter);
                    System.out.println("Problem regenerated");
                    startTaskTimer();
                    } else {
                    
                        System.out.println("Problem set maxed out. Cannot display any more questions");
                    }
                    
                    //startTimer();
                       

                } else {

                    //set text for timer here
                    taskTimerText.setText(String.valueOf(secondsLeft + 1));

                }

            }
        };
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);
    }

    public void startTimer() {
        System.out.println("Inside on start");
        timer.scheduleAtFixedRate(timerTask, 1000, 1000);
    }

    private String generateRandomNumbers() {

        int max = 50;
        int min = -5;

        Random rand = new Random();

        int n = rand.nextInt((max - min) + 1) + min;

        return String.valueOf("(" + n + ")");
    }

    private String generateRandomOperators() {

        String[] operators = new String[]{"+", "-", "X"};

        int max = 3;
        int min = 1;

        Random rand = new Random();

        int random = rand.nextInt((max - min) + 1) + min;

        return String.valueOf(operators[random - 1]);
    }

    private void generateProblem() {

        firstNumber.setText(generateRandomNumbers());
        firstOperator.setText(generateRandomOperators());
        secondNumber.setText(generateRandomNumbers());
        secondOperator.setText(generateRandomOperators());
        thirdNumber.setText(generateRandomNumbers());

    }
    
    private void displayProblem(int i){
    
        questionText.setText(questionSet[i]);
        
    }

}
