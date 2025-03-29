package Task_14thMarch;

import java.util.Scanner;

public class Decrement_and_increment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an Interger (whole Number)");
        Integer a = scanner.nextInt();
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        //           | Exp | ans
        // a= 10 ++a | 11  | 11
        //       a++ | 11  | 12
        //       a++ | 12  | 13 <-- Current "a" value
        //    Total  | 34
        //     a = 13

    }


}
