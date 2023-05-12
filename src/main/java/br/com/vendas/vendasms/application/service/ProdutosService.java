package br.com.vendas.vendasms.application.service;

import br.com.vendas.vendasms.application.api.ProdutoDetailResponse;
import br.com.vendas.vendasms.application.api.ProdutoListResponse;
import br.com.vendas.vendasms.application.api.ProdutosRequest;
import br.com.vendas.vendasms.application.api.ProdutosResponse;

import java.util.List;

public interface ProdutosService {
    ProdutosResponse criaProduto(ProdutosRequest produtosRequest);
    List<ProdutoListResponse> buscaProdutosGerais();
    ProdutoDetailResponse buscaProdutosPorID(Long idProduto);
    void deleteProdutoPorID(Long idProduto);
}
