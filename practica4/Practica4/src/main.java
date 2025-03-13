public class main { 
    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    public double calcularAreaPentagono(int lado) {
        return (5 * lado * lado) / (4 * Math.tan(Math.PI / 5));
    }
    public static void main(String[] args) {
        main calcular = new main();
        double areaCirculo = calcular.calcularAreaCirculo(5);
        System.out.println("Área del círculo: " + areaCirculo);

        double areaRectangulo = calcular.calcularAreaRectangulo(4, 6); 
        System.out.println("Área del rectángulo: " + areaRectangulo);

        double areaTriangulo = calcular.calcularAreaTriangulo(3, 4); 
        System.out.println("Área del triángulo rectángulo: " + areaTriangulo);

        double areaTrapecio = calcular.calcularAreaTrapecio(5, 3, 4); 
        System.out.println("Área del trapecio: " + areaTrapecio);

        double areaPentagono = calcular.calcularAreaPentagono(6); 
        System.out.println("Área del pentágono: " + areaPentagono);
    }
}
