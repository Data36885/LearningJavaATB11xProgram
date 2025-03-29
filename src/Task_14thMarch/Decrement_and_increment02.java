package Task_14thMarch;

import java.util.Scanner;

public class Decrement_and_increment02 {
    public static void main(String[] args) {
            int a = 20;
            System.out.println(--a + a++ + a--);
        System.out.println(a);

        //           | Exp | ans
        // a= 20 --a | 19  | 19
        //       a++ | 19  | 20
        //       a-- | 20  | 19 <-- Current "a" value
        //    Total  | 58
        //     a = 19

    }


}
