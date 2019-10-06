package lab7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score;

        do {
            System.out.println("Enter your score, " + "and I will tell you grade:");

            score = sc.nextInt();

            if (score >= 0 && score <= 49)
            System.out.println("Grade F.");
            else if (score >= 50 && score <= 54)
            System.out.println("Grade D.");
            else if (score >= 55 && score <= 59)
            System.out.println("Grade D+.");
            else if (score >= 60 && score <= 64)
            System.out.println("Grade C.");
            else if (score >= 65 && score <= 69)
            System.out.println("Grade C+.");
            else if (score >= 70 && score <= 74)
            System.out.println("Grade B.");
            else if (score >= 75 && score <= 79)
            System.out.println("Grade B+.");
            else if (score >= 80 && score <= 100)
            System.out.println("Grade A.");
            else
            System.out.println("Please, enter score between 0-100 ");

        } while (!(score >=0 && score <=100));

    }
}
