
public class exercicio3 {

   //Crie uma classe chamada Livro com os atributos titulo (String) e autor (String).
   // Em seguida, crie uma classe chamada Biblioteca que pode armazenar até 10 objetos do tipo Livro.
   // Implemente um método adicionarLivro na classe Biblioteca que permite adicionar um livro à lista.
   // No método main, crie uma biblioteca, adicione alguns livros e liste os títulos dos livros na biblioteca.

   public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

public class Biblioteca {
    private Livro[] livros;
    private int quantidadeLivros;

    public Biblioteca() {
        livros = new Livro[10]; // Inicializa o array com espaço para até 10 livros
        quantidadeLivros = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < 10) {
            livros[quantidadeLivros] = livro;
            quantidadeLivros++;
            System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
        } else {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (int i = 0; i < quantidadeLivros; i++) {
            System.out.println("Título: " + livros[i].getTitulo() + ", Autor: " + livros[i].getAutor());
        }
    }

    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicione alguns livros à biblioteca
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro2 = new Livro("Romeu e Julieta", "William Shakespeare");
        Livro livro3 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Liste os títulos dos livros na biblioteca
        biblioteca.listarLivros();
    }
}

}