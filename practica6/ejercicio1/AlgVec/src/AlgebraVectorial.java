
public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;
    public AlgebraVectorial() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double dot(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public AlgebraVectorial cross(AlgebraVectorial v) {
        return new AlgebraVectorial(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }
    public boolean perpendicular(AlgebraVectorial v) {
        return this.dot(v) == 0;
    }

    public boolean perpendicular(AlgebraVectorial v1, AlgebraVectorial v2) {
        return v1.dot(v2) == 0;
    }
    public boolean paralela(AlgebraVectorial v) {
        return this.cross(v).magnitud() == 0;
    }

    public boolean paralela(AlgebraVectorial v1, AlgebraVectorial v2) {
        return v1.cross(v2).magnitud() == 0;
    }
    public AlgebraVectorial proyeccion(AlgebraVectorial v) {
        double dotProduct = this.dot(v);
        double magnitudeSquared = v.magnitud() * v.magnitud();
        if (magnitudeSquared == 0) {
            throw new IllegalArgumentException("La magnitud del vector b no puede ser cero.");
        }
        double scalar = dotProduct / magnitudeSquared;
        return new AlgebraVectorial(scalar * v.x, scalar * v.y, scalar * v.z);
    }
    public AlgebraVectorial proyeccion(AlgebraVectorial a, AlgebraVectorial b) {
        double dotProduct = a.dot(b);
        double magnitudeSquared = b.magnitud() * b.magnitud();
        if (magnitudeSquared == 0) {
            throw new IllegalArgumentException("La magnitud del vector b no puede ser cero.");
        }
        double scalar = dotProduct / magnitudeSquared;
        return new AlgebraVectorial(scalar * b.x, scalar * b.y, scalar * b.z);
    }
    public double componente(AlgebraVectorial v) {
        double magnitudeB = v.magnitud();
        if (magnitudeB == 0) {
            throw new IllegalArgumentException("La magnitud del vector b no puede ser cero.");
        }
        return this.dot(v) / magnitudeB;
    }
    public double componente(AlgebraVectorial a, AlgebraVectorial b) {
        double magnitudeB = b.magnitud();
        if (magnitudeB == 0) {
            throw new IllegalArgumentException("La magnitud del vector b no puede ser cero.");
        }
        return a.dot(b) / magnitudeB;
    }
    @Override
    public String toString() {
        return "Vector(" + x + ", " + y + ", " + z + ")";
    }
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial b = new AlgebraVectorial(4, 5, 6);
        AlgebraVectorial c = new AlgebraVectorial(2, -1, 0);
        System.out.println("¿Son perpendiculares a y b? " + a.perpendicular(b));
        System.out.println("¿Son perpendiculares a y c? " + a.perpendicular(c));
        System.out.println("¿Son paralelos a y b? " + a.paralela(b));
        System.out.println("¿Son paralelos a y c? " + a.paralela(c));
        AlgebraVectorial proyeccionAB = a.proyeccion(b);
        System.out.println("Proyección de a sobre b: " + proyeccionAB);
        AlgebraVectorial proyeccionAC = a.proyeccion(c);
        System.out.println("Proyección de a sobre c: " + proyeccionAC);
        double componenteAB = a.componente(b);
        System.out.println("Componente de a en b: " + componenteAB);
        double componenteAC = a.componente(c);
        System.out.println("Componente de a en c: " + componenteAC);
    }
}