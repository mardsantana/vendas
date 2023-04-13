package br.com.vendas.vendasms.application.api;

import br.com.vendas.vendasms.application.service.ProdutosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

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
                ProdutosResponse produtoChamado = produtosService.chamaProduto(produtosRequest);
                log.info("[finish] ProdutosController - postProdutos");
                return produtoChamado;
            }
        }

