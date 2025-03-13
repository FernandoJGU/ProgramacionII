
class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int count;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.count = 0;
    }

    public void insert(long e) {
        if (!isFull()) {
            fin = (fin + 1) % n;
            arreglo[fin] = e;
            count++;
        } else {
            System.out.println("Cola llena");
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long elemento = arreglo[inicio];
            inicio = (inicio + 1) % n;
            count--;
            return elemento;
        } else {
            System.out.println("Cola vacía");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            System.out.println("Cola vacía");
            return -1;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == n;
    }

    public int size() {
        return count;
    }
}

public class main {
    public static void main(String[] args) {  
        Cola cola = new Cola(5);
        System.out.println("Insertando elementos en la cola:");
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("Tamaño de la cola: " + cola.size());
        System.out.println("Elemento en la parte frontal: " + cola.peek());
        System.out.println("Eliminando elemento: " + cola.remove());
        System.out.println("Tamaño de la cola: " + cola.size());
        cola.insert(40);
        cola.insert(50);
        cola.insert(60);
        System.out.println("Tamaño de la cola: " + cola.size());
        System.out.println("Vaciando la cola:");
        while (!cola.isEmpty()) {
            System.out.println("Eliminando elemento: " + cola.remove());
        }
        System.out.println("Tamaño de la cola: " + cola.size());
    }
}