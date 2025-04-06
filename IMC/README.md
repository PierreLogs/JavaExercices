## Ejercicio 2

El siguiente algoritmo determina el índice de masa corporal de una persona (IMC) a partir de su peso y estatura.

## Solución

### Pseudocódigo

Para resolver el problema se debe seguir los siguientes pasos, entre ellos realizar el pseudocódigo.

```plaintext
Inicio

  // Declaración de variables
  Definir peso, estatura, imc;

  // Ingreso de datos
  Leer peso;
  Leer estatura;

  // Proceso de cálculo del IMC
  imc = peso / (estatura * de datos
  Imprimir "Su índice de masa corporal es: ", imc;

Fin
```

### Diagrama de flujo

Para resolver el problema se debe utilizar la fórmula del índice de masa corporal (IMC) que es el peso de una persona en kilogramos dividido por el cuadrado de su estatura en metros. El algoritmo debe seguir los siguientes pasos:

![Diagrama de flujo](https://github.com/PierreLogs/ejercicio2-java/blob/main/Diagrama.png)

### Código en Java

```java
public class calcularIMC{
  public static void main(String[] args){

    double peso = 60;
    double altura = 168;
    double imc = peso / (altura * altura);

    System.out.println("IMC: " + imc);
  }
}
```
