package course.Programs;

import course.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class AppRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        sc.close();
    }
}