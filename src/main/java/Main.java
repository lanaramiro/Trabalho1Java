public class Main {
  public static void main(String[] args) {
    ISS servicos = new ISS();
      servicos.valor = 42;
      servicos.calcISS();

    IPI produtos = new IPI();
      produtos.valor = 42;
      produtos.calcIPI();
      }
  }

