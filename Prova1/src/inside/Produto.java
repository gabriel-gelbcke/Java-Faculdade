package inside;

public class Produto {

    private String NomeProduto;
    private int PrecoProduto;
    private int QtdProduto;
    private int Vendidos;
    private int erro;

    //// NomeProduto////
    public String getNomeProduto() {

        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {

        this.NomeProduto = NomeProduto;
    }

    //// PrecoProduto////
    public int getPrecoProduto() {

        return PrecoProduto;
    }

    public void setPrecoProduto(int PrecoProduto) {

        this.PrecoProduto = PrecoProduto;
    }

    //// QtdProduto////
    public int getQtdProduto() {

        return QtdProduto;
    }

    public void setQtdProduto(int QtdProduto) {

        this.QtdProduto = QtdProduto;
    }

    //// Vendidos////
    public int getVendidos() {

        return Vendidos;
    }

    //// Erro////
    public int getErro() {

        return erro;
    }

    //// VenderProduto////
    public void VenderProduto(int QtdVender) {
        int QtdProduto2 = this.QtdProduto;
        this.Vendidos = QtdVender;

        this.QtdProduto = QtdProduto - QtdVender;

        if (QtdProduto < 0) {
            this.QtdProduto = QtdProduto2;
            this.erro = 1;
        } else {
            this.erro = 0;
        }
    }
}