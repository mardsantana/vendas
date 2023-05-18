package br.com.vendas.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VendasProdutosApplication extends SpringBootServletInitializer {
	
	public String getHomeTest() {
		return "Vendas de Produtos diversos - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasProdutosApplication.class, args);
	}

}
