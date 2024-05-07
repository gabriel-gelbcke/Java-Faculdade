package inter;

public abstract class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int exemplaresDisponiveis;
    private String categoria;

    public Livro(int codigo, String titulo, String autor, int anoPublicacao, int exemplaresDisponiveis,
    String categoria) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.exemplaresDisponiveis = exemplaresDisponiveis;
    this.categoria = categoria;
    }
    
    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}

    public void setAutor(String autor) {this.autor = autor;}

    public int getAnoPublicacao() {return anoPublicacao;}

    public void setAnoPublicacao(int anoPublicacao) {this.anoPublicacao = anoPublicacao;}

    public int getExemplaresDisponiveis() {return exemplaresDisponiveis;}

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {this.exemplaresDisponiveis = exemplaresDisponiveis;}

    public String getCategoria() {return categoria;}

    public void setCategoria(String categoria) {this.categoria = categoria;} 
    
    // public abstract void emprestarLivro(Usuario usuario);

    // public abstract void devolverLivro();
}
