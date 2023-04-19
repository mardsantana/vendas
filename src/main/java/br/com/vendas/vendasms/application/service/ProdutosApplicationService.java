package br.com.vendas.vendasms.application.service;

import br.com.vendas.vendasms.application.api.ProdutosRequest;
import br.com.vendas.vendasms.application.api.ProdutosResponse;
import br.com.vendas.vendasms.application.repository.ProdutosRepository;
import br.com.vendas.vendasms.domain.Produtos;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutosApplicationService implements ProdutosService{
    private final ProdutosRepository produtosRepository;
    @Override
    public ProdutosResponse criaProduto(ProdutosRequest produtosRequest) {
        log.info("[start] ProdutosApplicationService - criaProduto");
        Produtos produtos = produtosRepository.salva(new Produtos(produtosRequest));
        log.info("[finish] ProdutosApplicationService - criaProduto");
        return ProdutosResponse.builder().idProdutos(produtos.getIdProdutos()).build();
    }


}
