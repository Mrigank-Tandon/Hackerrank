package com.company.Recursion;

import java.util.*;

public class PowerSum {
    static int c=0;
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(psum(x,n,1));


    }

    private static int psum(int x, int n ,int c) {
        if(Math.pow(c,n)<x){
           return psum(x, n, c + 1)+ psum(x - (int) Math.pow(c, n), n, c + 1);
        }
        else if((Math.pow(c,n)==x))
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
