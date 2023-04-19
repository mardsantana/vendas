package br.com.vendas.vendasms.application.service;

import br.com.vendas.vendasms.application.api.ProdutosRequest;
import br.com.vendas.vendasms.application.api.ProdutosResponse;

public interface ProdutosService {
     ProdutosResponse criaProduto(ProdutosRequest produtosRequest);
}
