package br.com.vendas.produtos.application.api;

import jakarta.persistence.Column;
import lombok.Data;


import java.time.LocalDate;


@Data
public class ProdutosRequest {
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Integer quantidadeMinima;
    @Column(nullable = false)
    private Integer quantidadeMaxima;
}
