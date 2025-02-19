class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"


class Linea:
    def __init__(self, p1, p2):
        if not isinstance(p1, Punto) or not isinstance(p2, Punto):
            raise ValueError("p1 y p2 deben ser instancias de la clase Punto.")
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea: Desde {self.p1} hasta {self.p2}"

    def dibujaLinea(self):
        print(f"Dibujando línea desde {self.p1} hasta {self.p2}")
    p1 = Punto(1, 2)
    p2 = Punto(4, 6)
    linea = Linea(p1, p2)
    
    print(linea)
    linea.dibujaLinea()
