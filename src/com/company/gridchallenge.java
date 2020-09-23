package com.company;

import java.util.*;

public class gridchallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            char [][]c=new char[n][n];
            for (int i = 0; i < n; i++) {
                c[i]=sc.next().toCharArray();
                Arrays.sort(c[i]);
            }
            boolean ans=true;
            for (int i = 0; i <n-1 ; i++) {
                for (int j = 0; j <c[i].length ; j++) {
                    if ((int) c[i][j] > (int) c[i + 1][j]) {
                        ans = false;
                        break;
                    }
                }

            }
            if(ans)
                System.out.println("YES");
            else
                System.out.println("NO");

        }



    }
}
