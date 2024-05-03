
import java.util.Scanner;
public class CriaConta {
    Scanner scanner = new Scanner(System.in);

    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;

    public void insereNome(){
        System.out.println("Para dar inicio a criaçao de sua conta insira seu nome:");
        nomeCliente = scanner.nextLine();
    }
    public void numeroDaConta(){
        System.out.println("Agora insira o numero de conta desejado:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
    }
    public void insereAgencia(){
        System.out.println("Agora insira o numero de agencia seguindo este exemplo : 067-8 ");
        agencia = scanner.nextLine();
    }
    public void insereSaldo (){
        System.out.println("Quanto de saldo deseja inserir a sua conta?");
        saldo = scanner.nextDouble();
    }

}
