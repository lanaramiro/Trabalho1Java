public class IPI{
  double valor;
  public void calcIPI(){
    double imposto = (valor * 25*17)/100;
    double valorf = valor + imposto;
    System.out.println("Imposto: " + imposto);
    System.out.println("Valor com imposto: " + valorf);
  }
}