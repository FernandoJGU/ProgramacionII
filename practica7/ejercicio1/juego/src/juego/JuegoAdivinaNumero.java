package juego;
import java.util.Random;
import java.util.Scanner;
class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas); }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina un número entre 0 y 10:");
        while (true) {
            int intento = scanner.nextInt();
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!!");
                actualizaRecord();
                break;} else {
                if (!quitaVida()) {
                    break;}
                if (intento < numeroAAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");}}}
        scanner.close();}}
