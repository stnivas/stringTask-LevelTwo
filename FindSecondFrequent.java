package com.levelTw0;

import java.util.HashMap;

public class FindSecondFrequent{

    public void frequent(String word) {
        char[] convert = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(convert[i])) {
                map.put(convert[i], map.get(convert[i]) + 1);
            } else {
                map.put(convert[i], 1);
            }
        }
        //System.out.println(map);
        int maxValue = 0;
        char maxKey = 0;
        System.out.println(map);
        for (char i : map.keySet()) {
            if (map.get(i) > maxValue) {
                maxValue = map.get(i);
                maxKey = i;
            }
        }
        System.out.println(maxKey);
        System.out.println(maxValue);


    }
    public static void main(String[] args) {
        String word="successes";
        FindSecondFrequent obj=new FindSecondFrequent();
        obj.frequent(word);
    }
}
