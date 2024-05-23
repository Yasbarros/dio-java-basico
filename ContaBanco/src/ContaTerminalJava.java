import java.util.Scanner;

public class ContaTerminalJava {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        int numero;
        String  agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Digite seu numero: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite sua agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia + ", conta "+ numero + " e seu  saldo " + saldo + " já esta disponivel para saque.");

        sc.close();
    }
}
