package br.com.vendas.produtos.domain;

import java.time.LocalDate;
import java.util.UUID;

import br.com.vendas.produtos.application.api.ProdutosRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduto;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
    private Integer quantidadeMinima;
    @NotNull
    private Integer quantidadeMaxima;
    @NotNull
//    private LocalDate criadoEm;

    public Produto(ProdutosRequest produtosRequest) {
        this.nome = produtosRequest.getNome();
        this.descricao =  produtosRequest.getDescricao();
        this.quantidadeMinima =  produtosRequest.getQuantidadeMinima();
        this.quantidadeMaxima =  produtosRequest.getQuantidadeMaxima();
//        this.criadoEm = produtosRequest.getCriadoEm();
    }
}
