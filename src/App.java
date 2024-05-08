import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite a agência:");
        String agencia = scanner.next();
        
        System.out.println("Digite o nome do titular:");
        String nome = scanner.next();
        
        // Criando uma instância da classe ContaBanco com os valores digitados
        ContaBanco c1 = new ContaBanco(numero, agencia, nome);

        // Acessando os métodos getter da instância c1
        System.out.println("Olá " + c1.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + c1.getAgencia() + ", conta " + c1.getNumero() + " e seu saldo " + c1.getSaldo() + " já está disponível para saque");

        scanner.close();
    }
}
