public class ISS{
  double valor;
  public void calcISS(){
    double imposto = (valor * 4.6*17)/100;
    double valorf = valor + imposto;
    System.out.println("Imposto: " + imposto);
    System.out.println("Valor com imposto: " + valorf);
  }
}