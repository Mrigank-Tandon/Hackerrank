package com.company;

import java.util.*;

public class servicelane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int [n];
        for (int i = 0; i <a.length ; i++) {
            a[i]=sc.nextInt();
        }
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();

            int min=Integer.MAX_VALUE;
            for (int i = x; i <=y ; i++) {

                if(a[i]<min)
                    min=a[i];
            }
            System.out.println(min);
        }

    }
}
