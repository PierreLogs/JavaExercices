/*import java.util.Scanner;

public class areaRectangulo{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduce la base del rectangulo: ");
    double base = entrada.nextDouble();

    System.out.println("Introduce la altura del rectangulo: ");
    double altura = entrada.nextDouble();

    double area = base * altura;
    double perimetro = 2 * (base * altura);

    System.out.println("El área del recángulo es: " + area);
    System.out.println("El perimetro del recángulo es: " + perimetro);

    entrada.close();
  }
}*/

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
