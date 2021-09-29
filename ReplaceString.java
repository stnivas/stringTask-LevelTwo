package com.levelTw0;

import java.util.Arrays;

public class ReplaceString {
    public  StringBuilder replace(String sentence){
         String[] convert=sentence.split(" ");
         StringBuilder builder=new StringBuilder();
        for (int i = 0; i < convert.length; i++) {
             builder.append(convert[i]+" ");
            if (convert[i].equals("fox")) {
                convert[i] = "cat";
                builder.append(convert[i]+ " ");
            }
        }
        return  builder;
    }
    public static void main(String[] args) {
        ReplaceString obj=new ReplaceString();
        String sentence="The quick brown fox jumps over the lazy dog";
        StringBuilder answer=obj.replace(sentence);
        System.out.println(answer);
    }
}
