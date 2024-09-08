import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da biblioteca: ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        Biblioteca biblioteca = new Biblioteca(tamanho);

        int option;

        do {
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Remover livro");
            System.out.println("3 - Buscar livros");
            System.out.println("4 - Listar livro");
            System.out.println("5 - Contar livro");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Informe o título do livro: ");
                    String title = scanner.nextLine();
                    System.out.println("Agora informe o autor: ");
                    String author = scanner.nextLine();
                    Livro livro = new Livro(title, author);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.println("Informe o título para removermos o livro: ");
                    String removeTitle = scanner.nextLine();
                    biblioteca.removerLivro(removeTitle);
                    break;
                case 3:
                    System.out.println("Informe o título para buscarmos o livro: ");
                    String searchTitle = scanner.nextLine();
                    biblioteca.buscarLivro(searchTitle);
                    break;
                case 4:
                    biblioteca.listarLivros();
                    break;
                case 5:
                    biblioteca.contarLivros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        } while (option != 0);
    }
}
