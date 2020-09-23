package com.company;

import java.util.*;

public class climbingleaderboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
       Set<Integer>a= new HashSet<>();
        for (int i = 0; i <s ; i++) {
         a.add(sc.nextInt());
        }
        int f=sc.nextInt();

        for (int i = 0; i <f ; i++) {
            int b=sc.nextInt();
           a.add(b);
            Integer[] arr =new Integer[a.size()];


            arr=a.toArray(arr);
            Arrays.sort(arr);
//            List<Integer> sourceList = Arrays.asList(arr);
            System.out.println(a.size()-Arrays.binarySearch(arr,b));
        }
    }
}
