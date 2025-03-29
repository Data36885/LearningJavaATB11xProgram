package Task_14thMarch;

public class CLI_Userinput {
    public static void main(String[] args) {
        String name = args[0];
        Integer age = Integer.parseInt(args[1]);
        Integer salary = Integer.parseInt(args[2]);

        System.out.println("Name  :\t"+ name);
        System.out.println("Age   :\t"+ age);
        System.out.println("Salary:\t"+ salary);

        /* Answer is
        Name  :	Suran
        Age   :	45
        Salary:	60000 */
    }
}
