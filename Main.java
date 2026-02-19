import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // O erro deve sumir aqui se o arquivo UsuarioService.java estiver na mesma pasta
        UsuarioService service = new UsuarioService(); 

        int opcao;
        do {
            System.out.println("\n1 - Cadastrar\n2 - Listar\n0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                System.out.print("Nome: ");
                String n = scanner.nextLine();
                System.out.print("Email: ");
                String e = scanner.nextLine();
                service.adicionarUsuario(new Usuario(n, e));
            } else if (opcao == 2) {
                service.listarUsuarios();
            }
        } while (opcao != 0);
        scanner.close();
    }
}