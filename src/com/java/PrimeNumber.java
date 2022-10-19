package com.java;

//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int flag = 0;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if((number==1)||(number==0))
            System.out.println("Number is neither prime nor composite number");

        else if(flag!=1)
            System.out.println("Number is prime number");
        else
            System.out.println("Number is composite number");

    }
}
