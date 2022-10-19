package com.java;

//Fibonacci series is a special type of series in which the next term is the sum of the
//previous two terms. For example, if 0 and 1 are the two previous terms in a series,
// then the next term will be 1(0+1).
//eg : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,.

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args){
        int firstNo=0,secondNo=1,result;
        System.out.println("enter the nth number : ");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println("Fibonacci series : ");
        System.out.println(firstNo);
        System.out.println(secondNo);
        for(int i=0;i<=number;i++){
            result=firstNo+secondNo;
            System.out.println(result);
            firstNo=secondNo;
            secondNo=result;
        }


    }
}
