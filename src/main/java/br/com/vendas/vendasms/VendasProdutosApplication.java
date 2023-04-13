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
@RestController
@RequestMapping("/")
public class VendasProdutosApplication extends SpringBootServletInitializer {
	
	public String getHomeTest() {
		return "Vendas de Produtos diversos - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasProdutosApplication.class, args);
	}

	@Configuration
	public class WebMvcConfig implements WebMvcConfigurer {
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
		}

		@Bean
		public InternalResourceViewResolver resolver() {
			InternalResourceViewResolver resolver = new InternalResourceViewResolver();
			resolver.setPrefix("/WEB-INF/views/");
			resolver.setSuffix(".jsp");
			return resolver;
		}
	}

}
