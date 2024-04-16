public class Produto {
    private String nomeProduto;
    private int codigo;
    private int valor;
    private int qtd;

    public Produto(String nomeProduto, int codigo, int valor, int qtd) {
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Produto=" + nomeProduto + ", codigo=" + codigo + ", valor=" + valor + ", qtd=" + qtd + "]";
    }
    
}
