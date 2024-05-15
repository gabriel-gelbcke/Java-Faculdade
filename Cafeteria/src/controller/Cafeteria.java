package controller;

import java.util.ArrayList;
import java.util.List;

import models.Insumo.*;
import models.Pessoa.*;
import models.Produto.*;
import models.Venda.*;

public class Cafeteria {
    List<Produto> produtos;
    int codigoProduto;

    List<Insumo> insumos;
    int codigoInsumo = 0;

    List<Pessoa> pessoas;
    int codigoPessoa = 0;

    List<Venda> vendas;
    int codigoVendas = 0;

    public Cafeteria() {
        produtos = new ArrayList<>();
        insumos = new ArrayList<>();
        pessoas = new ArrayList<>();
        vendas = new ArrayList<>();
    }

////// ------------ PRODUTO ------------ //////

    //////// ADICIONAR PRODUTO ////////
    public void AdicionarProduto(Produto novoProduto) {
        int novoCodigo = codigoProduto + 1;

        if (BuscarProduto(novoProduto.getCodigoProduto()) == null) {
            novoProduto.setCodigoProduto(novoCodigo);
            codigoProduto = novoCodigo;
            produtos.add(novoProduto);
            System.out.println(novoProduto.getNomeProduto() + ", com código: " + novoProduto.getCodigoProduto()
                    + " cadastrado com sucesso!");
        } else {
            System.out.println("Produto já cadastrado com esse id! (" + novoProduto.getCodigoProduto() + ")");
        }
    }

    //////// LISTAR PRODUTO ////////
    public void ListarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("Não há produtos cadastradas!");
        } else {
            System.out.println(produtos);
        }
    }

    //////// REMOVER PRODUTO ////////
    public void RemoverProduto(Produto removerProduto) {
        if (BuscarProduto(removerProduto.getCodigoProduto()) != null) {
            produtos.remove(removerProduto);
            System.out.println(removerProduto.getNomeProduto() + ", com código: " + removerProduto.getCodigoProduto()
                    + " removido com sucesso!");
        } else {
            System.out.println("Produto não encontrada!");
        }
    }

    //////// BUSCAR PRODUTO ////////
    public Produto BuscarProduto(int idProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto() == idProduto) {
                return produto;
            }
        }
        return null;
    }

////// ------------ INSUMO ------------ //////

////// ------------ PESSOA ------------ //////

////// ------------ VENDA ------------ //////
}