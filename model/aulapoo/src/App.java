

import java.util.Scanner;

import model.Produto;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        int opcao;

        do {
            System.out.println("======== Cadastro de Produto ========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Ver dados do produto");
            System.out.println("3 - Adicionar quantidade ao estoque");
            System.out.println("4 - Remover quantidade do estoque");
            System.out.println("0 - Sair");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    System.out.print("Quantidade inicial em estoque: ");
                    int quantidade = sc.nextInt();

                    produto.setCodigo(codigo);
                    produto.setNome(nome);
                    produto.setValor(valor);
                    produto.setQuantidadeEmEstoque(quantidade);
                    System.out.println("Produto cadastrado com sucesso.");

                    if (codigo <= 0) {
                        System.out.println("Código Invalido");
                    }   
                            if (nome.isBlank()) {
                            System.out.println("Nome Invalido");
                        }
                            if (valor < 0) {
                            System.out.println("Valor Invalido");
                        }
                            if (quantidade < 0) {
                            System.out.println("Quantidade Invalida");
                        }
                            if (codigo == codigo) {
                                System.out.println("Código invalido");
                                
                            }
                        
                    break;
                case 2:
                    produto.exibirDados();
                    break;
                case 3:
                    System.out.print("Quantidade para adicionar: ");
                    int quantidadeAdicionar = sc.nextInt();

                    produto.adicionarEstoque(quantidadeAdicionar);
                    System.out.println("Estoque atualizado com sucesso.");
                    break;
                case 4:

                    System.out.print("Quantidade para remover: ");
                    int quantidadeRemover = sc.nextInt();

                    produto.removerEstoque(quantidadeRemover);
                    System.out.println("Retirada realizada com sucesso.");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}