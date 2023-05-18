package br.com.vendas.produtos.application.service;

import br.com.vendas.produtos.application.api.ProdutoDetailResponse;
import br.com.vendas.produtos.application.api.ProdutoListResponse;
import br.com.vendas.produtos.application.api.ProdutosRequest;
import br.com.vendas.produtos.application.api.ProdutosResponse;
import br.com.vendas.produtos.application.repository.ProdutosRepository;
import br.com.vendas.produtos.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutosApplicationService implements ProdutosService{
    private final ProdutosRepository produtosRepository;
    @Override
    public ProdutosResponse criaProduto(ProdutosRequest produtosRequest) {
        log.info("[start] ProdutosApplicationService - criaProduto");
        Produto produtos = produtosRepository.salva(new Produto(produtosRequest));
        log.info("[finish] ProdutosApplicationService - criaProduto");
        return ProdutosResponse.builder().idProdutos(produtos.getIdProduto()).build();
    }
    @Override
    public List<ProdutoListResponse> buscaProdutosGerais() {
        log.info("[start] ProdutosApplicationService - buscaProdutosGerais");
        List<Produto> produtos = produtosRepository.buscaProdutosGerais();
        log.info("[finish] ProdutosApplicationService - buscaProdutosGerais");
        return ProdutoListResponse.converte(produtos);
    }
    @Override
    public ProdutoDetailResponse buscaProdutosPorID(UUID idProduto) {
        log.info("[start] ProdutoApplicationService - buscaProdutosPorID");
        Produto produto = produtosRepository.buscaProdutosPorID(idProduto);
        log.info("[finish] ProdutoApplicationService - buscaProdutosPorID");
        return new ProdutoDetailResponse(produto);
    }
    @Override
    public void deleteProdutoPorID(UUID idProduto) {
        log.info("[start] ProdutosApplicationService - deleteProdutoPorID");
        Produto produto = produtosRepository.buscaProdutosPorID(idProduto);
        produtosRepository.deleteProduto(produto);
        log.info("[start] ProdutosApplicationService - deleteProdutoPorID");
    }
}
