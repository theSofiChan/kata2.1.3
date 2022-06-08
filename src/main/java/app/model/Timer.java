package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    public Timer getTimer() {
        return timer;
    }

    private Timer timer;
    private Long nanoTime = System.nanoTime();

    @Autowired
    public Long getTime() {
        return nanoTime;
    }



}
