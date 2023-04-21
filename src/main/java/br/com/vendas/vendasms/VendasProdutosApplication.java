package br.com.vendas.vendasms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class VendasProdutosApplication extends SpringBootServletInitializer {
	
	public String getHomeTest() {
		return "Vendas de Produtos diversos - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasProdutosApplication.class, args);
	}

}
