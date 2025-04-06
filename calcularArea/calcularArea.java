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
}
