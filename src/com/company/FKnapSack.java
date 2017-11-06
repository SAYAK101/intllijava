package com.company;
import java.util.*;

public class FKnapSack {
    double weight[];
    double values[];
    double ratio[];
    double capacity;

    FKnapSack() {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the number of items in the store: ");
        int nItems = scan.nextInt();
        capacity= scan.nextDouble();
        //System.out.println("Enter the (weight and benefit) of items: ");
        weight = new double[nItems];
        values = new double[nItems];
        ratio = new double[nItems];

        for (int i = 0; i < nItems; ++i) {
            values[i] = scan.nextDouble();
            weight[i] = scan.nextDouble();
            ratio[i] = values[i] / weight[i];
        }

       // System.out.println("Enter the weight of the knapsack: ");

    }
    public static void main(String[] args) {
        FKnapSack fk = new FKnapSack();
        System.out.print(fk.fill());
    }
    double fill() {
        double cW = 0; //current weight
        double cB = 0; //current benefit

       // System.out.print("\nItems considered: ");
        while (cW < capacity) {
            int item = getNext();        //next highest ratio
            if (item == -1) {
                //No items left
                break;
            }

            //System.out.print((item+1)+" ");
            if (cW + weight[item] <= capacity) {
                cW += weight[item];
                cB += values[item];
                //mark as used for the getNext() (ratio) function
                ratio[item] = 0;
            } else {
                cB += (ratio[item] * (capacity - cW));
                cW += (capacity - cW);
                break;  //the knapsack is full
            }
        }
        return cB ;
    }
    int getNext() {
        double highest = 0;
        int index = -1;
        for (int i = 0; i < values.length; ++i) {
            if (ratio[i] > highest) {
                highest = ratio[i];
                index = i;
            }
        }
        return index;
    }

}