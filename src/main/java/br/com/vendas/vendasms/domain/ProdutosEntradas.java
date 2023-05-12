//package br.com.vendas.vendasms.domain;
//
//import java.time.LocalDateTime;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import lombok.Getter;
//
//@Getter
//@Entity
//public class ProdutosEntradas {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@ManyToOne
//	@JoinColumn(nullable = false)
//	private Produto produto;
//	@Column(nullable = false)
//	private LocalDateTime dataEntrada;
//	@Column(nullable = false)
//	private Double precoUnidade;
//	@Column(nullable = false)
//	private Integer quantidade;
//
//}
