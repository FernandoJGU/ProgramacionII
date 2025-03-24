package poo;

import java.util.Scanner;

class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1(double discriminante) {
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public double getRaiz2(double discriminante) {
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public String resolver() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            double r1 = getRaiz1(discriminante);
            double r2 = getRaiz2(discriminante);
            return String.format("La ecuación tiene dos raíces: %.5f y %.5f", r1, r2);
        } else if (discriminante == 0) {
            double r = -b / (2 * a);
            return String.format("La ecuación tiene una raíz: %.5f", r);
        } else {
            return "La ecuación no tiene raíces reales";
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        String resultado = ecuacion.resolver();
        System.out.println(resultado);

        scanner.close();
    }
}