package com.company;

import java.util.*;

public class minimumdistence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        HashMap<Integer, Integer>map=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            if(map.containsKey(a[i])){
                if(i-map.get(a[i])<min){
                    min=i-map.get(a[i]);
                }
            }
            else{
                map.put(a[i],i);
            }
        }
        System.out.println(min);
    }
}
