package inter;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutos {
    List <Produto> produtos;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto NovoProduto){
        if(buscarProduto(NovoProduto.getCodigo()) == null){
            produtos.add(NovoProduto);
            System.out.println(NovoProduto.getNome() + " cadastrado com sucesso!");
        }else{
            System.out.println(NovoProduto.getNome() + " já está cadastrado!.");
        }
    }

    public void remover(Produto ProdutoApagar){
        if(buscarProduto(ProdutoApagar.getCodigo()) != null){
            produtos.remove(ProdutoApagar);
            System.out.println(ProdutoApagar.getNome() + " removido com sucesso!");
        }else{
            System.out.println(ProdutoApagar.getNome() + " não econtrado!");
        }
    }

    public Produto buscarProduto(int cod) {
        for (Produto produt : produtos) {
            if (produt.getCodigo() == cod) {
                return produt;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if(produtos.size() == 0){
            return "Não há prudutos cadastrados!";
        }else{
            return "Produtos = " + produtos + "";
        }
            
    }
}