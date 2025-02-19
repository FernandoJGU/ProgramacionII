
class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Línea: Desde " + p1 + " hasta " + p2;
    }

    public void dibujaLinea() {
        
        System.out.println("Dibujando línea desde " + p1 + " hasta " + p2);
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);
        Linea linea = new Linea(p1, p2);
        
        System.out.println(linea);
        linea.dibujaLinea();
    }
}
