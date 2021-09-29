package com.levelTw0;

public class FindDuplicate {
    public void  findDuplicate(String words) {
        System.out.println(words.length());
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            for (int j = i + 1; j < words.length(); j++) {
                if () {
                    System.out.print(words.charAt(i));
                    builder.append(words.charAt(i));
                }
                count = 0;
            }
        }
    }
    public static void main(String[] args) {
        String words="geeksforgeeks";
        FindDuplicate obj=new FindDuplicate();
        obj.findDuplicate(words);

      //  Input string: geeksforgeeks
        //Output: efgkors

    }
}
