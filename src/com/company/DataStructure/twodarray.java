package com.company.DataStructure;

import java.util.*;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[6][6];
        for (int i = 0; i <6 ; i++)
            for (int j = 0; j <6 ; j++)
                a[i][j]=sc.nextInt();
        ArrayList<Integer>sum=new ArrayList<>();
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                sum.add(a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
            }

        }
        System.out.println(Collections.max(sum));





    }
}
