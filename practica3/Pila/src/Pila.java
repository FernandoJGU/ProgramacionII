
class Pila<T> {
    private T[] arreglo;
    private int top;
    private int n;

    @SuppressWarnings("unchecked")
    public Pila(int n) {
        this.n = n;
        this.arreglo = (T[]) new Object[n];
        this.top = -1;
    }

    public void push(T e) {
        if (!isFull()) {
            arreglo[++top] = e;
        } else {
            System.out.println("Pila llena");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return arreglo[top--];
        } else {
            System.out.println("Pila vacía");
            return null; 
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return arreglo[top];
        } else {
            System.out.println("Pila vacía");
            return null; 
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila: [");
        for (int i = 0; i <= top; i++) {
            sb.append(arreglo[i]);
            if (i < top) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}