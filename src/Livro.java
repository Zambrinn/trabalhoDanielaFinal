public class Livro {
    String title;
    String author;

    public Livro (String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Livro = " + "titulo: " + title + ", autor: " + author;
    }

}
