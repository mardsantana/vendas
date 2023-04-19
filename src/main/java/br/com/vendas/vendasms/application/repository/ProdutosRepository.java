package br.com.vendas.vendasms.application.repository;

import br.com.vendas.vendasms.domain.Produtos;
import org.springframework.stereotype.Repository;


public interface ProdutosRepository {

    Produtos salva(Produtos produtos);
}
