package com.levelTw0;

import java.util.Arrays;

public class SwapCornerWords {
    public StringBuilder swap(String words) {
        String[] convert = words.split(" ");
        System.out.println(Arrays.toString(convert));
        System.out.println(convert.length);

        StringBuilder bild=new StringBuilder();

        for (int i = convert.length-1; i>=0; i--) {
            if(i==(0)||i==(convert.length-1)){
                //System.out.print(convert[i] +" ");
                bild.append(convert[i]+" ");
            }else{

              char[] chr= convert[i].toCharArray();
                for (int j = chr.length-1; j>=0 ; j--) {
                    bild.append(chr[j]);
                   // System.out.print(chr[j]);
                }
               // System.out.print(" ");
                bild.append(" ");
            }
        }
        return bild;
    }

    public static void main(String[] args) {
        String words="Hello this is the GFG user";
        SwapCornerWords obj=new SwapCornerWords();
        StringBuilder answer=obj.swap(words);
        System.out.println(answer);


    }
}
//Input:  "Hello this is the GFG user"
//Output: "user GFG eth si siht Hello"