package inter;

public class LivroRomance extends Livro{
    private String tipoRomance;
    
    public LivroRomance(int codigo, String titulo, String autor, int anoPublicacao, int exemplaresDisponiveis, String categoria, String tipoRomance) {
        super(codigo, titulo, autor, anoPublicacao, exemplaresDisponiveis, categoria);
        this.tipoRomance = tipoRomance;
    }

    public String getTipoRomance() {
        return tipoRomance;
    }

    public void setTipoRomance(String tipoAssustador) {
        this.tipoRomance = tipoAssustador;
    }

    @Override
    public String toString() {
        return "\nLivroRomance [" +
        "codigo=" + super.getCodigo() + 
        ", titulo=" + super.getTitulo() + 
        ", autor=" + super.getAutor() + 
        ", anoPublicação=" + super.getAnoPublicacao() + 
        ", disponiveis=" + super.getExemplaresDisponiveis() + 
        ", categoria=" + super.getCategoria() + 
        ", tipoRomance=" + tipoRomance + "";
    }
}