package com.company;

import java.util.*;

public class sherlocksqares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int numSquares = (int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);
            System.out.println(numSquares);
        }
        scan.close();
    }
}
