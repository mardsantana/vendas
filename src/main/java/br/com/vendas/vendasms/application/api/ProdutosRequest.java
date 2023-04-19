package br.com.vendas.vendasms.application.api;

import jakarta.persistence.Column;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
public class ProdutosRequest {
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
}
