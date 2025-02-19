
import java.lang.Math;

class punto {
    private double x;
    private double y;

    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] coordCartesianas() {
        return new double[]{x, y};
    }

    public double[] coordPolares() {
        double radio = Math.sqrt(x * x + y * y);
        double angulo = Math.atan2(y, x); 
        angulo = Math.toDegrees(angulo); 
        return new double[]{radio, angulo};
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    public static void main(String[] args) {
        punto p1 = new punto(0, 3);
        System.out.println(p1);

        double[] cartesianas = p1.coordCartesianas();
        System.out.println("Coordenadas cartesianas: " + cartesianas[0] + ", " + cartesianas[1]);

        double[] polares = p1.coordPolares();
        System.out.printf("Coordenadas polares: Radio = %.2f, Ángulo = %.2f grados%n", polares[0], polares[1]);
    }
}
