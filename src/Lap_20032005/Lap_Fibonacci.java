package Lap_20032005;

public class Lap_Fibonacci {
    public static void main(String[] args) {
        int n = 7;


        int a = 0, b = 1;


        System.out.print("Fibonacci sequence: " + a + " " + b);


        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
