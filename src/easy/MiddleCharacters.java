package easy;

import java.util.Scanner;

public class MiddleCharacters {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = input.next();
        int length = str.length();
        if(length % 2 == 0){
            char middle1 = str.charAt(length / 2 - 1);
            char middle2 = str.charAt(length / 2);
            System.out.println("" + middle1 + middle2);
        }else {
            char middle = str.charAt(length / 2);
            System.out.println(middle);
        }
    }
}
