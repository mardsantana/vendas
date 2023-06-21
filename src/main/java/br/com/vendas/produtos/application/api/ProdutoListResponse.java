package br.com.vendas.produtos.application.api;

import br.com.vendas.produtos.domain.Produto;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ProdutoListResponse {
    private UUID idProduto;
    private String nome;
    private String descricao;
    private Integer quantidadeMinima;
    private Integer quantidadeMaxima;
//    private LocalDate criadoEm;
    public static List<ProdutoListResponse> converte(List<Produto> produtos) {
        return produtos.stream()
                .map(ProdutoListResponse::new)
                .collect(Collectors.toList());
    }
    private ProdutoListResponse(Produto produto){
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.quantidadeMinima = produto.getQuantidadeMinima();
        this.quantidadeMaxima = produto.getQuantidadeMaxima();
//        this.criadoEm = produto.getCriadoEm();
    }
}
