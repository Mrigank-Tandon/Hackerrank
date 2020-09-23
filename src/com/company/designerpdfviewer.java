package com.company;

import java.util.*;

public class designerpdfviewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c[]=new int[26];
        for (int i = 0; i < c.length; i++) {
            c[i]=sc.nextInt();
        }
        String s=sc.next();
        int max=0;
        for (int i = 0; i <s.length() ; i++) {
            char v=s.charAt(i);
            int l=(int)v-97;
            if(c[l]>max){
                max=c[l];
            }
        }
        System.out.println(max*s.length());


    }
}
