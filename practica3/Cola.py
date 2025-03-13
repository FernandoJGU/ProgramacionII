class Cola:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.n = n
        self.count = 0 

    def insert(self, e):
        if not self.isFull():
            self.fin = (self.fin + 1) % self.n
            self.arreglo[self.fin] = e
            self.count += 1
        else:
            print("Cola llena")

    def remove(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n
            self.count -= 1
            return elemento
        else:
            print("Cola vacía")
            return None

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        else:
            print("Cola vacía")
            return None

    def isEmpty(self):
        return self.count == 0

    def isFull(self):
        return self.count == self.n

    def size(self):
        return self.count
if __name__ == "__main__":
    cola = Cola(5)
    print("Insertando elementos en la cola:")
    cola.insert(10)
    cola.insert(20)
    cola.insert(30)
    print("Tamaño de la cola:", cola.size()) 
    print("Elemento en la parte frontal:", cola.peek())
    print("Eliminando elemento:", cola.remove()) 
    print("Tamaño de la cola:", cola.size())  
    cola.insert(40)
    cola.insert(50)
    cola.insert(60) 
    print("Tamaño de la cola:", cola.size())
    print("Vaciando la cola:")
    while not cola.isEmpty():
        print("Eliminando elemento:", cola.remove())

    print("Intentando eliminar de una cola vacía:", cola.remove())  # Debería mostrar "Cola vacía"
