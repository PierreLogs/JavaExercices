public class calcularCirculo{
  public static void main(String[] args){
    double radio = 5;

    double area = 3.1416 * (radio * radio);
    double perimetro = 2 * 3.1416 * radio;

    System.out.println("El área del circulo es: " + area);
    System.out.println("El perimetro del circulo es: " + perimetro);
  }
}
