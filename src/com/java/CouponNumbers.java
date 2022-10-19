package com.java;

//a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
//need to generate a distinct coupon number? This program simulates this random
//process.
//b. I/P -> N Distinct Coupon Number
//c. Logic -> repeatedly choose a random number and check whether it's a new one.
//d. O/P -> total random number needed to have all distinct numbers.
//e. Functions => Write Class Static Functions to generate random numbers
// and to process distinct coupons.


import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {
        int randomCheck, i, count = 0;
        System.out.print("enter the no of coupons : ");
        Scanner sc = new Scanner(System.in);
        int max = 100, min = 1,k=0;
        int number = sc.nextInt();
        int[] couponArray = new int[number];
        System.out.println(couponArray.length);
        System.out.println("the coupon nos are : ");
        for (i = 0; i < couponArray.length; i++) {
            randomCheck = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(randomCheck);
            couponArray[i]=randomCheck;
        }
        System.out.println("coupons are : " );
        for (int j = 0; j < couponArray.length; j++) {
            System.out.println(couponArray[j]);
        }
    }
}