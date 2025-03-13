import math

class AreaCalcular:

    def calcular_area(self, *args):
        if len(args) == 1: 
            radio = args[0]
            return math.pi * radio ** 2
        elif len(args) == 2:  
            base, altura = args
            return (base * altura) / 2 
        elif len(args) == 3:  
            base_mayor, base_menor, altura = args
            return ((base_mayor + base_menor) * altura) / 2
        elif len(args) == 4:  
            base, altura = args[0], args[1]
            return base * altura
        elif len(args) == 5:  
            lado = args[0]
            return (5 * lado ** 2) / (4 * math.tan(math.pi / 5))
        else:
            raise ValueError("Número de argumentos no válido")

if __name__ == "__main__":
    calcula = AreaCalcular()
    area_circulo = calcula.calcular_area(5)
    print(f"Área del círculo: {area_circulo:.2f}")

    area_rectangulo = calcula.calcular_area(4, 6)  
    print(f"Área del rectángulo: {area_rectangulo:.2f}")

    area_triangulo = calcula.calcular_area(3, 4)  
    print(f"Área del triángulo rectángulo: {area_triangulo:.2f}")

    area_trapecio = calcula.calcular_area(5, 3, 4) 
    print(f"Área del trapecio: {area_trapecio:.2f}")

    area_pentagono = calcula.calcular_area(6)  
    print(f"Área del pentágono: {area_pentagono:.2f}")
