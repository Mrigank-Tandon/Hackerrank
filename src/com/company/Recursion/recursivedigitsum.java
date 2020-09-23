package com.company.Recursion;

import java.util.*;

public class recursivedigitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();

        System.out.println(superDigit(s,k));


    }
    static int superDigit(String number, int k) {
        if (number.length() > 1)
        {
            long sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
                sum += Character.getNumericValue(number.charAt(i));
            }
            return superDigit(Long.toString(sum * k), 1);
        }
        else
            return Character.getNumericValue(number.charAt(0));




    }


}
