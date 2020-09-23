package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;


/* Name of the class has to be "Main" only if the class is public. */
class chefandwork
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int n,k;
        while(t-->0)
        {
            int f=0;

            n = sc.nextInt();
            k = sc.nextInt();
            int x=k;
            int[] ar =new int[n];
            for( int i=0;i<n;i++)
                ar[i]=sc.nextInt();
            int count=0;
            try{
                //Your Solve
                for(int i=0;i<n;i++)
                {
                    k=k-ar[i];
                    if(k>0 && i==n-1)
                    {
                        count++;
                        break;
                    }
                    else if(k>0 && ar[i+1]>k)
                    {
                        count++;
                        k=x;
                    }
                    else if(k==0)
                    {
                        count++;
                        k=x;
                    }
                    if(k<0)
                    {
                        f=-1;
                        break;
                    }

                }
                if(f ==-1)
                    System.out.println(-1);
                else
                    System.out.println(count);

            }catch(Exception e){
                return;
            }

        }
    }
}
