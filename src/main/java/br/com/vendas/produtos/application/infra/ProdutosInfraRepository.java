package br.com.vendas.produtos.application.infra;

import br.com.vendas.produtos.application.handler.APIException;
import br.com.vendas.produtos.application.repository.ProdutosRepository;
import br.com.vendas.produtos.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutosInfraRepository implements ProdutosRepository{
    private final ProdutoSpringDataJPARepository produtoSpringDataJPARepository;
    @Override
    public Produto salva(Produto produtos) {
        log.info("[start] ProdutosInfraRepository - salva");
        try {
            produtoSpringDataJPARepository.save(produtos);
        } catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados Duplicados", e);
        }
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
    public Produto buscaProdutosPorNome(String nome) {
        log.info("[start] ProdutosInfraRepository - buscaProdutosPorNome");
        Produto produto = (Produto) produtoSpringDataJPARepository.findByNome(nome)
                        .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Produto não encontrado"));
        log.info("[finish] ProdutosInfraRepository - buscaProdutosPorNome");
        return produto;
    }
    @Override
    public void deleteProduto(Produto produto) {
        log.info("[start] ProdutosInfraRepository - deleteProduto");
        produtoSpringDataJPARepository.delete(produto);
        log.info("[finish] ProdutosInfraRepository - deleteProduto");
    }
}
