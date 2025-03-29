package Task_14thMarch;

public class Max_ternaryoperator {
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        Integer b = Integer.parseInt(args[1]);

        String max = a > b ? "A is Max\t" + a : "B is Max\t" + b ;
        System.out.println(max);

    }
}
