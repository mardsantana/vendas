package br.com.vendas.produtos.application.service;

import br.com.vendas.produtos.application.api.ProdutoDetailResponse;
import br.com.vendas.produtos.application.api.ProdutoListResponse;
import br.com.vendas.produtos.application.api.ProdutosRequest;
import br.com.vendas.produtos.application.api.ProdutosResponse;

import java.util.List;
import java.util.UUID;

public interface ProdutosService {
    ProdutosResponse criaProduto(ProdutosRequest produtosRequest);
    List<ProdutoListResponse> buscaProdutosGerais();
    ProdutoDetailResponse buscaProdutosPorID(UUID idProduto);
    void deleteProdutoPorID(UUID idProduto);
}
