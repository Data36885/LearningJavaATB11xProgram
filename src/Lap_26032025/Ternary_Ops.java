package Lap_26032025;

public class Ternary_Ops {
    public static void main(String[] args) {
        int a = 100;
        String result = (a > 100 ) ? "Something wrong in scaling score":
                (a < 0 ) ? "Something wrong in scaling score":
                (a >= 90) ? "Grading scale is A" :
                (a >= 80) ? "Grading scale is B" :
                        (a >= 70) ? "Grading scale is C" :
                                (a >= 60) ? "Grading scale is D" : "Grading scale is F";
        System.out.println(result);


    }
}

// a b c