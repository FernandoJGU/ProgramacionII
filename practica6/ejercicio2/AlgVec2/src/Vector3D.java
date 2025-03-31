
public class Vector3D {
    private double x, y, z;
    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D(Vector3D otro) {
        this.x = otro.x;
        this.y = otro.y;
        this.z = otro.z;
    }
    public Vector3D sumar(Vector3D otro) {
        return new Vector3D(this.x + otro.x, this.y + otro.y, this.z + otro.z);
    }
    public Vector3D sumar(double escalar) {
        return new Vector3D(this.x + escalar, this.y + escalar, this.z + escalar);
    }
    public Vector3D multiplicar(double escalar) {
        return new Vector3D(this.x * escalar, this.y * escalar, this.z * escalar);
    }
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector3D normalizar() {
        double mag = magnitud();
        if (mag == 0) {
            throw new IllegalArgumentException("El vector no puede ser normalizado porque su magnitud es cero.");
        }
        return new Vector3D(x / mag, y / mag, z / mag);
    }
    public double productoEscalar(Vector3D otro) {
        return this.x * otro.x + this.y * otro.y + this.z * otro.z;
    }
    public Vector3D productoVectorial(Vector3D otro) {
        return new Vector3D(
            this.y * otro.z - this.z * otro.y,
            this.z * otro.x - this.x * otro.z,
            this.x * otro.y - this.y * otro.x
        );
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);
        Vector3D v3 = new Vector3D(); 

        System.out.println("Suma de v1 y v2: " + v1.sumar(v2));
        System.out.println("Suma de v1 y escalar 2: " + v1.sumar(2));
        System.out.println("Multiplicación por escalar: " + v1.multiplicar(2));
        System.out.println("Magnitud de v1: " + v1.magnitud());
        System.out.println("Vector unitario de v1: " + v1.normalizar());
        System.out.println("Producto escalar: " + v1.productoEscalar(v2));
        System.out.println("Producto vectorial: " + v1.productoVectorial(v2));
        System.out.println("Vector cero: " + v3);
    }
}