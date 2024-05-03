
public class ContaTerminal {

    public static void main(String[] args) {
        CriaConta criaConta = new CriaConta();

        System.out.print("Bem vindo ao Mubank.");

        criaConta.insereNome();
        criaConta.numeroDaConta();
        criaConta.insereAgencia();
        criaConta.insereSaldo();

        System.out.print("Ola "+criaConta.nomeCliente);
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " +criaConta.agencia +", conta "+criaConta.numeroConta);
        System.out.print(" e seu saldo "+criaConta.saldo+ " já está disponível para saque.");

        }
    }
