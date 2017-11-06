package com.company;

import java.util.Scanner;

public class MoneyChange {

    private static int getChange(int m) {
        int c=0;
        if (m%10>=0){
            c=m/10+c;
            m=m%10;
            if(m%5>=0){
                c=m/5+c;
                m=m%5;
                if(m%1>=0){
                    c=m/1+c;
                    }
            }
        }
            return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}
