package com.company;

import java.util.*;

public class beautifultriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int d    = scan.nextInt();

        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int num = scan.nextInt();
            if (set.contains(num - d) && set.contains(num -2* d)) {
                count++;
            }
            set.add(num);
        }

        scan.close();
        System.out.println(count);
    }
}
