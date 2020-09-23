package com.company;

import java.util.*;

public class flatlandandspacestation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int distance = 0;
        for (int i = 0; i < n; i ++){
            int temp = Math.abs(i - c[0]);
            for (int j = 0; j < m; j++){
                temp = Math.min(temp, Math.abs(i - c[j]));
            }
            distance = Math.max(distance, temp);
        }
        System.out.println(distance);
    }
}
