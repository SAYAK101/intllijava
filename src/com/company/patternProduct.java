package com.company;

import java.util.Scanner;

public class patternProduct {
    public static void main(String[] args) {
        int n,sum=0,pos=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        while(pos!=n)
        {
            for(int i=pos;i<n;i++){
                for(int j=pos;j<=i;j++)
                {
                    sum+=(a[j]*a[i]);
                    System.out.print("\t\t"+a[j]+"*"+a[i]);
                }
                System.out.println();
            }
                pos++;
        }
        System.out.println("Ans:"+sum);
        //diamond pattern starts from here
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++)
                System.out.print(" ");
            for(int k=n;k>i;k--)
                System.out.print("K");
            for(int p=i+1;p<=n-1;p++)
                System.out.print("P");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j>=1;j--)
                System.out.print(" ");
            for(int p=n-1;p>=i+1;p--)
                System.out.print("p");
            for(int k=i;k<n;k++)
                System.out.print("k");

            System.out.println();
        }

    }
}
