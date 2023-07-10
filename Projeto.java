import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cadastro de Usuário");
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        scanner.nextLine(); // Limpar o buffer
        
        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();
        
        System.out.println("\nDados do usuário cadastrado:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
        
        scanner.close();
    }
}