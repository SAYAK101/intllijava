package com.company;

import java.util.*;

    public class dotMAXproduct {
        private static long maxDotProduct(long[] a, long[] b) {
            long result = 0;
            int n=a.length;
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<n;i++){
                //System.out.print("Array A:"+a[i]+"\t\t Array B:"+b[i]);
                result+=(a[i]*b[i]);
                //System.out.println();
            }
            /*while(n!=0){
            int max_index1 = -1;
            for (int i = 0; i < n; ++i) {
                if ((max_index1 == -1) || (a[i] > a[max_index1]))
                    max_index1 = i;
            }
            int max_index2 = -1;
            for (int i = 0; i < n; ++i) {
                if ((max_index2 == -1) || (b[i] > b[max_index2]))
                    max_index2 = i;
            }
            System.out.println("BEfore:"+result+"Array A MAX:"+a[max_index1]+" Array B Max"+b[max_index2]);
            result=(a[max_index1]*b[max_index2])+result;
            System.out.println("After:"+result);
            a[max_index1]=-Integer.MIN_VALUE;
            b[max_index2]=Integer.MIN_VALUE;
            n--;
            }*/

            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }

            System.out.println(maxDotProduct(a, b));
        }
    }
/*

3
1 3 -5
-2 4 1

*/


