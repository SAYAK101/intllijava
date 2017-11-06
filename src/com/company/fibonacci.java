package com.company;

import java.util.Scanner;

public class fibonacci {
    private static long calc_fib(int n) {
        int a,b,c=1;
        a=0;
        b=1;
        if(n<=1)
            return n;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
