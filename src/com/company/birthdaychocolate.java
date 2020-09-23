package com.company;

import java.util.*;

public class birthdaychocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int total=0;
        for (int i=0;i<=n-m;i++){
            if(Arrays.stream(a, i, i+m).sum() == d)
                total++;
        }
        System.out.println(total);




    }
}
