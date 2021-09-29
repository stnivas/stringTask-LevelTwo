package stringtasks;

public class StringReverserByLetters {


    public static String reverseString(String message) {

        StringBuilder answer = new StringBuilder();
        for (int i = message.length()-1; i >= 0 ; i--) {
            answer.append(message.charAt(i));
        }
        return answer.toString();



    }
}
