package easy;

import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of the number is : " + fact);
    }
}
