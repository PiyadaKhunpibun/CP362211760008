package lab5;

import javafx.scene.shape.Circle;

import java.util.Scanner;

public class lab5_2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141;

        System.out.println("Enter r: ");
        double r = sc.nextDouble();

        double Area = PI * r*r;
        System.out.println("พื้นผิวของวงกลม: " + Area);

        double C = 3 * PI * r;
        System.out.println("เส้นรอบวงกลม: " + C);

        double V = (4/3) * PI *r*r*r;
        System.out.println("ปริมาณความจุทรงกลม: " + V);
    }
}






