package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

import java.util.Arrays;

public class Solution {
    public static void processThreads(Thread... threads) {
        Arrays.stream(threads)
                .forEach((thread) -> {
                    switch (thread.getState()) {
                        case NEW:
                            thread.start();
                            break;
                        case WAITING:
                        case TIMED_WAITING:
                        case BLOCKED:
                            thread.interrupt();
                            break;
                        case RUNNABLE:
                            thread.isInterrupted();
                            break;
                        case TERMINATED:
                            System.out.println(thread.getPriority());
                    }
                });
    }

    public static void main(String[] args) {
    }
}
