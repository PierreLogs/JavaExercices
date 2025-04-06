# calcula el área de un rombo

Diseñe un algoritmo que determine el área (A) de un rombo del que se conoce su
base mayor (B), su base menor (b) y su altura (h). Considere la siguiente fórmula:

A = ((B + b) \* h) / 2

## Solución

### Pseudocódigo

Se presenta el algoritmo en pseudocódigo para calcular el área de un rombo:

```plaintext

Inicio
  // Definición de variables
  baseMayor, baseMenor, altura, area

  // Entrada de datos
  Leer baseMayor
  Leer baseMenor
  Leer altura

  // Proceso
  area = ((baseMayor + baseMenor) * altura) / 2

  // Salida de datos
  imprimir "El área del rombo es: ", area

Fin
```

## Diagramas de flujo

Se presenta el diagrama de flujo correspondiente al algoritmo anterior:

![Diagrama de flujo](https://github.com/PierreLogs/JavaExercices/blob/main/areaRombo/Diagrama5.png)

## Código Java

Para desarrollar el algoritmo en Java, se utiliza la siguiente implementación:

```java
public class areaRombo{
  public static void main(String[] args){
    double baseMayor = 5;
    double baseMenor = 3;
    double area = (baseMayor * baseMenor) / 2;
    System.out.println("El area del rombo es: " + area);
  }
}
```
