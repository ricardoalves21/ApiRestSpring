package com.algaworks.algalog.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI()
				.components(new Components())
				.info(new Info().title("Aplicação de Integração da API AlgaWorks")
						.description("Esta é a documentação de uma API REST da AlgaWorks"));
	}

}
