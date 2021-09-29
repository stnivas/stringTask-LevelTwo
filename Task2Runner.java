package runner;

import stringtasks.StringReverserByLetters;

import java.util.Scanner;

public class Task2Runner {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter program number to run: ");
        int option = input.nextInt();
        input.nextLine();
        if(option==4 || option==5){
            System.out.println("Enter a message: ");
            String message = input.nextLine();

            if(option == 4) {
                String answer = StringReverserByLetters.reverseString(message);
                System.out.println(answer);
            } else {

            }
        }else{

        }
    }


}
