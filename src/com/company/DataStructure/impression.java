package com.company.DataStructure;

import java.util.*;

public class impression {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();




        System.out.println(impression1(n));



    }
    public static int impression1(int n){
        int temp=n;
        int sum=0;


        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        if(sum>9){
            sum+=impression1(sum);
        }
        return sum;

    }
}
