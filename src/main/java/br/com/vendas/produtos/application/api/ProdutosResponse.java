package br.com.vendas.produtos.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class ProdutosResponse {
    private UUID idProdutos;
}
