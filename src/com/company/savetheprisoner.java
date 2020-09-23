package com.company;

import java.util.*;

public class savetheprisoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            int last = ((m-1) + (s-1)) % n+1 ;
            System.out.println(last);
        }

    }
}
