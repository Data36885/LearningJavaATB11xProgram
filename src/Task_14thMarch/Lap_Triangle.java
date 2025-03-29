package Task_14thMarch;

import java.util.Scanner;

public class Lap_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type ange1");
        Integer angle1 = scanner.nextInt();
        System.out.println("Type angel2");
        Integer angle2 = scanner.nextInt();
        System.out.println("Type angel3");
        Integer angle3 = scanner.nextInt();

        if (angle1 == angle2 && angle1 == angle3) {
                System.out.println("triangle is equilateral");

            }
            else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("triangle is isosceles ");
            }
        else {

                System.out.println("triangle is scalene ");
            }
        }

    }

