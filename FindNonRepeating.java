package com.levelTw0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindNonRepeating {
    public void nonRepeat(String name){
        char[] ram=name.toCharArray();
        int len =ram.length;
       // int j=name.length()-1;
        char[] ans=new char[ram.length] ;
        System.out.println(Arrays.toString(ram));
        //System.out.println(ram[ram.length-1]);
        //System.out.println(ram[ram.length-2]);
        int count=0;
        for (int i =len-1; i >0; i--) {
            for (int k =i-1; k>0; k--) {
               // System.out.print(i+"i " +ram[i] +" ");
                //System.out.print(k+"k " +ram[k] + " ");
                if(ram[i]==ram[k]){
                    count++;
                }
               }
              if (count==0){
                  System.out.print("last non repeat element ="+ram[i]);
                  break;
              }
              count=0;
            }
        }


    public static void main(String[] args) {
        FindNonRepeating obj=new FindNonRepeating();
        String name="dhatchinamoorthi";
        obj.nonRepeat(name);


    }

}
