package lab4;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class ExInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter an integer:");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: "+x);




        System.out.print("Please, enter an double;");
        double p = scanner.nextDouble();

        System.out.println("Your entered double: "+p);



        System.out.print("Please, enter you name;");
        String s = scanner.nextLine();

        System.out.println("You name is:"+s);


    }
}
