package br.com.vendas.vendasms.application.api;

import br.com.vendas.vendasms.application.service.ProdutosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/produtos")
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
        }

