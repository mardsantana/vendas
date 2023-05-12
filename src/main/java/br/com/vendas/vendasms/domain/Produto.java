package br.com.vendas.vendasms.domain;

import java.time.LocalDate;

import br.com.vendas.vendasms.application.api.ProdutosRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
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
