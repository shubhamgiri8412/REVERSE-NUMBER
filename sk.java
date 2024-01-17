package com.skprograming.ex;

import java.util.Scanner;

public class sk {
    public static int calculateSum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("="+sum);
    }
}
