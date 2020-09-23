package com.company.Recursion;

import java.util.*;

public class panagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        HashSet<Character>hashSet=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' ')
            hashSet.add(s.charAt(i));
        }
        if(hashSet.size()==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");






        }
    }

