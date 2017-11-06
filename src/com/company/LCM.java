package com.company;

import java.util.*;

public class LCM {
    private static long gcd(long a, long b) {
        if(b!=0) {
            a=a % b;
            return gcd(b,a);
        }
        return a;
    }
    private static long lcm(long a, long b) {
        long res;
        res=(a*b)/gcd(a,b);
        return res;//28851538 1183019
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(lcm(a, b));
    }
}
