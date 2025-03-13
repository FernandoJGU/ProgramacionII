class Pila:
    def __init__(self, n):
        self.arreglo = [0] * n
        self.top = -1
        self.n = n

    def push(self, e):
        if not self.isFull():
            self.top += 1
            self.arreglo[self.top] = e
        else:
            print("Pila llena")

    def pop(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.top]
            self.top -= 1
            return elemento
        else:
            print("Pila vacía")
            return None

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.top]
        else:
            print("Pila vacía")
            return None

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1


if __name__ == "__main__":
    
    pila = Pila(5)

   
    print("Agregando elementos a la pila:")
    pila.push(10)
    pila.push(20)
    pila.push(30)
    print("Elemento en la parte superior:", pila.peek())  
    print("Eliminando elemento:", pila.pop()) 
    print("Elemento en la parte superior:", pila.peek())  
    pila.push(40)
    pila.push(50)
    pila.push(60) 
    print("Vaciando la pila:")
    while not pila.isEmpty():
        print("Eliminando elemento:", pila.pop())

    print("Intentando eliminar de una pila vacía:", pila.pop()) 
