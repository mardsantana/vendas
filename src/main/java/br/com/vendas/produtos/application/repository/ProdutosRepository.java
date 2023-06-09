package br.com.vendas.produtos.application.repository;

import br.com.vendas.produtos.domain.Produto;

import java.util.List;
import java.util.UUID;


public interface ProdutosRepository {

    Produto salva(Produto produtos);
    List<Produto> buscaProdutosGerais();
    Produto buscaProdutosPorNome(String nome);
    void deleteProduto(Produto produto);
}
