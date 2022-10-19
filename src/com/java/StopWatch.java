package com.java;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    public static void main(String[] args){
        //long startTime =System.currentTimeMillis();
       // long endTime =System.currentTimeMillis();
        Instant start = Instant.now();

        System.out.println("start time : "+ (start));
        int a=3,b=4;
        int sum=a+b;
        System.out.println("sum is : "+sum);
        Instant end = Instant.now();

        System.out.println("end time : "+ (end));
     //   Long elapsedTime = (endTime-startTime);
        Duration elapsedTime = Duration.between(start, end);
        System.out.println("elapsedTime : "+ elapsedTime);

    }
}
