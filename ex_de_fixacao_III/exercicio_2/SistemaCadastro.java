package exercicio_2;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();


        System.out.println("=== Sistema de Cadastro ===");
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Realizar Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    boolean emailExistente = false;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getEmail().equals(email)) {
                            System.out.println("Email já cadastrado. Tente novamente.");
                            emailExistente = true;
                            break;
                        }
                    }
                    if (emailExistente) {
                        break;
                    }
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();
                    usuarios.add(new Usuario(nome, email, senha));
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o email: ");
                    String emailLogin = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senhaLogin = scanner.nextLine();
                    boolean loginSucesso = false;
                    for (Usuario usuario : usuarios) {
                        if (usuario.getEmail().equals(emailLogin) && usuario.getSenha().equals(senhaLogin)) {
                            System.out.println("Login bem-sucedido! Bem-vindo, " + usuario.getNome() + "!");
                            loginSucesso = true;

                            boolean continuarLogin = true;
                            while (continuarLogin) {
                                System.out.println("=== O que você deseja fazer? ===");
                                System.out.println("1. Editar dados da conta.");
                                System.out.println("2. Visualizar dados da conta.");
                                System.out.println("3. Sair.");
                                System.out.print("Escolha uma opção: ");
                                int opcaoLogin = scanner.nextInt();
                                scanner.nextLine();

                                switch (opcaoLogin) {
                                    case 1:
                                        System.out.print("Digite o novo nome: ");
                                        String novoNome = scanner.nextLine();
                                        usuario.setNome(novoNome);
                                        System.out.println("Nome atualizado com sucesso!");
                                        break;
                                    case 2:
                                        usuario.exibirInformacoes();
                                        break;
                                    case 3:
                                        System.out.println("Saindo da conta. Até mais!");
                                        continuarLogin = false;
                                        break;
                                    default:
                                        System.out.println("Opção inválida. Tente novamente.");
                                        break;
                                }
                            }
                            break;
                        }
                    }
                    if (!loginSucesso) {
                        System.out.println("Email ou senha incorretos. Tente novamente.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema. Até mais!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}

