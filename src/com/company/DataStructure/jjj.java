package com.company.DataStructure;

import java.util.*;


public class jjj {

    static long birthday(int amount, int[] coins){
        long[] combinations = new long[amount + 1];

        combinations[0] = 1;

        for(int coin : coins){
            for(int i = 1; i < combinations.length; i++){
                if(i >= coin){
                    combinations[i] += combinations[i - coin];
                }
            }
        }
        return combinations[amount];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m];
        for(int i=0; i < m; i++){
            c[i] = sc.nextInt();
        }

        long ways = birthday(n, c);
        System.out.println(ways);
    }
}