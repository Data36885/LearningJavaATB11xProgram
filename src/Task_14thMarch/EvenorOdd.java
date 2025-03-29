package Task_14thMarch;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type Whole Number");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Its A Eve Number\t" + a);
        }
        else {
            System.out.println("Its A Odd Number\t" + a);
        }
    }
}
