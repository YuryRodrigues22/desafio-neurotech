package com.br.product.document;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class AppDocument {
	
	@Bean
	public OpenAPI configOpenApi() {
		return new OpenAPI().info(
				new Info().description("Documentação do projeto Neurotech")
				.version("1.0.0")
				.title("Documentação API"));
	}

}
