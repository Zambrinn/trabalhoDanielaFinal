public class Biblioteca {
    private Livro[] livros;
    private int counter;

    public Biblioteca (int tamanho) {
        this.livros = new Livro[tamanho];
        this.counter = 0;
    }

    public void adicionarLivro (Livro livro) {
        if ( counter < livros.length ) {
            livros[counter] = livro;
            counter++;
            System.out.println("Livro adicionado!");
        } else {
            System.out.println("Não foi possível adicionar o livro");
        }
    }

    public void removerLivro (String title) {
        for (int i = 0; i < counter; i++) {
            if (livros[i].title.equals(title)) {
                livros[i] = livros[counter - 1];
                counter--;
                System.out.println("Livro removido!");
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void listarLivros() {
        for (int i = 0; i < counter; i++) {
            System.out.println(livros[i]);
        }
    }

    public void contarLivros() {
        System.out.println("Total de livros: " + counter);
    }

    public void buscarLivro(String title) {
        for (int i = 0; i < counter; i++) {
            if (livros[i].title.equalsIgnoreCase(title) ) {
                System.out.println(livros[i]);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}