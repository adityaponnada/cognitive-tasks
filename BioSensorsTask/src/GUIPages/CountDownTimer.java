/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPages;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Dharam
 */
public class CountDownTimer {
    
    int secondsLeft = 10;
    
    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask(){
    public void run(){
    secondsLeft --;
    if (secondsLeft < 0){
    timer.cancel();
    
    //System.out.println("Time Left: 0");
    
    } else {
    
    System.out.println("Time Left: " + getTimeLeft());
    
    
    }
    }
    };
    
    //timer.scheduleAtFixedRate(timerTask, 1000, 1000);
    public void start(){
       System.out.println("Inside on start");
    timer.scheduleAtFixedRate(timerTask, 1000, 1000);
    }
    
    public String getTimeLeft(){
    
        //System.out.println(String.valueOf(secondsLeft));
        return String.valueOf(secondsLeft);
        
    }

    
    
}
