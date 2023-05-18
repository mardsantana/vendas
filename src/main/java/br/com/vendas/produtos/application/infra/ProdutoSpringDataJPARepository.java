package br.com.vendas.produtos.application.infra;

import br.com.vendas.produtos.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, UUID> {
}
