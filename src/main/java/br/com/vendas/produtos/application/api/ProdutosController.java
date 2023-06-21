package br.com.vendas.produtos.application.api;

import br.com.vendas.produtos.application.service.ProdutosService;
import br.com.vendas.produtos.domain.Produto;
import com.google.gson.Gson;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@Log4j2
@RequiredArgsConstructor
public class ProdutosController {
    private final ProdutosService produtosService;

    @PostMapping(path = "/v2")
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProdutosResponse postProdutosString(@Valid @RequestBody String produtosRequest) {
        log.info("[start] ProdutosController - postProdutos");
        ProdutosRequest produtosRequestDTO = new Gson().fromJson(produtosRequest, ProdutosRequest.class);
        ProdutosResponse produtoCriado = produtosService.criaProduto(produtosRequestDTO);
        log.info("[finish] ProdutosController - postProdutos");
        return produtoCriado;
    }
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProdutosResponse postProdutos(@Valid @RequestBody ProdutosRequest produtosRequest) {
        log.info("[start] ProdutosController - postProdutos");
        log.info("ProdutoRequest em Json {}", new Gson().toJson(produtosRequest));
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
// WebHook

    @GetMapping("/{id}")
    public ResponseEntity<String> getProdutoById(@PathVariable int id) {
        log.info("[start] ProdutosController - getProdutoById");
        Logger logger = LogManager.getLogger(ProdutosController.class);

        Produto produto = produtosService.getProdutoById(id);

        if (produto == null) {
            logger.info("Produto com ID {} não encontrado", id);
            return ResponseEntity.notFound().build();
        }
        Gson gson = new Gson();
        String json = gson.toJson(produto);
        logger.info("Produto com ID {} encontrado: {}", id, json);
        log.info("[finish] ProdutosController - getProdutoById");
        // Retorne a resposta com o JSON
        return ResponseEntity.ok(json);
    }
}

