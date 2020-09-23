package com.company.DataStructure;

import java.util.*;

public class leftrotation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, k ,q;
        n = in.nextInt();
        k = in.nextInt();
//        q = in.nextInt();

        int[] arr = new int[n];
        for(int i=n-1; i>=0; i--) {
            arr[(i+k)%n] = in.nextInt();
        }

//        for(int i=0; i<q; i++) {
//            System.out.println(arr[in.nextInt()]);
//        }
        for (int i = n-1; i>=0 ; i--) {
            System.out.print(arr[i]+" ");
        }


    }
}
