package inter;

public class LivroTerror extends Livro {
    private String tipoTerror;
    
    public LivroTerror(int codigo, String titulo, String autor, int anoPublicacao, int exemplaresDisponiveis, String categoria, String tipoTerror) {
        super(codigo, titulo, autor, anoPublicacao, exemplaresDisponiveis, categoria);
        this.tipoTerror = tipoTerror;
    }

    public String getTipoTerror() {
        return tipoTerror;
    }

    public void setTipoTerror(String tipoAssustador) {
        this.tipoTerror = tipoAssustador;
    }

    @Override
    public String toString() {
        return "\nLivroTerror [" +
        "codigo=" + super.getCodigo() + 
        ", titulo=" + super.getTitulo() + 
        ", autor=" + super.getAutor() + 
        ", anoPublicação=" + super.getAnoPublicacao() + 
        ", disponiveis=" + super.getExemplaresDisponiveis() + 
        ", categoria=" + super.getCategoria() + 
        ", tipoTerror=" + tipoTerror + "";
    }
}