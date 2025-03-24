
import java.util.Scanner;

public class main {

    public static double getDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double getRaiz1(double a, double b, double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double getRaiz2(double a, double b, double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        

        double discriminante = getDiscriminante(a, b, c);

        if (discriminante > 0) {
            double r1 = getRaiz1(a, b, discriminante);
            double r2 = getRaiz2(a, b, discriminante);
            System.out.printf("La ecuaci�n tiene dos ra�ces: %.5f y %.5f%n", r1, r2);
        } else if (discriminante == 0) {
            double r = -b / (2 * a);
            System.out.printf("La ecuaci�n tiene una ra�z: %.0f%n", r);
        } else {
            System.out.println("La ecuaci�n no tiene ra�ces reales");
        }

        scanner.close();
    }
}