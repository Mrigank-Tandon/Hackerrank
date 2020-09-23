package com.company;

import java.util.*;

public class runningalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int c=0;
        int temp,j;
        for (int i = 1; i <n ; i++) {
            temp=a[i];
            j=i-1;
            while(j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j--;
              c++;


            }
            a[j+1]=temp;

        }
        System.out.println(c);
    }
}
