## Ejercicio 1

Diseñe un algoritmo que determine el área (A) y el perímetro (P) de un rectángulo del que se conoce su base (b) y su altura
(h). Considere las siguientes fórmulas:

A= b x h
P= 2 x (b+h)

## Solución

### Pseudocódigo

Para resolver el problema planteado se puede utilizar el siguiente pseudocódigo:

```
Inicio

  // Declarar variables
  base, altura, area, perimetro

  // Ingrese la base y la altura del rectángulo
  Leer base
  Leer altura

  // Calcular el área y el perímetro del rectángulo
  area = base * altura
  perimetro = 2 * (base + altura)

  // Imprimir resultados
  Imprimir area
  Imprimir perimetro

Fin
```

### Diagrama de flujo

Diseñando el diagrama de flujo se puede observar que el algoritmo es sencillo, se pide al usuario que ingrese la base y la altura del rectángulo, luego se calcula el área y el perímetro del rectángulo con las fórmulas mencionadas anteriormente. Finalmente se imprime el resultado en pantalla.

![diagrama de flujo](https://github.com/PierreLogs/ejercicio1-java/blob/main/Diagrama1.png);

### Código en Java

```java
public class areaRectangulo{
  public static void main(String[] args){

    double base = 10;
    double altura = 5;

    double area = base * altura;
    double perimetro = 2 * (base * altura);

    System.out.println("El área del recángulo es: " + area);
    System.out.println("El perimetro del recángulo es: " + perimetro);
  }
}
```
