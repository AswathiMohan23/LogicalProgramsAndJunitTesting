package com.java;
//In Java, we can reverse a number either by using for loop, while loop, or using recursion.
//The simplest way to reverse a number is by using for loop or while loop. In order to
//reverse a number, we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into
//it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        int reverse = 0,remainder;
        System.out.println("enter a number : ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while (number != 0) {                        //first iteration==> number=123
            remainder = number % 10;                  //reminder=(number%10)= 123%10 = 3
            reverse = reverse * 10 + remainder;         //reverse=0*10+3=3 (in first iteration reverse =0)
            number = number / 10;                    //number=123/10=12
        }
        System.out.println("Reversed no = " + reverse);
    }
}
