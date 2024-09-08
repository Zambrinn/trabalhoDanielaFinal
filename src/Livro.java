public class Livro {
    String title; // String = "Mariano"
    String author; // String = "Pablo Marçal"

    public Livro (String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override // Over = Sobre / Ride = Escrever == Sobreescrever
    public String toString() {
        return "Livro = " + "titulo: " + title + ", autor: " + author;
    }

}
