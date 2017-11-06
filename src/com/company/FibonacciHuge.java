package com.company;

import java.util.*;

    public class FibonacciHuge {
        private static long getFibonacciHuge(long n, long m) {
         /* algorithm
        𝐹[0] ← 0
        𝐹[1] ← 1
        for 𝑖 from 2 to 𝑛:
        𝐹[𝑖] ← 𝐹[𝑖 − 1] + 𝐹[𝑖 − 2]
        print(𝐹[𝑛] mod 10)
        */
        long remainder = n % get_pisano_period(m);
        long a,b,c=remainder;
        a=0;
        b=1;
        if(n<=1)
            return n;
        for(int i=1;i<remainder;i++){//reduced to find till the pattern for :mod 3 is remainder 8 ,:mod 2 is 3:remainder
            c=(a+b)%m;
            a=b;
            b=c;
         }
        return c%m;

        }
         static long get_pisano_period( long m) {
            long a = 0, b = 1, c=1;
            for (int i = 0; i < m * m; i++) {
                c = (a + b) % m;
                a = b;
                b = c;
                if (a == 0 && b == 1)
                    return i+1;
            }
            return c;//find the pattern this is when it starts from a=0 and b=1  01 being thw starting pattern
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            System.out.println(getFibonacciHuge(n, m));//281621358815590 30524
            // result 11963
        }
    }



