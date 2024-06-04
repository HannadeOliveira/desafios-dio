import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        String nome = scanner.next();              
        System.out.println("Digite sua agência:");
        String agencia = scanner.next();
        System.out.println("Digite sua conta:");
        String conta = scanner.next();
        System.out.println("Digite o valor de seu primeiro depósito:");
        double deposito = scanner.nextDouble();

        System.out.println("Olá "  + nome + " Obrigada por criar uma conta em nosso Banco, sua agência é " + agencia + " conta " + conta + " e seu saldo de R$ " + deposito + " já está disponível para saque! "); 
         
         scanner.close();
        } 
     }
    