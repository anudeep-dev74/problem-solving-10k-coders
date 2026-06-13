package easy;

import java.util.Scanner;

public class Sum_Of_Digits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = input.nextInt();
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum of the Digit is " + sum);
    }
}
