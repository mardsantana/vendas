package br.com.vendas.vendasms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class VendasProdutosApplication {
	
	public String getHomeTest() {
		return "Vendas de Prutos diversos - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasProdutosApplication.class, args);
	}

}
