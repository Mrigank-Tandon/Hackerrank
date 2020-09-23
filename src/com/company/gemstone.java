package com.company;

import java.util.*;

public class gemstone {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Set<Character> set = convertToSet(scan.next());
        for(int i=1; i<t ;i++){
            set.retainAll(convertToSet(scan.next()));
        }
        System.out.print(set.size());
    }
    public static Set<Character> convertToSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray())
            set.add(c);
        return set;
    }
}
