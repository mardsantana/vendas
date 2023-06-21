package br.com.vendas.produtos.application.service;

import br.com.vendas.produtos.application.api.*;
import br.com.vendas.produtos.domain.Produto;

import java.util.List;

public interface ProdutosService {
    ProdutosResponse criaProduto(ProdutosRequest produtosRequest);
    List<ProdutoListResponse> buscaProdutosGerais();
    ProdutoDetailResponse buscaProdutosPorNome(String nome);
    void deleteProdutoPorNome(String nome);
    Produto getProdutoById(int id);
}
