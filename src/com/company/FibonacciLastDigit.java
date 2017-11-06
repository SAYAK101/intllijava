package com.company;
import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        long f[] =new long[n];
        f[0]= 0;
        f[1]=1;
        /*
        𝐹[0] ← 0
        𝐹[1] ← 1
        for 𝑖 from 2 to 𝑛:
        𝐹[𝑖] ← 𝐹[𝑖 − 1] + 𝐹[𝑖 − 2]
        print(𝐹[𝑛] mod 10)
        */

       // n=n+1;
        for (int i = 2; i <n; ++i) {
            f[i]=(f[i-1]+f[i-2]);
            //System.out.println(f[i]%10);
            f[i]%=10;
        }

        return f[n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n+1);
        System.out.println(c);
    }
}

