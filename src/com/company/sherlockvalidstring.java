package com.company;

import java.util.*;

public class sherlockvalidstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[]c=sc.next().toCharArray();

        sc.close();
        HashMap<Character,Integer>count=new HashMap<>();
        for (char i : c) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }


        }

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (Map.Entry mapElement : count.entrySet()) {

           arrayList.add((int)mapElement.getValue());







        }
        HashMap<Integer,Integer>count1=new HashMap<>();
        for (int i :arrayList ) {
            if (count1.containsKey(i)) {
                count1.put(i, count1.get(i) + 1);
            } else {
                count1.put(i, 1);
            }


        }
        int flag=0;
        System.out.println(count1);
        for (Map.Entry mapElement : count1.entrySet()) {

           if((int)mapElement.getValue()==1&&(int)mapElement.getKey()
           <=3){
               flag=1;
           }








        }
        if(flag==1)
        System.out.println("YES");
        else
            System.out.println("NO");



    }
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//
//        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
//        for (char i : s.toCharArray()) {
//            if (!h.containsKey(i)) {
//                h.put(i, 0);
//            }
//            h.put(i, h.get(i) + 1);
//        }
//
//        boolean isValid = true;
//        int n = h.get(s.charAt(0));
//        for (int i : h.values()) {
//            if (i != n) {
//                isValid = false;
//            }
//        }
//
//        if(isValid){
//            System.out.println("YES");
//            return;
//        }
//
//
//        for (int i = 0; i < s.length(); i++) {
//            isValid = true;
//            h.put(s.charAt(i), h.get(s.charAt(i)) - 1);
//            n = h.get(s.charAt(0));
//            for (int t : h.values()) {
//                if (t != n && t > 0) {
//                    isValid = false;
//                }
//            }
//            h.put(s.charAt(i), h.get(s.charAt(i)) + 1);
//
//            if(isValid){
//                System.out.println("YES");
//                return;
//            }
//        }
//
//        System.out.println("NO");
//    }
}
