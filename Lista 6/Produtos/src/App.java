import inter.CadastroProdutos;
import inter.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        CadastroProdutos cadastro = new CadastroProdutos();
        Produto prod = new Produto(1, "Celular", 1200);
        Produto prod2 = new Produto(2, "Mouse", 1200);
        Produto prod3 = new Produto(3, "Mesa", 1200);

        System.out.println(cadastro);

        cadastro.adicionarProduto(prod);
        cadastro.adicionarProduto(prod2);
        cadastro.adicionarProduto(prod3);

        System.out.println(cadastro);

        cadastro.adicionarProduto(prod);

        System.out.println(cadastro);

        cadastro.remover(prod);

        System.out.println(cadastro);
    }
}
