package com.company;
import java.util.*;

public class signatures {
    long[] end;
    //long[] copy;
    long[] start;
    ArrayList<Long> list1;

    private void optimalPoints() {
        //write your code here
        int counter = 1,i,j;
        System.out.println("Going in while loop");
        int item = getit();
        list1 = new ArrayList<>(counter);
        while (item != -1) {

            for (i=0;i<start.length;i++)
            {
                System.out.println("inside while>>for");
                if(i==item)
                    continue;
                else if(start[i]>end[item])
                {
                    System.out.println("inside while>>for>>else if 1");
                    counter++;
                   // System.out.println("before"+end[item]);
                    list1.add(end[item]);
                    start[item]=0;
                    end[item]=Integer.MAX_VALUE;

                    System.out.println("Calling getit() ");
                    item=getit();

                }
                else if(start[i]<=end[item] && i<start.length-1)
                {
                    System.out.println("inside while>>for>>else if 2 "+end[item]+" start[i]"+start[i]+" i "+i);
                    if (start[i]==end[item])
                    {
                        end[item]=end[item]+1;
                        System.out.println("inside while>>for>>else if >> if end[item]"+end[item]);
                    }
                    continue;
                }
                else
                {
                    System.out.println("inside while>>for>>else");
                    list1.add(end[item]);
                    //end[item]=Integer.MAX_VALUE;
                    item=-1;
                    //break;
                }


            }
            //System.out.println("Calling getit()");

            }
            System.out.println(counter);
        for (i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }

        }



    signatures() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        start = new long[n];
        end = new long[n];
        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextInt();
            end[i] = scanner.nextInt();
        }
        //copy=end;

    }


    public static void main(String[] args) {

        signatures sig = new signatures();
        sig.optimalPoints();

    }

    int getit() {
        double lowest = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < start.length; i++) {
            if (end[i] < lowest) {
                lowest = end[i];
                index = i;
             }
         }
        return index;
    }
}

