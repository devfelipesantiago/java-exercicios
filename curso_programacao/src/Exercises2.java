import java.util.Locale;
import java.util.Scanner;

public class Exercises2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num2 = sc.nextInt();
        int soma = num1 + num2;
        int num1 = sc.nextInt();
        System.out.println("SOMA = " + soma)
        ---------------------------------------------------
        Locale.setDefault(Locale.US);

        double raio = sc.nextFloat();
        double pi = 3.14159;
        double area = pi * (Math.pow(raio, 2));
        System.out.printf("Area = %.4f%n", area);
        ----------------------------------------------------
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int d = sc.nextInt();

         int dif = (a*b) - (c*d);

        System.out.println("Diferenca = " + dif);
        --------------------------------------------------------
        int number = sc.nextInt();
        int hours = sc.nextInt();
        float salaryForHours = sc.nextFloat();
        float salary = salaryForHours * hours;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        ----------------------------------------------------------
        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = (preco1 * qte1) + (preco2 * qte2);

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
        ------------------------------------------------------------
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}

