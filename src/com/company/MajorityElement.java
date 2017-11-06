package com.company;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        int m = -1;

        // initialize counter i with 0
        int i = 0;

        // do for each element A[j] of the array
        for (int j = 0; j < a.length; j++)
        {
            // If the counter i becomes 0, we set the current candidate
            // to A[j] and reset the counter to 1
            if (i == 0)
            {
                m = a[j];
                i = 1;
            }

            // If the counter is not 0, we increment or decrement the counter
            // according to whether A[j] is the current candidate
            else if (m == a[j])
                i++;
            else
                i--;
        }

        return m;
        //write your code here
        //return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}


