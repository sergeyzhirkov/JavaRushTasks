package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread target) {
        super();
        this.thread = target;
        setDaemon(true);
    }

    @Override
    public void run() {
        State currentState = null;
        while (!State.TERMINATED.equals(currentState)) {
            if (thread.getState() != currentState) {
                currentState = thread.getState();
                System.out.println(currentState);
            }
        }
    }
}
