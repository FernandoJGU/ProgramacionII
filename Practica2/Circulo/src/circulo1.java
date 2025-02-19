
class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto c, double r) {
        this.centro = c;
        this.radio = r;
    }

    @Override
    public String toString() {
        return "Círculo: Centro = " + centro + ", Radio = " + radio;
    }

    public void dibujaCirculo() {
        
        System.out.println("Dibujando con centro en " + centro + " y radio " + radio);
    }

    public static void main(String[] args) {
        Punto centro = new Punto(5, 10);
        Circulo circulo = new Circulo(centro, 3);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
