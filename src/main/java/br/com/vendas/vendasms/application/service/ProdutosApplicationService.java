package br.com.vendas.vendasms.application.service;

import br.com.vendas.vendasms.application.api.ProdutosRequest;
import br.com.vendas.vendasms.application.api.ProdutosResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutosApplicationService implements ProdutosService{
    @Override
    public ProdutosResponse chamaProduto(ProdutosRequest produtosRequest) {
        log.info("[start] ProdutosApplicationService - chamaProduto");
        log.info("[finish] ProdutosApplicationService - chamaProduto");
        return null;
    }
}
