import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Para leitura de dados no terminal

       System.out.println("Por favor, digite o número da conta:");
       int numero = scanner.nextInt();

       scanner.nextLine();

       System.out.println("Por favor, digite a agência:");
       String agencia = scanner.nextLine();

       System.out.println("Por favor, digite o nome do cliente:");
       String nomeCliente = scanner.nextLine();

       System.out.println("Por favor , digite o saldo:");
       double saldo = scanner.nextDouble();

       scanner.close();

       String mensagem = "Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero + " e seu saldo "  +  saldo + " Já está disponivel para saque. ";

       System.out.println(mensagem);



    }
}
