import java.time.LocalDate;
import java.time.Period;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para exibir todas as informações do livro, incluindo autor e ano de lançamento
    public void exibirInformacoes() {
        System.out.println("Informações do Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
       
        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();
       
        // Obtendo o ano atual
        int anoAtual = dataAtual.getYear();
       
        // Calculando há quanto tempo o livro foi lançado
        int anosDesdePublicacao = Period.between(LocalDate.of(anoPublicacao, 1, 1), dataAtual).getYears();
       
        System.out.println("Há quanto tempo foi lançado: " + anosDesdePublicacao + " anos");
    }

    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}