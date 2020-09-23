package com.company;

import java.util.*;

public class beautifulbinary {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        String s=sc.next();
//        String s1="010";
//        int count =0;
//        for (int i = 0; i <= n-3; i++) {
//            if (s.substring(i,i+3).equals(s1)){
//                count++;
//            }
//        }
//        System.out.println(count);
        Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
          String s=sc.next();
        System.out.println((s.length()-s.replaceAll("010","").length())/3);

    }
}
