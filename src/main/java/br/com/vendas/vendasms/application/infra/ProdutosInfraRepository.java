package br.com.vendas.vendasms.application.infra;

import br.com.vendas.vendasms.application.repository.ProdutosRepository;
import br.com.vendas.vendasms.domain.Produtos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutosInfraRepository implements ProdutosRepository{
    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
    @Override
    public Produtos salva(Produtos produtos) {
        log.info("[start] ProdutosInfraRepository - salva");
        clienteSpringDataJPARepository.save(produtos);
        log.info("[finish] ProdutosInfraRepository - salva");
        return produtos;
    }
}
