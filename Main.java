import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    String num1;
    String num2;
    String aux;
    Scanner Ler = new Scanner(System.in);
    num1 = "";
    num2 = "";
    System.out.println("- Troca de valores entre variáveis - ");
    System.out.println("Digite sua cor fav.: ");
    num1 = Ler.nextLine();
    System.out.println("Digite seu número da sorte: ");
    num2 = Ler.nextLine();
    aux = num2;
    num2 = num1;
    num1 = aux;
    System.out.println(num1 + num2);

  }

}