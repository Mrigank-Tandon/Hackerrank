package com.company;

import java.util.*;

public class rightarrayrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int n, k ,q;
        n = in.nextInt();
        k = in.nextInt();
        q = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[(i+k)%n] = in.nextInt();
        }
        for(int i=0; i<q; i++) {
            System.out.println(arr[in.nextInt()]);
        }

    }
}
