package com.company;
import java.util.*;
public class ArrayListss {
    ArrayList<Long> Start;
    ArrayList<Long> end;
    ArrayList<Long> list1;

    public static void main(String[] args) {
        ArrayListss ss=new ArrayListss();
        ss.optimal_points();
    }
    ArrayListss()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Start=new ArrayList<>(n);
        end=new ArrayList<>(n);
        for (int i=0;i<n;i++)
        {
            Long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            Start.add(a);
            end.add(b);
        }

    }
    int getit() {
        double lowest = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < Start.size(); i++) {
            Long a=end.get(i);
            if (a < lowest) {
                lowest = a;
                index = i;
            System.out.println(end.get(i)+" low"+lowest);
            }
        }
        return index;
    }
    void optimal_points() {
        int item=0,counter=1;
        list1 = new ArrayList<>(counter);
        while(item!=-1) {
            item = getit();
            Long a, b, c;
            b = end.get(item);
            list1.add(b);
            System.out.println("DELETING Start"+Start.get(item)+" End"+end.get(item));
            end.remove(item);
            Start.remove(item);


            int i = 0;
            while (Start.size() > 0 && end.size() > 0 && i>=0) {

                a = Start.get(i);
                c = end.get(i);
               System.out.println("b:"+b+" a:"+a+" c:"+c);
                if (a <= b && b <= c) {
                    System.out.println("DELETING Start in"+Start.get(i)+" End in"+end.get(i));
                    Start.remove(i);
                    end.remove(i);
                    System.out.println(Start);
                    System.out.println(end);
                    if(end.size()==0)
                        item=getit();
                    i--;
                }
                else if(a>b)
                {
                    item=getit();
                    break;
                }
                   i++;
           }
            if(end.size()==0)
                item=getit();
        }
        System.out.println(list1.size());
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }


    }
}

