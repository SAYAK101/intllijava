package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binarySearch {

       static int BinarySearch(int[] a, int x,int left,int right) {
            int mid=left+((right-left)/2);
            //System.out.println("key recieved:"+x+" mid:"+mid);
            while(left<=right)
            {
            if(a[mid]==x){
                //System.out.println("key found:"+mid);
                return mid;
            }
            else if(a[mid]>x){
                //System.out.println("jumping LEFT:");
                //right = mid - 1;
                return BinarySearch(a,x,left,mid-1);
            }
            else{
                //System.out.println("jumping RIGHT:");
                //left=mid+1;
                return BinarySearch(a,x,mid+1,right);
            }
            }
           //System.out.println("key not found:");
            return -1;
       }

       public static void main(String[] args) {
            FastScanner scanner = new FastScanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();

            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                //replace with the call to binarySearch when implemented
                int left=0,right=a.length-1;
                //System.out.println("key now:"+b[i]);
                //System.out.println("array a:"+a);
                System.out.print(BinarySearch(a, b[i],left,right) + " ");
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

/*
 5 1 5 8 12 13
 5 8 1 23 1 11
 */