package com.company;

import java.util.*;

public class superreduccedstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.nextLine());
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                s.delete(i-1,i+1);
                i=0;
            }
        }
        if(s.length()==0)System.out.println("Empty String");
        else
            System.out.println(s);
    }
}
