package br.com.vendas.vendasms.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;


@Getter
@Entity
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProdutos;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Integer quantidadeMinima;
    @Column(nullable = false)
    private Integer quantidadeMaxima;
    @Column(nullable = false)
    private LocalDateTime criadoEm;

}
