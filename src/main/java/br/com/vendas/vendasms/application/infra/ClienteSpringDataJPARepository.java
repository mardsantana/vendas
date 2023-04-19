package br.com.vendas.vendasms.application.infra;

import br.com.vendas.vendasms.domain.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteSpringDataJPARepository extends JpaRepository<Produtos, Long> {
}
