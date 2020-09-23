package com.company;

import java.util.*;

public class cavitymap {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        char [][]charArray = new char[n][n];

        for (int i = 0; i < n; i++)
        {
            String lines = in.next();
            charArray[i] = lines.toCharArray();
        }

        for (int i = 1; i < n-1; i++)
        {
            for(int j = 1; j < n-1; j++)
            {
                if((charArray[i][j] > charArray[i-1][j]) && (charArray[i][j] > charArray[i+1][j]) && (charArray[i][j] > charArray[i][j-1]) && (charArray[i][j] > charArray[i][j+1]))
                    charArray[i][j] = 'X';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(charArray[i][j]);
            }
            System.out.println();

        }

    }
}
