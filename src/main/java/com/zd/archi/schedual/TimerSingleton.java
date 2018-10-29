package com.zd.archi.schedual;

import java.util.Timer;

public class TimerSingleton {
	private static class TimerCreater {
        private static Timer timerSingleton = new Timer();
    }
 
    private TimerSingleton(){}
 
    public static Timer getTimerSingleton(){
        return TimerCreater.timerSingleton;
    }
}
