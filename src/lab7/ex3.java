package lab7;

import com.sun.xml.internal.bind.util.Which;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("which subjects you like the most? : ");
        System.out.println("1. System Analysis and Design.");
        System.out.println("2. Computer Programming.");
        System.out.println("3. Internet Application Programming.");
        System.out.println("Select: ");
        int selector = sc.nextInt();

        //switch-case
        switch (selector){
            case 1: System.out.println("Sure? This subject is very hard.");break;
            case 2: System.out.println("Yes, Computer Programming is very fum.");break;
            case 3: System.out.println("ohhh, you might expert in Programming.");break;
            default: System.out.println("You have to enter 1-3.");
        }
    }
}
