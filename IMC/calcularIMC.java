public class calcularIMC{
  public static void main(String[] args){

    double peso = 60;
    double altura = 168;
    double imc = peso / (altura * altura);

    System.out.println("IMC: " + imc);
  }
}
