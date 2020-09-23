package com.company.Recursion;

import java.util.*;

public class marsexploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) count++;
        }
        System.out.println(count);

    }
}
