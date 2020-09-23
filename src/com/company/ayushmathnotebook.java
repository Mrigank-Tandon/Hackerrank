package com.company;

import java.util.*;

public class ayushmathnotebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a =new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int noofpage=0;
        int ans=0;

        for (int value : a) {
            noofpage++;
            for (int i = 1; i <=value ; i++) {
                if(i==noofpage)
                    ans++;
                if(i%k==0 && i!=value)
                    noofpage++;
            }


        }
        System.out.println(ans);


    }
}
