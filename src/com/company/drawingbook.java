package com.company;

import java.util.*;

public class drawingbook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(Math.min(p/2,n/2-p/2));



    }
}
