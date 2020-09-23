package com.company;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            if(s.length()%2==0){
                String a=s.substring(0,s.length()/2);
                String b=s.substring(s.length()/2);
                char []c=a.toCharArray();
                int count=0;
                for (char i:c
                     ) {
                    int index=b.indexOf(i);
                    if(index==-1){
                        count++;
                    }
                    else{
                        b = b.substring(0,index)+b.substring(index+1);
                    }
                }
                System.out.println(count);
            }
            else{
                System.out.println("-1");
            }
        }

    }
}
