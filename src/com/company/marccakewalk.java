package com.company;

import java.util.*;

public class marccakewalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long miles=0;
        for (int i = n-1,j=0; i >= 0; i--,j++) {
            miles+=Math.pow(2,j)*a[i];
        }
        System.out.println(miles);

    }
}
