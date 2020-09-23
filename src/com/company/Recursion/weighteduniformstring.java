package com.company.Recursion;

import java.util.*;

public class weighteduniformstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char[] c =s.toCharArray();
        Arrays.sort(c);
        HashMap<Character, Integer>hashMap=new HashMap<>();
        for (char i:c
             ) {
            if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+(int)i-96);
            }
            else{
                hashMap.put(i,(int)i-96);
            }
        }
        System.out.println(hashMap);
        int[] q =new int[5];
        for (int i = 0; i <q.length ; i++) {
            q[i]=sc.nextInt();

        }
        for (Map.Entry mapElement : hashMap.entrySet()) {
            int key = (int) mapElement.getKey();

            // Add some bonus marks
            // to all the students and print it
            int value = (int)mapElement.getValue() ;




        }


    }
}
