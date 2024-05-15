import controller.Cafeteria;
import models.Produto.*;
import view.IFuncionario;

public class App {
    public static void main(String[] args) throws Exception {
        Cafeteria cafeteria = new Cafeteria();

        Produto leite = new Produto("Leite Integral", 15, 8.98);

        Produto leite2 = new Produto("Leite Desnatado", 30, 12.98);

        Produto cafe = new Produto("Café Preto", 9, 4.98);

        System.out.println(cafeteria);

        cafeteria.AdicionarProduto(leite);
        cafeteria.AdicionarProduto(leite2);
        cafeteria.AdicionarProduto(cafe);

        cafeteria.AdicionarProduto(cafe);

        cafeteria.RemoverProduto(cafe);

        cafeteria.AdicionarProduto(cafe);

        cafeteria.RemoverProduto(cafe);

        cafeteria.AdicionarProduto(cafe);

        cafeteria.ListarProdutos();

        IFuncionario.main();
    }
}   