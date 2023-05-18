package br.com.vendas.produtos.domain;

import java.time.LocalDate;
import java.util.UUID;

import br.com.vendas.produtos.application.api.ProdutosRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idProduto;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Integer quantidadeMinima;
    @Column(nullable = false)
    private Integer quantidadeMaxima;
    @Column(nullable = false)
    private LocalDate criadoEm;

    public Produto(ProdutosRequest produtosRequest) {
        this.nome = produtosRequest.getNome();
        this.descricao =  produtosRequest.getDescricao();
        this.quantidadeMinima =  produtosRequest.getQuantidadeMinima();
        this.quantidadeMaxima =  produtosRequest.getQuantidadeMaxima();
        this.criadoEm = produtosRequest.getCriadoEm();
    }
}
