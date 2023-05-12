package br.com.vendas.vendasms.application.repository;

import br.com.vendas.vendasms.domain.Produto;

import java.util.List;


public interface ProdutosRepository {

    Produto salva(Produto produtos);
    List<Produto> buscaProdutosGerais();
    Produto buscaProdutosPorID(Long idProduto);
    void deleteProduto(Produto produto);
}
