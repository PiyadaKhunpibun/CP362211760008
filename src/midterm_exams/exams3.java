package midterm_exams;

import java.util.Scanner;

public class exams3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender;
        double h;
        int k,age;

        System.out.print("Enter gender: ");
        gender = sc.nextLine();
        System.out.print("Enter high: ");
        h = sc.nextDouble();
        System.out.print("Enter Kilogram: ");
        k = sc.nextInt();
        age = sc.nextInt();

        double p_m = 66.5 + (13.75 *k) + (5.003 * age);

        System.out.println(p_m);
    }
}
