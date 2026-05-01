package exercicio_3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SistemaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        boolean continuar = true;

        System.out.println("=== Sistema de Gerenciamento de Produtos ===");
        while (continuar) {
            System.out.println("1. Adicionar novo produto.");
            System.out.println("2. Visualizar lista de produtos.");
            System.out.println("3. Remover produto.");
            System.out.println("4. Sair.");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    boolean jaExiste = false;
                    for (Produto pr : produtos) {
                        if (pr.getCodigo() == codigo) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (jaExiste) {
                        System.out.println("Erro: já existe um produto com esse código. Tente novamente.");
                    } else {
                        System.out.print("Dgite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o preço do produto: ");
                        double preco = scanner.nextDouble();
                        produtos.add(new Produto(codigo, nome, preco));
                        System.out.println("Produto adicionado com sucesso!");
                    }
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        for (Produto p : produtos) {
                            p.exibirProdutos();
                        }
                    }
                case 3:
                    System.out.print("Digite o código do produto que quer excluir: ");
                    int codigoRemover = scanner.nextInt();
                    scanner.nextLine();
                    boolean removido = false;
                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigoRemover) {
                            produtos.remove(p);
                            removido = true;
                            System.out.println("Produto removido com sucesso!");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema. Até mais!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
