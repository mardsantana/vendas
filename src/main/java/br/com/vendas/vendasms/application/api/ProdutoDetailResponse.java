package br.com.vendas.vendasms.application.api;

import br.com.vendas.vendasms.domain.Produto;
import lombok.Value;

import java.time.LocalDate;

@Value
public class ProdutoDetailResponse {
    private Long idProduto;
    private String nome;
    private String descricao;
    private Integer quantidadeMinima;
    private Integer quantidadeMaxima;
    private LocalDate criadoEm;

    public ProdutoDetailResponse(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.quantidadeMinima = produto.getQuantidadeMinima();
        this.quantidadeMaxima = produto.getQuantidadeMaxima();
        this.criadoEm = produto.getCriadoEm();
    }
}
