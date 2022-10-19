package com.java;

//Just like the Armstrong number, the Perfect Number is also a special type of
//positive number. When the number is equal to the sum of its positive divisors
//excluding the number, it is called a Perfect Number. For example, 28 is the perfect
//number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7
//c. 28 = 28

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Divisors are  : ");

        for(int i=1;i<number;i++){
            if(number%i== 0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        if(sum==number)
            System.out.println(number+" is a perfect number because sum of divisors equal to "+number);
        else
            System.out.println(number+" is not a perfect number because sum of divisors not equal to "+number);
    }
}