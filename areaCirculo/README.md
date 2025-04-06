# Ejercicio 4

Diseñe un algoritmo que determine el área de un círculo y la longitud de su
circunferencia conociendo su radio. Considere las siguientes fórmulas:

A = 3.1416 x r 2
C = 2 x 3.1416 x r

## Solución

### Pseudocódigo

Para resolver el problema planteado se puede utilizar el siguiente pseudocódigo:

```plaintext
Inicio

  // Definir variables
  radio, area, longitud

  // Ingresar datos
  leer radio

  // Operaciones
  area = 3.1416 * (radio * radio)
  longitud = 2 * 3.1416 * radio

  // Imprimir resultados
  imprimir area
  imprimir longitud

Fin
```

### Diagrama de flujo

Diseñando el diagrama de flujo se puede observar que el algoritmo es sencillo, se pide al usuario que ingrese el radio del círculo, luego se calcula el área y la longitud de la circunferencia con las fórmulas mencionadas anteriormente. Finalmente se imprime el resultado en pantalla.

![Diagrama de flujo](https://github.com/PierreLogs/JavaExercices/blob/main/areaCirculo/Diagrama4.png)

### Código en Java

```java
public class calcularCirculo{
  public static void main(String[] args){
    double radio = 5;

    double area = 3.1416 * (radio * radio);
    double perimetro = 2 * 3.1416 * radio;

    System.out.println("El área del circulo es: " + area);
    System.out.println("El perimetro del circulo es: " + perimetro);
  }
}
```
