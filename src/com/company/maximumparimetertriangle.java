package com.company;

import java.util.*;

public class maximumparimetertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Long[] a =new Long[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);long peri=0;
        long x=0;
        long y=0;
        long z=0;
        for (int i = 0; i <n-2 ; i++) {
            if(a[i] + a[i+1] > a[i+2] && a[i+1] + a[i+2] > a[i] && a[i+2] + a[i] > a[i+1]){
                long peri1 = a[i] + a[i + 1] + a[i + 2];
                if(peri1 >peri){
                    peri= peri1;
                    x=a[i];
                    y=a[i+1];
                    z=a[i+2];

                }
            }
        }
        if(peri!=0)
        System.out.println(x+" "+y+" "+z);
        else
            System.out.println("-1");
    }
}
