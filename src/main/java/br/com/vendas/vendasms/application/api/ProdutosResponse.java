package br.com.vendas.vendasms.application.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProdutosResponse {
    private Long idProdutos;
}
