package pooEst;

import java.util.Scanner;

class Estadisticas {
    private double[] numeros;

    public Estadisticas(double[] numeros) {
        this.numeros = numeros;
    }

    public double promedio() {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaDesviacion = 0;
        for (double num : numeros) {
            sumaDesviacion += Math.pow(num - prom, 2);
        }
        return Math.sqrt(sumaDesviacion / (numeros.length - 1));
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        Estadisticas estadisticas = new Estadisticas(numeros);
        double prom = estadisticas.promedio();
        double desv = estadisticas.desviacion();

        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviación estándar es %.5f%n", desv);

        scanner.close();
    }
}
