package br.com.vendas.produtos.application.api;

import br.com.vendas.produtos.application.service.ProdutosService;
import br.com.vendas.produtos.domain.Produto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
@Log4j2
@RequiredArgsConstructor
public class ProdutosController {
    private final ProdutosService produtosService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProdutosResponse postProdutos(@Valid @RequestBody ProdutosRequest produtosRequest) {
        log.info("[start] ProdutosController - postProdutos");
        ProdutosResponse produtoCriado = produtosService.criaProduto(produtosRequest);
        log.info("[finish] ProdutosController - postProdutos");
        return produtoCriado;
    }
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ProdutoListResponse> getProdutoGeral(){
        log.info("[start] ProdutosController - getProdutoGeral");
        List<ProdutoListResponse> produto = produtosService.buscaProdutosGerais();
        log.info("[finish] ProdutosController - getProdutoGeral");
        return produto;
    }
    @GetMapping(value = "/{nome}")
    @ResponseStatus(code = HttpStatus.OK)
    ProdutoDetailResponse getProdutoPorNome(@PathVariable String nome){
        log.info("[start] ProdutosController - getProdutoPorNome");
        log.info("[nome]{}", nome);
        ProdutoDetailResponse produtoDetail = produtosService.buscaProdutosPorNome(nome);
        log.info("[finish] ProdutosController - getProdutoPorNome");
        return produtoDetail;
    }
    @DeleteMapping(value = "/{nome}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteProdutoPorNome(@PathVariable String nome) {
        log.info("[start] ProdutosController - deleteProdutoPorNome");
        log.info("[nome]{}", nome);
        produtosService.deleteProdutoPorNome(nome);
        log.info("[finish] ProdutosController - deleteProdutoPorNome");
    }
}

