import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        
        //Exibir as mensagens para o nosso usuario

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String numeroAgencia = scanner.next();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();       

        double saldo = 1234.19;

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia  + ", conta "+ numeroConta +" , seu saldo é de R$ "+ saldo +
        " já está disponível para saque\".");

    }
}
