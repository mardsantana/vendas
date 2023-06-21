package br.com.vendas.produtos.application.api;

import br.com.vendas.produtos.domain.Produto;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class ProdutoDetailResponse {
    private UUID idProduto;
    private String nome;
    private String descricao;
    private Integer quantidadeMinima;
    private Integer quantidadeMaxima;
//    private LocalDate criadoEm;

    public ProdutoDetailResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.quantidadeMinima = produto.getQuantidadeMinima();
        this.quantidadeMaxima = produto.getQuantidadeMaxima();
//        this.criadoEm = produto.getCriadoEm();
    }
}
