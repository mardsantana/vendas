package br.com.vendas.vendasms.application.infra;

import br.com.vendas.vendasms.application.repository.ProdutosRepository;
import br.com.vendas.vendasms.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutosInfraRepository implements ProdutosRepository{
    private final ProdutoSpringDataJPARepository produtoSpringDataJPARepository;
    @Override
    public Produto salva(Produto produtos) {
        log.info("[start] ProdutosInfraRepository - salva");
        produtoSpringDataJPARepository.save(produtos);
        log.info("[finish] ProdutosInfraRepository - salva");
        return produtos;
    }
    @Override
    public List<Produto> buscaProdutosGerais() {
        log.info("[start] ProdutosInfraRepository - buscaProdutosGerais");
        List<Produto> produtosGerais = produtoSpringDataJPARepository.findAll();
        log.info("[finish] ProdutosInfraRepository - buscaProdutosGerais");
        return produtosGerais;
    }
    @Override
    public Produto buscaProdutosPorID(Long idProduto) {
        log.info("[start] ProdutosInfraRepository - buscaProdutosPorID");
        Produto produto = produtoSpringDataJPARepository.findById(idProduto)
                        .orElseThrow(() -> new RuntimeException("Produto não Encotrado"));
        log.info("[finish] ProdutosInfraRepository - buscaProdutosPorID");
        return produto;
    }
    @Override
    public void deleteProduto(Produto produto) {
        log.info("[start] ProdutosInfraRepository - deleteProduto");
        produtoSpringDataJPARepository.delete(produto);
        log.info("[finish] ProdutosInfraRepository - deleteProduto");
    }
}
