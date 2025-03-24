package modEstE;

import java.util.Scanner;

public class Main {

    public static double promedio(double[] n) {
        double suma = 0;
        for (double num : n) {
            suma += num;
        }
        return suma / n.length;
    }

    public static double desviacion(double[] n, double promedio) {
        double sumaDesviacion = 0;
        for (double num : n) {
            sumaDesviacion += Math.pow(num - promedio, 2);
        }
        return Math.sqrt(sumaDesviacion / (n.length - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextDouble();
        }

        double prom = promedio(num);
        double desv = desviacion(num, prom);

        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviación estándar es %.5f%n", desv);

        scanner.close();
    }
}
