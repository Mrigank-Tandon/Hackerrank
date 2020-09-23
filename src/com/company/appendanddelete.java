package com.company;

import java.util.*;

public class appendanddelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(canConvert(s, t, k) ? "Yes" : "No");
    }

    private static boolean canConvert(String s, String t, int k) {
        /* Case 1 */
        if (s.length() + t.length() <= k) {
            return true;
        }

        /* Case 2 */
        int i = 0; // represents index of 1st non-matching character
        for (   ; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int minOperations = (s.length() - i) + (t.length() - i);
        return k >= minOperations && (k - minOperations) % 2 == 0;
    }
}
