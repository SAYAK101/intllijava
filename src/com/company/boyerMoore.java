package com.company;
import java.util.HashMap;
import java.util.Map;


public class boyerMoore {
       // Function to return majority element present in given array
        public static int majorityElement(int A[])
        {
            // m stores majority element (if present)
            int m = -1;

            // initialize counter i with 0
            int i = 0;

            // do for each element A[j] of the array
            for (int j = 0; j < A.length; j++)
            {
                // If the counter i becomes 0, we set the current candidate
                // to A[j] and reset the counter to 1
                if (i == 0)
                {
                    m = A[j];
                    i = 1;
                }

                // If the counter is not 0, we increment or decrement the counter
                // according to whether A[j] is the current candidate
                else if (m == A[j])
                    i++;
                else
                    i--;
            }

            return m;
        }

        // main function
        public static void main (String[] args)
        {
            // Assumtion - valid input (majority element is present)
            int arr[] = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };

            System.out.println("Majority element is " + majorityElement(arr));
        }
    }

