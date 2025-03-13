
public class main {
    public static void main(String[] args) {
        
        Pila<Integer> pila = new Pila<>(5);

        
        System.out.println("Agregando elementos a la pila:");
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila); 
        System.out.println("Elemento en la parte superior: " + pila.peek());
        System.out.println("Eliminando elemento: " + pila.pop());
        System.out.println(pila); 
        pila.push(40);
        pila.push(50);
        pila.push(60);
        System.out.println(pila);
        System.out.println("Vaciando la pila:");
        while (!pila.isEmpty()) {
            System.out.println("Eliminando elemento: " + pila.pop());
        }
        System.out.println(pila);
    }
}
