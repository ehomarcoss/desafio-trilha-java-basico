import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner;

        //Exibir as mensagens para o nosso usuario;

        //Obter pela scanner os valores digitados no terminal;

        //Exibir a mensagem conta criada;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem com os dados inseridos

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + ".");
        System.out.println("Seu saldo já está disponível para saque.");

        scanner.close();

    }
}