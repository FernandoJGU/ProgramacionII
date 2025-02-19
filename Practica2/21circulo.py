class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x}, {self.y})"


class Circulo:
    def __init__(self, centro, radio):
        if not isinstance(centro, Punto):
            raise ValueError("El centro debe ser una instancia de la clase Punto.")
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo: Centro = {self.centro}, Radio = {self.radio}"

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")


    centro = Punto(5, 10)
    circulo = Circulo(centro, 3)
    print(circulo)
    circulo.dibujaCirculo()
