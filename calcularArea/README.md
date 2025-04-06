## Ejercicio 3

El siguiente algoritmo determine el área y el precio de un terreno rectangular cuyo costo por metro cuadrado es S/. 750.

## Solución

Para resolver este problema, se requiere calcular el área del terreno y el precio del terreno. Para ello, se necesita ingresar el largo y el ancho del terreno. Luego, se calcula el área del terreno multiplicando el largo por el ancho. Finalmente, se calcula el precio del terreno multiplicando el área del terreno por el costo por metro cuadrado.

### Pseudocódigo

```plaintext
Incio
  // Definir variables
  areaTerreno, largo, ancho, precioTerreno

  // Ingresar datos
  leer largo
  leer ancho

  // Operaciones
  areaTerreno = largo * ancho
  precioTerreno = areaTerreno * 750

  // Imprimir resultados
  imprimir areaTerreno
  imprimir precioTerreno

Fin
```

### Diagrama de flujo

Disenando el diagrama de flujo se puede observar que el algoritmo es sencillo, se pide al usuario que ingrese el largo y el ancho del terreno, luego se calcula el área y el precio del terreno con las fórmulas mencionadas anteriormente. Finalmente se imprime el resultado en pantalla.

![Diagrama de flujo](https://github.com/PierreLogs/ejercicio3-java/blob/main/Diagrama3.png)

### Código en Java

```java
public class calcularArea{
  public static void main(String[] args){

    double largo = 25;
    double ancho = 193;

    double areaTerreno = largo * ancho;
    double precioTerreno = areaTerreno * 750;

    System.out.println("El área del terreno es: " +
     areaTerreno);
    System.out.println("El precio del terreno es: S/." +
     precioTerreno);
  }
}}
```
