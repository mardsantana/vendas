package br.com.vendas.vendasms.application.infra;

import br.com.vendas.vendasms.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, Long> {
}
