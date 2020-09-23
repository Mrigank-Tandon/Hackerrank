package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class bigsorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr =new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.next();
        }
        Arrays.sort(arr, (left, right) ->
        {
            /* If length of left != right, then return
               the diff of the length else  use compareTo
               function to compare values.*/
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }

}
